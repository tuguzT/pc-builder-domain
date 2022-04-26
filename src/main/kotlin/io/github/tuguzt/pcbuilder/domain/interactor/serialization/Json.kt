package io.github.tuguzt.pcbuilder.domain.interactor.serialization

import kotlinx.serialization.json.Json

public val json: Json = Json {
    serializersModule = unitsModule
}
