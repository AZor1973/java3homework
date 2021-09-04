package ru.azor.lesson7;

import ru.azor.lesson7.tests.FirstTestCase;
import ru.azor.lesson7.tests.SecondTestCase;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {
    public static void main(String[] args) {
        try {
            start(FirstTestCase.class);
            start(SecondTestCase.class);
        } catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    private static void start(Class<?> testClass) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        Constructor<?> constructor = testClass.getConstructor();
        Method[] methods = testClass.getDeclaredMethods();
        Method temp;
        int countBefore = 0;
        int countAfter = 0;
        for (int i = 0; i < methods.length; i++) {
                if (methods[i].isAnnotationPresent(BeforeSuite.class)) {
                    temp = methods[0];
                    methods[0] = methods[i];
                    methods[i] = temp;
                    countBefore++;
                }
                if (methods[i].isAnnotationPresent(AfterSuite.class)) {
                    temp = methods[methods.length - 1];
                    methods[methods.length - 1] = methods[i];
                    methods[i] = temp;
                    countAfter++;
                }
        }
        if (countBefore < 1){
            throw new RuntimeException("No BeforeSuit");
        }
        if (countAfter < 1){
            throw new RuntimeException("No AfterSuit");
        }
        for (int i = 1; i < methods.length-1; i++) {
            for (int j = 1; j < methods.length - i - 1; j++) {
                if (methods[j].isAnnotationPresent(Test.class)) {
                    if (methods[j].getAnnotation(Test.class).priority() > methods[j + 1].getAnnotation(Test.class).priority()) {
                        temp = methods[j];
                        methods[j] = methods[j + 1];
                        methods[j + 1] = temp;
                    }
                }
            }
        }
        for (Method m : methods) {
                m.invoke(constructor.newInstance());
        }
    }
}
