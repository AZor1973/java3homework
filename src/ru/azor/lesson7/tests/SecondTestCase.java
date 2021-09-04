package ru.azor.lesson7.tests;

import ru.azor.lesson7.AfterSuite;
import ru.azor.lesson7.BeforeSuite;
import ru.azor.lesson7.Test;

public class SecondTestCase {
    @BeforeSuite
    public void init(){
        System.out.print(SecondTestCase.class.getSimpleName());
        System.out.println(" " + new Throwable().getStackTrace()[0].getMethodName());
    }
    @Test(priority = 1)
    public void test_1(){
        System.out.print(SecondTestCase.class.getSimpleName());
        System.out.println("  " + new Throwable().getStackTrace()[0].getMethodName());
    }
    @Test(priority = 2)
    public void test_2(){
        System.out.print(SecondTestCase.class.getSimpleName());
        System.out.println("  " + new Throwable().getStackTrace()[0].getMethodName());
    }
    @Test(priority = 3)
    public void test_3(){
        System.out.print(SecondTestCase.class.getSimpleName());
        System.out.println("  " + new Throwable().getStackTrace()[0].getMethodName());
    }
    @Test(priority = 4)
    public void test_4(){
        System.out.print(SecondTestCase.class.getSimpleName());
        System.out.println("  " + new Throwable().getStackTrace()[0].getMethodName());
    }
    @Test(priority = 5)
    public void test_5(){
        System.out.print(SecondTestCase.class.getSimpleName());
        System.out.println("  " + new Throwable().getStackTrace()[0].getMethodName());
    }
    @Test(priority = 6)
    public void test_6(){
        System.out.print(SecondTestCase.class.getSimpleName());
        System.out.println("  " + new Throwable().getStackTrace()[0].getMethodName());
    }
    @Test(priority = 7)
    public void test_7(){
        System.out.print(SecondTestCase.class.getSimpleName());
        System.out.println("  " + new Throwable().getStackTrace()[0].getMethodName());
    }
    @Test(priority = 8)
    public void test_8(){
        System.out.print(SecondTestCase.class.getSimpleName());
        System.out.println("  " + new Throwable().getStackTrace()[0].getMethodName());
    }
    @Test(priority = 9)
    public void test_9(){
        System.out.print(SecondTestCase.class.getSimpleName());
        System.out.println("  " + new Throwable().getStackTrace()[0].getMethodName());
    }
    @Test(priority = 10)
    public void test_10(){
        System.out.print(SecondTestCase.class.getSimpleName());
        System.out.println("  " + new Throwable().getStackTrace()[0].getMethodName());
    }
    @AfterSuite
    public void completion(){
        System.out.print(SecondTestCase.class.getSimpleName());
        System.out.println("  " + new Throwable().getStackTrace()[0].getMethodName());
    }
}
