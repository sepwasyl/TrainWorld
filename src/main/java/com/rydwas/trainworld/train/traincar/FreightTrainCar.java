package com.rydwas.trainworld.train.traincar;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;

public class FreightTrainCar extends TrainCar{

    @Getter
    @NotNull
    private float maxVolume;
    @NotNull
    @Getter
    private float maxLoadCapacity; //chodzi o kilogramy/tony
}
