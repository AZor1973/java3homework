package ru.azor.lesson1.fruitsAndBoxes;

public class TestBoxes {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(new Apple());
        Box<Orange> orangeBox = new Box<>(new Orange());
        Box<Orange> orangeBox2 = new Box<>(new Orange());
        appleBox.fillBox(9);
        orangeBox.fillBox(6);
        orangeBox2.fillBox(5);
        System.out.println("Вес appleBox = " + appleBox.getBoxWeight());
        System.out.println("Вес orangeBox = " + orangeBox.getBoxWeight());
        System.out.println("appleBox и orangeBox равны? : " + orangeBox.compare(appleBox));
        System.out.println("Вес orangeBox2 = " + orangeBox2.getBoxWeight());
        System.out.println("Вес orangeBox = " + orangeBox.getBoxWeight());
        System.out.println("orangeBox2 и orangeBox равны? : " + orangeBox.compare(orangeBox2));
        System.out.println("Пересыпаем из orangeBox в orangeBox2.");
        orangeBox.pourIntoBox(orangeBox2);
        System.out.println("Вес orangeBox2 = " + orangeBox2.getBoxWeight());
        System.out.println("Вес orangeBox = " + orangeBox.getBoxWeight());
    }
}
