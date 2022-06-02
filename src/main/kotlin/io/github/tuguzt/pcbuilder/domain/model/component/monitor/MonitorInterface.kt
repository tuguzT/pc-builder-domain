package io.github.tuguzt.pcbuilder.domain.model.component.monitor

import kotlinx.serialization.Serializable

/**
 * Enum represents interface used by the [monitor][Monitor].
 */
@Suppress("EnumEntryName")
@Serializable
public enum class MonitorInterface {
    /** High Definition Multimedia Interface */
    HDMI,

    /**
     * Mini HDMI
     *
     * @see HDMI
     */
    Mini_HDMI,

    /** Digital Visual Interface */
    DVI,

    /**
     * DVI Integrated
     *
     * @see DVI
     */
    DVI_I,

    /**
     * DVI digital only single link
     *
     * @see DVI
     */
    DVI_D_SINGLE_LINK,

    /**
     * DVI digital only dual link
     *
     * @see DVI
     */
    DVI_D_DUAL_LINK,

    /**
     * DVI analog only
     *
     * @see DVI
     */
    DVI_A,

    /** Video Graphics Array */
    VGA,

    DisplayPort,

    /**
     * @see DisplayPort
     */
    Mini_DisplayPort,

    VirtualLink,

    /** Separate Video */
    SVideo,

    /** Bayonet Neill–Concelman */
    BNC,

    Component,

    S_Video;

    override fun toString(): String = name.replace('_', '-')
}
