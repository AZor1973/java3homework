package ru.azor.lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Lesson1 {
    public static void main(String[] args) {
        String[] array = {"a", "b", "c"};
        for (String s : array) {
            System.out.print(s);
        }
        System.out.println();
        changeElementsOfArray(array, 1, 2);
        for (String s : array) {
            System.out.print(s);
        }
        System.out.println();
        System.out.println(arrayToArrayList(array));
    }

    private static <E> void changeElementsOfArray(E[] array, int a, int b) {
        if (a >= array.length || b >= array.length || a < 0 || b < 0){
            System.out.println("Invalid parameters");
            return;
        }
        E temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    private static <E> ArrayList<E> arrayToArrayList(E[] array){
        return new ArrayList<>(Arrays.asList(array));
    }
}
