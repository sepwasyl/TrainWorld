package com.rydwas.trainworld.train.traincar;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static com.rydwas.trainworld.train.traincar.TrainCarIdGenerator.generateId;

public abstract class TrainCar {
    @Getter
    @NotNull
    private final Integer id = generateId();

    @Getter
    @NotNull
    private final Boolean electrified;
    @Getter
    @Nullable
    private final Float voltage;

    protected TrainCar(@NotNull Boolean electrified, @Nullable Float voltage) {
        this.electrified = electrified;
        this.voltage = voltage;
    }
}
