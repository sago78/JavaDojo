package com.sago.myJavaTraining.Sandbox.examples.core.lambda;

public class Animal {

    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String species, boolean hopper, boolean swimmer) {
        this.species = species;
        this.canHop = hopper;
        this.canSwim = swimmer;
    }

    public String getSpecies() {
        return species;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString(){return species; }
}
