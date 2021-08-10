package ru.azor.lesson1.fruitsAndBoxes;

public class Orange extends Fruit{
    private static final float ORANGE_WEIGHT = 1.5f;

    @Override
    public float getWeight() {
        return ORANGE_WEIGHT;
    }

    @Override
    public Fruit createFruit() {
        return new Orange();
    }
}
