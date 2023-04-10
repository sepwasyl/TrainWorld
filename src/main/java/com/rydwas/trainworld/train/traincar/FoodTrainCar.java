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
    private int numberOfSeats;


    protected FoodTrainCar(@NotNull Boolean electrified, @Nullable Float voltage) {
        super(electrified, voltage);
    }
}
