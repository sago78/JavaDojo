package com.sago.myJavaTraining.Sandbox.examples.core.lambda;

import java.io.PrintWriter;
import java.util.List;

public class Jungle {
    public static String showAnimals(List<Animal> animals, CheckTrait checker){
        StringBuilder out = new StringBuilder();
        out.append("Jungle has\n");
        for(Animal animal: animals){
            if(checker.test(animal))
                out.append(animal+"\n");
        }
        out.append("\n");

        return out.toString();
    }
}
