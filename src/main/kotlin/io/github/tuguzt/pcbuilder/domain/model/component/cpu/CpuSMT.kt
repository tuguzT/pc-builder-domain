package io.github.tuguzt.pcbuilder.domain.model.component.cpu

import kotlinx.serialization.Serializable

/**
 * If [CPU] supports simultaneous multithreading (or SMT).
 */
@Serializable
public enum class CpuSMT {
    SMT,
    NonSMT,
}
