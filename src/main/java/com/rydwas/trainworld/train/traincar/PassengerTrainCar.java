package com.rydwas.trainworld.train.traincar;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PassengerTrainCar extends TrainCar {
    @Getter
    @NotNull
    private final Integer seats;

    public PassengerTrainCar(@NotNull Integer numberOfSeats, @NotNull Boolean electrified, @Nullable Float voltage) {
        super(electrified, voltage);
        this.seats = numberOfSeats;
    }
}
