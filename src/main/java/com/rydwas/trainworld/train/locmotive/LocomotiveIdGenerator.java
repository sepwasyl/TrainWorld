package com.rydwas.trainworld.train.locmotive;

class LocomotiveIdGenerator {
    private LocomotiveIdGenerator() {
        throw new IllegalStateException("Utility class");
    }
    private static Integer indicator = 0;
    public static Integer generateId() {
        return indicator++;
    }
}
