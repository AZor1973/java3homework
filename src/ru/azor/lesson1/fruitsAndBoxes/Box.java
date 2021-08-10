package ru.azor.lesson1.fruitsAndBoxes;

import java.util.ArrayList;

public class Box<F extends Fruit> {
    private final ArrayList<F> insideList = new ArrayList<>();

    public float getBoxWeight() {
        if (insideList.isEmpty()) {
            return 0f;
        }
        return insideList.get(0).getWeight()*insideList.size();
    }

    public boolean compare(Box<?> box) {
        return this.getBoxWeight() == box.getBoxWeight();
    }
    public void fillBox(F fruit) {
            insideList.add(fruit);
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
