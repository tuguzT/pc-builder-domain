package io.github.tuguzt.pcbuilder.domain.model.component.memory

import kotlinx.serialization.Serializable

/**
 * Represents if the memory have a *register*
 * between the `DRAM` modules and the system's [memory][Memory] controller.
 */
@Serializable
public enum class MemoryRegisterType {
    Registered,
    Unbuffered,
}
