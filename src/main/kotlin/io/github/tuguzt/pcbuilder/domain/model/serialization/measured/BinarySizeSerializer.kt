package io.github.tuguzt.pcbuilder.domain.model.serialization.measured

import io.nacular.measured.units.BinarySize

/**
 * Serializer class for units of [binary size][BinarySize].
 */
public object BinarySizeSerializer : UnitsBaseSerializer<BinarySize>("binary_size") {
    override val factory: (String, Double) -> BinarySize = ::BinarySize
}
