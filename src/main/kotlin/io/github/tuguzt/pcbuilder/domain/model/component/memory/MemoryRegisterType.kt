package io.github.tuguzt.pcbuilder.domain.model.component.memory

import kotlinx.serialization.Serializable

/**
 * Enum represents if the memory have a *register*
 * between the `DRAM` modules and the system's memory controller.
 *
 * @see Memory
 */
@Serializable
public enum class MemoryRegisterType {
    Registered,
    Unbuffered,
}
