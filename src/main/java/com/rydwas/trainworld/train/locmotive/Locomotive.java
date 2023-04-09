package com.rydwas.trainworld.train.locmotive;

import lombok.Getter;

import static com.rydwas.trainworld.train.locmotive.LocomotiveIdGenerator.generateId;

public abstract class Locomotive {
    @Getter
    private final Integer id = generateId();

}
