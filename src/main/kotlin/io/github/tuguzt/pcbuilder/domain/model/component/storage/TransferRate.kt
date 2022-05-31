package io.github.tuguzt.pcbuilder.domain.model.component.storage

import io.nacular.measured.units.BinarySize
import io.nacular.measured.units.Time
import io.nacular.measured.units.UnitsRatio

/**
 * transfer rte of the [storage][Storage].
 */
public typealias TransferRate = UnitsRatio<BinarySize, Time>
