package com.hakimov.hydra;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext1.xml"
        );



        Hydra hydra = context.getBean("hydra", Hydra.class);

        hydra.showHydra();

        System.out.println(Hydra.counter);
        
        context.close();




    }
}
