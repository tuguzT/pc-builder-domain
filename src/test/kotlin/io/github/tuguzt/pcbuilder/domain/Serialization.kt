package io.github.tuguzt.pcbuilder.domain

import io.github.tuguzt.pcbuilder.domain.interactor.serialization.json
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.AngleSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.MeasureSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.TimeSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.compound.InverseUnitsSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.unitsModule
import io.github.tuguzt.pcbuilder.domain.model.component.Size
import io.github.tuguzt.pcbuilder.domain.model.units.hertz
import io.nacular.measured.units.Angle.Companion.degrees
import io.nacular.measured.units.Length.Companion.kilometers
import io.nacular.measured.units.Length.Companion.meters
import io.nacular.measured.units.Length.Companion.millimeters
import io.nacular.measured.units.times
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Set of tests for serialization [module][unitsModule].
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
        val serializer = MeasureSerializer(AngleSerializer)

        val angle = 90 * degrees
        val string = json.encodeToString(serializer, angle)
        println(string)

        val newAngle = json.decodeFromString(serializer, string)
        println(newAngle)
        assertEquals(angle, newAngle)
    }

    @Test
    fun `compound types`() {
        val serializer = MeasureSerializer(InverseUnitsSerializer(TimeSerializer))

        val frequency = 10 * hertz
        val string = json.encodeToString(serializer, frequency)
        println(string)

        val newFrequency = json.decodeFromString(serializer, string)
        println(newFrequency)
        assertEquals(frequency, newFrequency)
    }
}
