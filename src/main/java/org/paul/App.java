package org.paul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config.xml");


        Car car = (Car) context.getBean("car");
        car.drive();

//        Tyre tyre = (Tyre) context.getBean("tyre");
//        tyre.setBrand("CEAT");
//        System.out.println(tyre);



    }
}
