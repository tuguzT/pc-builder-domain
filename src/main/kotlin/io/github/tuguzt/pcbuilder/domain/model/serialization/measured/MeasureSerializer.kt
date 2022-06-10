package io.github.tuguzt.pcbuilder.domain.model.serialization.measured

import io.nacular.measured.units.Measure
import io.nacular.measured.units.Units
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.descriptors.element
import kotlinx.serialization.encoding.*

/**
 * Serializer class for [measures][Measure] with a [unit][Units] type.
 */
public class MeasureSerializer<T : Units>(private val dataSerializer: KSerializer<T>) : KSerializer<Measure<T>> {
    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("measure") {
        element<Double>("amount")
        element("units", dataSerializer.descriptor)
    }

    override fun serialize(encoder: Encoder, value: Measure<T>): Unit = encoder.encodeStructure(descriptor) {
        encodeDoubleElement(descriptor, 0, value.amount)
        encodeSerializableElement(descriptor, 1, dataSerializer, value.units)
    }

    override fun deserialize(decoder: Decoder): Measure<T> = decoder.decodeStructure(descriptor) {
        val (amount, units) = kotlin.run {
            var amount = 0.0
            var units: T? = null
            while (true) {
                when (val index = decodeElementIndex(descriptor)) {
                    0 -> amount = decodeDoubleElement(descriptor, index)
                    1 -> units = decodeSerializableElement(descriptor, index, dataSerializer)
                    CompositeDecoder.DECODE_DONE -> break
                    else -> error("Unexpected index: $index")
                }
            }
            amount to requireNotNull(units)
        }
        Measure(amount, units)
    }
}
