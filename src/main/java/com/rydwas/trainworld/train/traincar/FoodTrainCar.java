package com.rydwas.trainworld.train.traincar;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;

public class FoodTrainCar extends TrainCar {

    @Getter
    @NotNull
    private String[] menuItems;

    @NotNull
    @Getter
    private int numberOfSeats;






}
