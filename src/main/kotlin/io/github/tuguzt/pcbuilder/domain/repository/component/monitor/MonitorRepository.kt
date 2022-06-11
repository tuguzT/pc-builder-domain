package io.github.tuguzt.pcbuilder.domain.repository.component.monitor

import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.data.MonitorData
import io.github.tuguzt.pcbuilder.domain.repository.util.CrudRepository

public interface MonitorRepository<Error> : CrudRepository<NanoId, MonitorData, Error>
