package io.github.tuguzt.pcbuilder.domain

import io.github.tuguzt.pcbuilder.domain.model.component.Size
import io.github.tuguzt.pcbuilder.domain.model.component.ThermalDesignPower
import io.github.tuguzt.pcbuilder.domain.model.component.Weight
import io.github.tuguzt.pcbuilder.domain.model.component.cases.CaseDriveBays
import io.github.tuguzt.pcbuilder.domain.model.component.cases.CaseExpansionSlots
import io.github.tuguzt.pcbuilder.domain.model.component.cases.CasePowerSupplyShroud
import io.github.tuguzt.pcbuilder.domain.model.component.cases.CaseType
import io.github.tuguzt.pcbuilder.domain.model.component.data.*
import io.github.tuguzt.pcbuilder.domain.model.component.gpu.*
import io.github.tuguzt.pcbuilder.domain.model.component.motherboard.MotherboardChipset
import io.github.tuguzt.pcbuilder.domain.model.serialization.json
import io.github.tuguzt.pcbuilder.domain.model.serialization.serializersModule
import io.github.tuguzt.pcbuilder.domain.model.units.hertz
import io.github.tuguzt.pcbuilder.domain.model.units.watt
import io.nacular.measured.units.Angle.Companion.radians
import io.nacular.measured.units.BinarySize
import io.nacular.measured.units.Length.Companion.kilometers
import io.nacular.measured.units.Length.Companion.meters
import io.nacular.measured.units.Length.Companion.millimeters
import io.nacular.measured.units.Mass
import io.nacular.measured.units.Mass.Companion.grams
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
        val string1 = json.encodeToString(caseType)
        println(string1)

        val newCaseType: CaseType = json.decodeFromString(string1)
        println(newCaseType)
        assertEquals(caseType, newCaseType)

        val motherboardChipset: MotherboardChipset = MotherboardChipset.NVIDIA.GeForce.GeForce6150
        val string2 = json.encodeToString(motherboardChipset)
        println(string2)

        val newMotherboardChipset: MotherboardChipset = json.decodeFromString(string2)
        println(newMotherboardChipset)
        assertEquals(motherboardChipset, newMotherboardChipset)
    }

    @Test
    fun `polymorphic component`() {
        val case: PolymorphicComponent = CaseData(
            name = "Hello World",
            description = "hehe boi",
            weight = Weight(100 * grams),
            size = Size(length = 1 * meters, width = 1 * meters, height = 1 * meters),
            manufacturer = ManufacturerData(name = "Hello", description = "World"),
            imageUri = null,
            isFavorite = false,
            driveBays = CaseDriveBays(
                external5_25_count = 0u,
                external3_5_count = 0u,
                internal3_5_count = 0u,
                internal2_5_count = 0u,
            ),
            expansionSlots = CaseExpansionSlots(fullHeightCount = 0u, halfHeightCount = 0u),
            motherboardFormFactors = listOf(),
            powerSupply = null,
            powerSupplyShroud = CasePowerSupplyShroud.NonShroud,
            sidePanelWindow = null,
            caseType = CaseType.ATX.Full_Tower,
        )
        val string1 = json.encodeToString(case)
        println(string1)

        val newCase: PolymorphicComponent = json.decodeFromString(string1)
        println(newCase)
        assertEquals(case, newCase)

        val gpu = GpuData(
            name = "NVIDIA GeForce RTX 3050",
            description = "The RTX 3050 is built on Ampere architecture and uses 8GB" +
                    " of GDDR6 VRAM. This is the same memory found in the RTX 3060 Ti." +
                    " The card has 2,560 CUDA cores with a base clock of 1.55 GHz and" +
                    " a boost clock of 1.78 GHz. It also has a 128-bit memory interface width" +
                    " seen in GPUs targeting 1080p.",
            weight = Weight(1 * Mass.kilograms),
            size = Size(
                length = 242 * millimeters,
                width = 112 * millimeters,
                height = 40 * millimeters,
            ),
            manufacturer = ManufacturerData(
                name = "Example",
                description = "Hello World",
            ),
            imageUri = null,
            isFavorite = false,
            `interface` = GpuInterface.AGP,
            chipset = GpuChipsetData("hehe boi"),
            coreClockRate = GpuClockRate(0 * hertz),
            boostClockRate = GpuClockRate(0 * hertz),
            memoryType = GpuMemoryType.GDDR6X,
            memoryCapacity = GpuMemoryCapacity(1 * BinarySize.gigabytes),
            multiSupport = null,
            frameSyncType = null,
            thermalDesignPower = ThermalDesignPower(0 * watt),
            ports = GpuPorts(
                dviCount = 0u,
                hdmiCount = 0u,
                miniHdmiCount = 0u,
                displayPortCount = 0u,
                miniDisplayPortCount = 0u,
            ),
            expansionSlotWidth = 0u,
            cooling = GpuCooling(0u, GpuCooling.Radiator.R360),
            externalPower = GpuExternalPower(
                pciExpress6pinCount = 0u,
                pciExpress8pinCount = 0u,
                pciExpress12pinCount = 0u,
                pciExpress16pinCount = 0u,
            ),
        )

        val componentList = List(5) {
            if (it % 2 == 0) case else gpu
        }
        val string2 = json.encodeToString(componentList)
        println(string2)

        val newComponentList: List<PolymorphicComponent> = json.decodeFromString(string2)
        println(newComponentList)
        assertEquals(componentList, newComponentList)
    }
}
