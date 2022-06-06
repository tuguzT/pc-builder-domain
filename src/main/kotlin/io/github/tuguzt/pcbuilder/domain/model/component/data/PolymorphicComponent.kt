package io.github.tuguzt.pcbuilder.domain.model.component.data

import io.github.tuguzt.pcbuilder.domain.model.component.Component
import kotlinx.serialization.Serializable

/**
 * Special class for polymorphic [component][Component] serialization out of the box.
 */
@Serializable
public sealed class PolymorphicComponent : Component {
    abstract override val manufacturer: ManufacturerData
}
