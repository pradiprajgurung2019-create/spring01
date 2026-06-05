package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        org.springframework.context.ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Laptop laptop = (Laptop) context.getBean("laptop");

        System.out.println(laptop);

        Charger charger = (Charger) context.getBean("charger");
        System.out.println(charger);
    }
}
