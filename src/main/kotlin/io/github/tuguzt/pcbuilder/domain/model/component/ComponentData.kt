@file:UseSerializers(MeasureSerializer::class, MassSerializer::class)

package io.github.tuguzt.pcbuilder.domain.model.component

import io.github.tuguzt.pcbuilder.domain.interactor.randomNanoId
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.MassSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.MeasureSerializer
import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.nacular.measured.units.Mass
import io.nacular.measured.units.Measure
import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

/**
 * Serializable data of [component][Component].
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
public data class ComponentData(
    @EncodeDefault override val id: NanoId = randomNanoId(),
    override val name: String,
    override val description: String,
    override val weight: Measure<Mass>,
    override val size: Size,
) : Component
