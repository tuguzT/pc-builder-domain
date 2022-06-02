package io.github.tuguzt.pcbuilder.domain

import io.github.tuguzt.pcbuilder.domain.interactor.serialization.json
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.serializersModule
import io.github.tuguzt.pcbuilder.domain.model.component.Size
import io.github.tuguzt.pcbuilder.domain.model.component.cases.CaseType
import io.github.tuguzt.pcbuilder.domain.model.units.hertz
import io.nacular.measured.units.Angle.Companion.radians
import io.nacular.measured.units.Length.Companion.kilometers
import io.nacular.measured.units.Length.Companion.meters
import io.nacular.measured.units.Length.Companion.millimeters
import io.nacular.measured.units.Measure
import io.nacular.measured.units.times
import kotlinx.serialization.PolymorphicSerializer
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Set of tests for serialization [module][serializersModule].
 */
class Serialization {
    @Test
    fun size() {
        val size = Size(length = 1 * meters, width = kilometers * 0.1, height = millimeters * 100)
        val string = json.encodeToString(size)
        println(string)

        val newSize = json.decodeFromString<Size>(string)
        println(newSize)
        assertEquals(size, newSize)
    }

    @Test
    fun `basic types`() {
        val serializer = PolymorphicSerializer(Measure::class)

        val angle = 90 * radians
        val string = json.encodeToString(serializer, angle)
        println(string)

        val newAngle = json.decodeFromString(serializer, string)
        println(newAngle)
        assertEquals(angle, newAngle)
    }

    @Test
    fun `compound types`() {
        val serializer = PolymorphicSerializer(Measure::class)

        val frequency = 10 * hertz
        val string = json.encodeToString(serializer, frequency)
        println(string)

        val newFrequency = json.decodeFromString(serializer, string)
        println(newFrequency)
        assertEquals(frequency, newFrequency)
    }

    @Test
    fun `polymorphic enumerations`() {
        val caseType: CaseType = CaseType.ATX.Desktop
        val string = json.encodeToString(caseType)
        println(string)

        val newCaseType: CaseType = json.decodeFromString(string)
        println(newCaseType)
        assertEquals(caseType, newCaseType)
    }
}
