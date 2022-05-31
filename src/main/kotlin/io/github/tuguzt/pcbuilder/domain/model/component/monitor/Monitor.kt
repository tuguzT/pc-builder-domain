package io.github.tuguzt.pcbuilder.domain.model.component.monitor

import io.github.tuguzt.pcbuilder.domain.model.component.Component
import io.github.tuguzt.pcbuilder.domain.model.component.gpu.GpuFrameSyncType

/**
 * Interface for all monitors of PC.
 */
public interface Monitor : Component {
    public val aspectRatio: MonitorAspectRatio
    public val contrastRatio: MonitorContrastRatio
    public val refreshRate: MonitorRefreshRate
    public val responseTime: MonitorResponseTime
    public val frameSyncType: GpuFrameSyncType?
    public val `interface`: MonitorInterface
    public val panelType: MonitorPanelType
    public val pwmType: MonitorPWMType
    public val resolution: MonitorResolution
    public val screenType: MonitorScreenType
}
