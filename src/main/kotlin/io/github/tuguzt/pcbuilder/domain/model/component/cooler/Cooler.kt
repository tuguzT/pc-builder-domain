package io.github.tuguzt.pcbuilder.domain.model.component.cooler

import io.github.tuguzt.pcbuilder.domain.model.component.Component
import io.github.tuguzt.pcbuilder.domain.model.component.cpu.CpuSocket

/**
 * Interface for all coolers of PC.
 */
public interface Cooler : Component {
    public val bearing: CoolerBearing
    public val cpuSocket: CpuSocket
    public val waterType: CoolerWaterType?
    public val fanType: CoolerFanType
}
