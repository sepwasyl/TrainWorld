package com.rydwas.trainworld.train.traincar;

import org.jetbrains.annotations.NotNull;

class TrainCarIdGenerator {

    private TrainCarIdGenerator() {
        throw new IllegalStateException("Utility class");
    }
    @NotNull
    private static Integer indicator = 0;

    @NotNull
    public static Integer generateId() {
        return indicator++;
    }
}
