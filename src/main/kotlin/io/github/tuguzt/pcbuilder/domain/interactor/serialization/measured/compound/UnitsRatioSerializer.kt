package io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.compound

import io.nacular.measured.units.Units
import io.nacular.measured.units.UnitsRatio
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.*

/**
 * Serializer class for [units ratio][UnitsRatio].
 */
public class UnitsRatioSerializer<A : Units, B : Units>(
    private val serializerA: KSerializer<A>,
    private val serializerB: KSerializer<B>,
) : KSerializer<UnitsRatio<A, B>> {

    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("units_ratio") {
        element("numerator", serializerA.descriptor)
        element("denominator", serializerB.descriptor)
    }

    override fun serialize(encoder: Encoder, value: UnitsRatio<A, B>): Unit = encoder.encodeStructure(descriptor) {
        encodeSerializableElement(descriptor, 0, serializerA, value.numerator)
        encodeSerializableElement(descriptor, 1, serializerB, value.denominator)
    }

    override fun deserialize(decoder: Decoder): UnitsRatio<A, B> = decoder.decodeStructure(descriptor) {
        val (numerator, denominator) = kotlin.run {
            var numerator: A? = null
            var denominator: B? = null
            while (true) {
                when (val index = decodeElementIndex(descriptor)) {
                    0 -> numerator = decodeSerializableElement(descriptor, index, serializerA)
                    1 -> denominator = decodeSerializableElement(descriptor, index, serializerB)
                    CompositeDecoder.DECODE_DONE -> break
                    else -> error("Unexpected index: $index")
                }
            }
            requireNotNull(numerator) to requireNotNull(denominator)
        }
        UnitsRatio(numerator, denominator)
    }
}
