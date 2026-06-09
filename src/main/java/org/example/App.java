package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.jvm.hotspot.HelloWorld;

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

        //this is commented by PRG
        System.out.println("You are HIRED!!");
    }
}
