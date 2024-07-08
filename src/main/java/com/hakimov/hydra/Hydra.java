package com.hakimov.hydra;

import java.util.ArrayList;
import java.util.List;

public class Hydra {

    private static Hydra hydra;

    private String name;
    private List<Head> listOfHeads = new ArrayList<>();

    private Hydra(String name, List<Head> listOfHeads) {
            this.name = name;
            this.listOfHeads = listOfHeads;
    }



    public static Hydra getHydra(String name, List<Head> listOfHeads) {
        if (hydra == null) {
            hydra = new Hydra(name, listOfHeads);
        }
        return hydra;
    }


    public void showHydra () {
        System.out.println(name);
        for (Head head : listOfHeads) {
            System.out.println("Ears: " + head.getCountOfEars() + " Eyes: " + head.getCountOfEyes());
        }
    }

}
