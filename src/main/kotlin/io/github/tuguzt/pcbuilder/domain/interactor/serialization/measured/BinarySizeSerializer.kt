package io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured

import io.nacular.measured.units.BinarySize

public object BinarySizeSerializer : UnitsBaseSerializer<BinarySize>("binary_size") {
    override val factory: (String, Double) -> BinarySize = ::BinarySize
}
