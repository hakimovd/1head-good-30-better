package com.hakimov.hydra;

public class Singleton {
    private static Singleton person;

    private String name;

    public String getName() {
        return name;
    }

    private Singleton(String name) {
        this.name = name;
    }

    public static Singleton getPerson(String name) {
        if(person == null) {
            person = new Singleton(name);
        }
        return person;
    }


}
