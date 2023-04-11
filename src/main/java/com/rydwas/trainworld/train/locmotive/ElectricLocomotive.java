package com.rydwas.trainworld.train.locmotive;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;

public abstract class ElectricLocomotive extends Locomotive {

    @Getter
    @NotNull
    private String engineModel;
    @Getter
    @NotNull
    private Boolean pantographed;

    @Getter
    @NotNull
    private Integer maxPullCapacity;

    @Getter
    @NotNull
    private Float voltage;
}
