package io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.compound

import io.nacular.measured.units.Units
import io.nacular.measured.units.UnitsProduct
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.*

/**
 * Serializer class for [units product][UnitsProduct].
 */
public class UnitsProductSerializer<A : Units, B : Units>(
    private val serializerA: KSerializer<A>,
    private val serializerB: KSerializer<B>,
) : KSerializer<UnitsProduct<A, B>> {

    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("units_product") {
        element("first", serializerA.descriptor)
        element("second", serializerB.descriptor)
    }

    override fun serialize(encoder: Encoder, value: UnitsProduct<A, B>): Unit = encoder.encodeStructure(descriptor) {
        encodeSerializableElement(descriptor, 0, serializerA, value.first)
        encodeSerializableElement(descriptor, 1, serializerB, value.second)
    }

    override fun deserialize(decoder: Decoder): UnitsProduct<A, B> = decoder.decodeStructure(descriptor) {
        val (first, second) = kotlin.run {
            var first: A? = null
            var second: B? = null
            while (true) {
                when (val index = decodeElementIndex(descriptor)) {
                    0 -> first = decodeSerializableElement(descriptor, index, serializerA)
                    1 -> second = decodeSerializableElement(descriptor, index, serializerB)
                    CompositeDecoder.DECODE_DONE -> break
                    else -> error("Unexpected index: $index")
                }
            }
            requireNotNull(first) to requireNotNull(second)
        }
        UnitsProduct(first, second)
    }
}
