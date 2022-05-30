package io.github.tuguzt.pcbuilder.domain.model.component.memory

import kotlinx.serialization.Serializable

/**
 * Enum represents if the memory chip uses an Error Correction Code (ECC)
 * to detect and correct n-bit data corruption which occurs in [memory][Memory].
 */
@Serializable
public enum class MemoryECCType {
    ECC,
    NonECC,
}
