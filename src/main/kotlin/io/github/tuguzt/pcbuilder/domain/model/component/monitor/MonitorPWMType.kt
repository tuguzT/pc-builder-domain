@file:UseSerializers(MeasureSerializer::class, InverseUnitsSerializer::class, TimeSerializer::class)

package io.github.tuguzt.pcbuilder.domain.model.component.monitor

import io.github.tuguzt.pcbuilder.domain.model.component.monitor.MonitorPWMType.PWM
import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.MeasureSerializer
import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.TimeSerializer
import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.compound.InverseUnitsSerializer
import io.github.tuguzt.pcbuilder.domain.model.units.Frequency
import io.github.tuguzt.pcbuilder.domain.model.units.hertz
import io.nacular.measured.units.Measure
import io.nacular.measured.units.times
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

/**
 * Represents if the [monitor][Monitor] uses [PWM] or not.
 */
@Serializable
public sealed interface MonitorPWMType {
    /** Pulse Width Modulation (PWM) */
    @Serializable
    public data class PWM(val frequency: Measure<Frequency>) : MonitorPWMType {
        init {
            require(frequency > 0 * hertz) { "Frequency of PWM monitor must be greater than 0" }
        }
    }

    /** Monitor was built on Flicker-Free technology */
    @Serializable
    public object FlickerFree : MonitorPWMType
}
