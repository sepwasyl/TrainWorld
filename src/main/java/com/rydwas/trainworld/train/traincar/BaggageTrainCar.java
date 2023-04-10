package com.rydwas.trainworld.train.traincar;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BaggageTrainCar extends TrainCar {
    @Getter
    @NotNull
    private int maxVolume;

    @Getter
    @NotNull
    private int maxWeight;

    protected BaggageTrainCar(@NotNull Boolean electrified, @Nullable Float voltage) {
        super(electrified, voltage);
    }
}
