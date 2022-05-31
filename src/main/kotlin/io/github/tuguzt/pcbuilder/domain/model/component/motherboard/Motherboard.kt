package io.github.tuguzt.pcbuilder.domain.model.component.motherboard

import io.github.tuguzt.pcbuilder.domain.model.component.Component

/**
 * Interface for all motherboards of PC.
 */
public interface Motherboard : Component {
    public val formFactor: MotherboardFormFactor
    // todo
}
