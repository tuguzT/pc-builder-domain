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
    @Suppress("EnumEntryName")
    @Serializable
    public enum class ATX : CaseType {
        Desktop,
        Full_Tower,
        Mid_Tower,
        Mini_Tower,
        Test_Bench;

        override fun toString(): String = "ATX ${name.replace('_', ' ')}"
    }

    /**
     * MicroATX [type][CaseType] of the [case][Case].
     */
    @Suppress("EnumEntryName")
    @Serializable
    public enum class MicroATX : CaseType {
        Desktop,
        Mid_Tower,
        Mini_Tower,
        Slim;

        override fun toString(): String = "MicroATX ${name.replace('_', ' ')}"
    }

    /**
     * Mini ITX [type][CaseType] of the [case][Case].
     */
    @Suppress("EnumEntryName")
    @Serializable
    public enum class MiniITX : CaseType {
        Desktop,
        Test_Bench,
        Tower;

        override fun toString(): String = "Mini ITX ${name.replace('_', ' ')}"
    }

    /**
     * HTPC [type][CaseType] of the [case][Case].
     */
    @Suppress("SpellCheckingInspection")
    @Serializable
    public object HTPC : CaseType {
        override fun toString(): String = "HTPC"
    }
}
