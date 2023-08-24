package com.telran.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ClassA classA = (ClassA) context.getBean("idA");

        classA.setMessage("Hello!");
        System.out.println(classA.getMessage());

        ClassA anotherClassA = (ClassA) context.getBean("idA");
        System.out.println(anotherClassA.getMessage());

        System.out.println(classA == anotherClassA);

        ClassB classB = context.getBean(ClassB.class);
        ClassB anotherClassB = context.getBean(ClassB.class);

        System.out.println(classB == anotherClassB);

        classB.setMessage("Java");
        System.out.println(anotherClassB.getMessage());
    }
}
