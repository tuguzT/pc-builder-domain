package io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.compound

import io.nacular.measured.units.InverseUnits
import io.nacular.measured.units.Units
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.*

/**
 * Serializer class for [inverse units][InverseUnits].
 */
public class InverseUnitsSerializer<T : Units>(private val serializer: KSerializer<T>) : KSerializer<InverseUnits<T>> {
    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("inverse_units") {
        element("unit", serializer.descriptor)
    }

    override fun serialize(encoder: Encoder, value: InverseUnits<T>): Unit = encoder.encodeStructure(descriptor) {
        encodeSerializableElement(descriptor, 0, serializer, value.unit)
    }

    override fun deserialize(decoder: Decoder): InverseUnits<T> = decoder.decodeStructure(descriptor) {
        val unit = kotlin.run {
            var unit: T? = null
            while (true) {
                when (val index = decodeElementIndex(descriptor)) {
                    0 -> unit = decodeSerializableElement(descriptor, index, serializer)
                    CompositeDecoder.DECODE_DONE -> break
                    else -> error("Unexpected index: $index")
                }
            }
            requireNotNull(unit)
        }
        InverseUnits(unit)
    }
}
