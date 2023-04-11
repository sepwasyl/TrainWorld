package com.rydwas.trainworld.train.locmotive;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;

public abstract class DieselLocomotive extends Locomotive{
    @Getter
    @NotNull
    private String engineModel;
    @NotNull
    @Getter
    private Integer maxPullCapacity;

}
