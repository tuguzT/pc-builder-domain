package io.github.tuguzt.pcbuilder.domain.model.component.cases

import kotlinx.serialization.Serializable

/**
 * Type of the [case][Case].
 */
@Serializable
public sealed interface CaseType {
    /**
     * ATX [type][CaseType] of the [case][Case].
     */
    @Serializable
    public enum class ATX : CaseType {
        Desktop,
        FullTower,
        MidTower,
        MiniTower,
        TestBench,
    }

    /**
     * MicroATX [type][CaseType] of the [case][Case].
     */
    @Serializable
    public enum class MicroATX : CaseType {
        Desktop,
        MidTower,
        MiniTower,
        Slim,
    }

    /**
     * Mini ITX [type][CaseType] of the [case][Case].
     */
    @Serializable
    public enum class MiniITX : CaseType {
        Desktop,
        TestBench,
        Tower,
    }

    /**
     * HTPC [type][CaseType] of the [case][Case].
     */
    @Serializable
    public object HTPC : CaseType
}
