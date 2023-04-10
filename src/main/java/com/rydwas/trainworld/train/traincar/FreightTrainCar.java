package com.rydwas.trainworld.train.traincar;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FreightTrainCar extends TrainCar{

    @Getter
    @NotNull
    private float maxVolume;
    @NotNull
    @Getter
    private float maxLoadCapacity; //chodzi o kilogramy/tony

    protected FreightTrainCar(@NotNull Boolean electrified, @Nullable Float voltage) {
        super(electrified, voltage);
    }
}
