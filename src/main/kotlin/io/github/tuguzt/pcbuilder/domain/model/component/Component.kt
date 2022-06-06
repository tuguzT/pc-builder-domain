package io.github.tuguzt.pcbuilder.domain.model.component

import io.github.tuguzt.pcbuilder.domain.model.Identifiable
import io.github.tuguzt.pcbuilder.domain.model.NanoId

/**
 * Base interface for all PC components.
 */
public interface Component : Identifiable<NanoId> {
    public val name: String
    public val description: String
    public val weight: Weight
    public val size: Size
    public val manufacturer: Manufacturer
    public val imageUri: String?
    public val isFavorite: Boolean
}
