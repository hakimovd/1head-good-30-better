package com.hakimov.hydra;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton sin1 = Singleton.getPerson("Bob");
        Singleton sin2 = Singleton.getPerson("Jim");

        System.out.println(sin1.getName());
        System.out.println(sin2.getName());
    }
}
