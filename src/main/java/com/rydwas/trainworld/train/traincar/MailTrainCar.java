package com.rydwas.trainworld.train.traincar;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MailTrainCar extends TrainCar {

    @Getter
    @NotNull
    private final Integer maxVolume;

    @Getter
    @NotNull
    private final Integer maxWeight;

    protected MailTrainCar(@NotNull Boolean electrified, @Nullable Float voltage, @NotNull Integer maxVolume, @NotNull Integer maxWeight) {
        super(electrified, voltage);
        this.maxVolume = maxVolume;
        this.maxWeight = maxWeight;
    }
}
