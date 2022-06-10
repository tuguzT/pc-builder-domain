package io.github.tuguzt.pcbuilder.domain.model.serialization

import io.github.tuguzt.pcbuilder.domain.model.component.cases.CaseType
import io.github.tuguzt.pcbuilder.domain.model.component.data.*
import io.github.tuguzt.pcbuilder.domain.model.component.gpu.GpuInterface
import io.github.tuguzt.pcbuilder.domain.model.component.gpu.GpuMultiSupport
import io.github.tuguzt.pcbuilder.domain.model.component.motherboard.MotherboardChipset
import io.github.tuguzt.pcbuilder.domain.model.component.motherboard.MotherboardCpuSocket
import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.*
import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.compound.InverseUnitsSerializer
import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.compound.UnitsProductSerializer
import io.github.tuguzt.pcbuilder.domain.model.serialization.measured.compound.UnitsRatioSerializer
import io.nacular.measured.units.Measure
import io.nacular.measured.units.Units
import kotlinx.serialization.PolymorphicSerializer
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass

/**
 * Default [serializers module][SerializersModule] of the application.
 */
public val serializersModule: SerializersModule = SerializersModule {
    polymorphic(Units::class) {
        val unitsPolymorphicSerializer = PolymorphicSerializer(Units::class)

        /** Basic `measured` library units */
        subclass(AngleSerializer)
        subclass(BinarySizeSerializer)
        subclass(GraphicsLengthSerializer)
        subclass(LengthSerializer)
        subclass(MassSerializer)
        subclass(TimeSerializer)

        /** Compound `measured` library units */
        subclass(InverseUnitsSerializer(unitsPolymorphicSerializer))
        subclass(UnitsProductSerializer(unitsPolymorphicSerializer, unitsPolymorphicSerializer))
        subclass(UnitsRatioSerializer(unitsPolymorphicSerializer, unitsPolymorphicSerializer))

        /** Units defined by this domain module */
        subclass(ElectricitySerializer)
        subclass(LuminousIntensitySerializer)
        subclass(NoiseLevelSerializer)
    }

    polymorphic(Measure::class) {
        subclass(MeasureSerializer(PolymorphicSerializer(Units::class)))
    }

    polymorphic(CaseType::class) {
        subclass(PolymorphicEnumSerializer(CaseType.ATX.serializer()))
        subclass(PolymorphicEnumSerializer(CaseType.MicroATX.serializer()))
        subclass(PolymorphicEnumSerializer(CaseType.MiniITX.serializer()))
        subclass(CaseType.HTPC.serializer())
    }

    polymorphic(GpuInterface::class) {
        subclass(GpuInterface.AGP.serializer())
        subclass(GpuInterface.PCI.serializer())
        subclass(PolymorphicEnumSerializer(GpuInterface.PCIe.serializer()))
    }

    polymorphic(GpuMultiSupport::class) {
        subclass(GpuMultiSupport.CrossFireX.serializer())
        subclass(GpuMultiSupport.SLI.serializer())
    }

    polymorphic(MotherboardChipset::class) {
        subclass(PolymorphicEnumSerializer(MotherboardChipset.AMD.serializer()))
        subclass(PolymorphicEnumSerializer(MotherboardChipset.Intel.serializer()))
        subclass(PolymorphicEnumSerializer(MotherboardChipset.NVIDIA.GeForce.serializer()))
        subclass(PolymorphicEnumSerializer(MotherboardChipset.NVIDIA.NForce.serializer()))
        subclass(MotherboardChipset.NVIDIA.ION.serializer())
        subclass(PolymorphicEnumSerializer(MotherboardChipset.VIA.serializer()))
        subclass(MotherboardChipset.CPUIntegrated.serializer())
    }

    polymorphic(MotherboardCpuSocket::class) {
        subclass(MotherboardCpuSocket.Standard.serializer())
        subclass(PolymorphicEnumSerializer(MotherboardCpuSocket.Integrated.serializer()))
    }

    polymorphic(PolymorphicComponent::class) {
        subclass(CaseData.serializer())
        subclass(CoolerData.serializer())
        subclass(CpuData.serializer())
        subclass(GpuData.serializer())
        subclass(MemoryData.serializer())
        subclass(MonitorData.serializer())
        subclass(MotherboardData.serializer())
        subclass(PsuData.serializer())
        subclass(StorageData.serializer())
    }
}
