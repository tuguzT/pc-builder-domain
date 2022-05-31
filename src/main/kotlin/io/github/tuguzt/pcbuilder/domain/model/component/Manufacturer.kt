package io.github.tuguzt.pcbuilder.domain.model.component

import io.github.tuguzt.pcbuilder.domain.model.Identifiable
import io.github.tuguzt.pcbuilder.domain.model.NanoId

/**
 * PC [components][Component] manufacturer.
 */
public interface Manufacturer : Identifiable<NanoId> {
    public val name: String
    public val description: String
}
