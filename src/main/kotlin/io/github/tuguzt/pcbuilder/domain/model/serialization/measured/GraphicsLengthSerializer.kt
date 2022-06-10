package io.github.tuguzt.pcbuilder.domain.model.serialization.measured

import io.nacular.measured.units.GraphicsLength

/**
 * Serializer class for units of [graphics length][GraphicsLength].
 */
public object GraphicsLengthSerializer : UnitsBaseSerializer<GraphicsLength>("graphics_length") {
    override val factory: (String, Double) -> GraphicsLength = ::GraphicsLength
}
