package io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured

import io.nacular.measured.units.Units
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.descriptors.element
import kotlinx.serialization.encoding.*

/**
 * Base serializer class for simple [units][Units].
 */
public abstract class UnitsBaseSerializer<T : Units>(serialName: String) : KSerializer<T> {
    protected abstract val factory: (suffix: String, ratio: Double) -> T

    final override val descriptor: SerialDescriptor = buildClassSerialDescriptor(serialName) {
        element<String>("suffix")
        element<Double>("ratio")
    }

    final override fun serialize(encoder: Encoder, value: T): Unit = encoder.encodeStructure(descriptor) {
        encodeStringElement(descriptor, 0, value.suffix)
        encodeDoubleElement(descriptor, 1, value.ratio)
    }

    final override fun deserialize(decoder: Decoder): T = decoder.decodeStructure(descriptor) {
        val (suffix, ratio) = kotlin.run {
            var suffix: String? = null
            var ratio = 0.0
            while (true) {
                when (val index = decodeElementIndex(LengthSerializer.descriptor)) {
                    0 -> suffix = decodeStringElement(LengthSerializer.descriptor, index)
                    1 -> ratio = decodeDoubleElement(LengthSerializer.descriptor, index)
                    CompositeDecoder.DECODE_DONE -> break
                    else -> error("Unexpected index: $index")
                }
            }
            requireNotNull(suffix) to ratio
        }
        factory(suffix, ratio)
    }
}
