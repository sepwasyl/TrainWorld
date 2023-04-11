package com.rydwas.trainworld.train.traincar;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FreightTrainCar extends TrainCar{

    @Getter
    @NotNull
    private final Float maxVolume;
    @NotNull
    @Getter
    private final Float maxLoadCapacity;

    protected FreightTrainCar(@NotNull Boolean electrified, @Nullable Float voltage, @NotNull Float maxVolume, @NotNull Float maxLoadCapacity) {
        super(electrified, voltage);
        this.maxVolume = maxVolume;
        this.maxLoadCapacity = maxLoadCapacity;
    }
}
