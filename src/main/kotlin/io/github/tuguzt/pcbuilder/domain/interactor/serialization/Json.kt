package io.github.tuguzt.pcbuilder.domain.interactor.serialization

import kotlinx.serialization.json.Json
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.serializersModule as mySerializersModule

/**
 * Default [Json] configuration of the application.
 */
public val json: Json = Json {
    serializersModule = mySerializersModule
}
