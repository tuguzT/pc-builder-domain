package io.github.tuguzt.pcbuilder.domain.interactor.serialization

import kotlinx.serialization.json.Json

/**
 * Default [Json] configuration of the application.
 */
public val json: Json = Json {
    serializersModule = unitsModule
}
