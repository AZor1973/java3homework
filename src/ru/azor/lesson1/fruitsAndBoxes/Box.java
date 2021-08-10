package ru.azor.lesson1.fruitsAndBoxes;

import java.util.ArrayList;

public class Box<F extends Fruit> {
    private final F fruit;
    private final ArrayList<F> insideList;

    public Box(F fruit) {
        this.fruit = fruit;
        insideList = new ArrayList<>();
    }

    public F getFruit() {
        return fruit;
    }

    public float getBoxWeight() {
        if (insideList.isEmpty()) {
            return 0f;
        }
        return insideList.get(0).getWeight()*insideList.size();
    }

    public boolean compare(Box<?> box) {
        return this.getBoxWeight() == box.getBoxWeight();
    }

    public void fillBox(int n) {
        for (int i = 0; i < n; i++) {
            insideList.add((F)this.getFruit().createFruit());
        }
    }

    public void pourIntoBox(Box<F> box) {
        box.insideList.addAll(this.insideList);
        this.insideList.clear();
    }

    @Override
    public String toString() {
        return String.valueOf(insideList);
    }
}
