package io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured

import io.nacular.measured.units.GraphicsLength

public object GraphicsLengthSerializer : UnitsBaseSerializer<GraphicsLength>("graphics_length") {
    override val factory: (String, Double) -> GraphicsLength = ::GraphicsLength
}
