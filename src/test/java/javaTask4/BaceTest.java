package javaTask4;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaceTest {

    @BeforeTest
    public  void beforT(){
        System.out.println("Действие перед началом теста");
    }

    @AfterTest
    public  void afterT(){
        System.out.println("Действие после началом теста");
    }

    @BeforeTest
    public  void beforM(){
        System.out.println("Действие перед началом метода");
    }

    @AfterTest
    public  void afterM(){
        System.out.println("Действие после началом метода");
    }
}
