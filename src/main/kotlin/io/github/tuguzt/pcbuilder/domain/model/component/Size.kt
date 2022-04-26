@file:UseSerializers(MeasureSerializer::class, LengthSerializer::class)

package io.github.tuguzt.pcbuilder.domain.model.component

import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.LengthSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.MeasureSerializer
import io.nacular.measured.units.Length
import io.nacular.measured.units.Measure
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

/**
 * Data class that represents physical size of the PC component.
 */
@Serializable
public data class Size(
    val length: Measure<Length>,
    val width: Measure<Length>,
    val height: Measure<Length>,
)
