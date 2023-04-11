package com.rydwas.trainworld.train.traincar;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FoodTrainCar extends TrainCar {

    @Getter
    @NotNull
    private String[] menuItems;

    @NotNull
    @Getter
    private final Integer numberOfSeats;


    protected FoodTrainCar(@NotNull Boolean electrified, @Nullable Float voltage, @NotNull Integer numberOfSeats) {
        super(electrified, voltage);
        this.numberOfSeats = numberOfSeats;
    }
}
