package com.rydwas.trainworld.train.traincar;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SleepTrainCar extends TrainCar {

    @Getter
    @NotNull
    private int numberOfBeds;


    protected SleepTrainCar(@NotNull Boolean electrified, @Nullable Float voltage) {
        super(electrified, voltage);
    }
}
