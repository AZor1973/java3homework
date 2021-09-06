package ru.azor.lesson7;

import ru.azor.lesson7.tests.FirstTestCase;
import ru.azor.lesson7.tests.SecondTestCase;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

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
                }else
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
      Arrays.sort(methods, 1, methods.length-1, Comparator.comparingInt((Method method) -> method.getAnnotation(Test.class).priority()));
        for (Method m : methods) {
                m.invoke(constructor.newInstance());
        }
    }
}
