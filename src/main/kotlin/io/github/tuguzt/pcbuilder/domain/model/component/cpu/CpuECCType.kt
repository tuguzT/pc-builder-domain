package io.github.tuguzt.pcbuilder.domain.model.component.cpu

import kotlinx.serialization.Serializable

/**
 * Enum represents if the [CPU] supports an Error Correction Code (ECC)
 * to detect and correct n-bit data corruption which occurs in memory.
 */
@Serializable
public enum class CpuECCType {
    ECC,
    NonECC,
}
