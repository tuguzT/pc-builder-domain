package io.github.tuguzt.pcbuilder.domain.interactor.serialization

import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.*
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.compound.InverseUnitsSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.compound.UnitsProductSerializer
import io.github.tuguzt.pcbuilder.domain.interactor.serialization.measured.compound.UnitsRatioSerializer
import io.nacular.measured.units.*
import kotlinx.serialization.PolymorphicSerializer
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass

public val unitsModule: SerializersModule = SerializersModule {
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
    }
}
