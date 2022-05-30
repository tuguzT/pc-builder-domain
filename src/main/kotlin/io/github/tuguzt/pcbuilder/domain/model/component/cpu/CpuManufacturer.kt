package io.github.tuguzt.pcbuilder.domain.model.component.cpu

import kotlinx.serialization.Serializable

/**
 * Enum represents main [CPU] manufacturers.
 */
@Serializable
public enum class CpuManufacturer {
    AMD,
    Intel,
}
