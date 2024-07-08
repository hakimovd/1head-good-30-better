package com.hakimov.hydra;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext1.xml"
        );


        Hydra hydra = context.getBean("hydra", Hydra.class);

        hydra.showHydra();




    }
}
