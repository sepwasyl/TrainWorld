package com.rydwas.trainworld.train.locmotive;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import static com.rydwas.trainworld.train.locmotive.LocomotiveIdGenerator.generateId;

public abstract class Locomotive {
    @Getter
    @NotNull
    private final Integer id = generateId();

}
