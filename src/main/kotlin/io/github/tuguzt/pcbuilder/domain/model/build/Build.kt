package io.github.tuguzt.pcbuilder.domain.model.build

import io.github.tuguzt.pcbuilder.domain.model.Identifiable
import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.Component
import io.github.tuguzt.pcbuilder.domain.model.component.cases.Case
import io.github.tuguzt.pcbuilder.domain.model.component.cooler.Cooler
import io.github.tuguzt.pcbuilder.domain.model.component.cpu.CPU
import io.github.tuguzt.pcbuilder.domain.model.component.cpu.CentralProcessingUnit
import io.github.tuguzt.pcbuilder.domain.model.component.gpu.GPU
import io.github.tuguzt.pcbuilder.domain.model.component.gpu.GraphicsProcessingUnit
import io.github.tuguzt.pcbuilder.domain.model.component.memory.Memory
import io.github.tuguzt.pcbuilder.domain.model.component.monitor.Monitor
import io.github.tuguzt.pcbuilder.domain.model.component.motherboard.Motherboard
import io.github.tuguzt.pcbuilder.domain.model.component.psu.PSU
import io.github.tuguzt.pcbuilder.domain.model.component.psu.PowerSupplyUnit
import io.github.tuguzt.pcbuilder.domain.model.component.storage.Storage

/**
 * Stores information about custom PC build which consists of [components][Component].
 */
public interface Build : Identifiable<NanoId> {
    public val name: String
    public val case: Case?
    public val cooler: Cooler?
    public val centralProcessingUnit: CentralProcessingUnit?
    public val graphicsProcessingUnit: GraphicsProcessingUnit?
    public val memory: Memory?
    public val monitor: Monitor?
    public val motherboard: Motherboard?
    public val powerSupplyUnit: PowerSupplyUnit?
    public val storage: Storage?
}

/**
 * Shorthand for [Build.centralProcessingUnit].
 */
public inline val Build.cpu: CPU? get() = centralProcessingUnit

/**
 * Shorthand for [Build.graphicsProcessingUnit].
 */
public inline val Build.gpu: GPU? get() = graphicsProcessingUnit

/**
 * Shorthand for [Build.powerSupplyUnit].
 */
public inline val Build.psu: PSU? get() = powerSupplyUnit
