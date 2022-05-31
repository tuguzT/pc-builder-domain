package io.github.tuguzt.pcbuilder.domain.model.component.psu

import kotlinx.serialization.Serializable

/**
 * Modularity type of the [power supply unit][PowerSupplyUnit].
 */
@Serializable
public enum class PsuModularity {
    Full,
    Semi,
}
