package io.github.tuguzt.pcbuilder.domain.repository.component.cases

import io.github.tuguzt.pcbuilder.domain.model.NanoId
import io.github.tuguzt.pcbuilder.domain.model.component.data.CaseData
import io.github.tuguzt.pcbuilder.domain.repository.util.CrudRepository

public interface CaseRepository<Error> : CrudRepository<NanoId, CaseData, Error>
