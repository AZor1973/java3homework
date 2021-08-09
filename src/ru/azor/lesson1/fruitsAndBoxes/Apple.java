package ru.azor.lesson1.fruitsAndBoxes;

public class Apple extends Fruit {
    private static final float APPLE_WEIGHT = 1.0f;

    @Override
    public float getWeight() {
        return APPLE_WEIGHT;
    }

    @Override
    public Fruit createFruit() {
        return new Apple();
    }
}