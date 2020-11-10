package com.sago.myJavaTraining.Sandbox.examples.core;

import com.sago.myJavaTraining.Sandbox.examples.Exercise;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class ArrayDemo extends Exercise {
    public ArrayDemo(HttpServletResponse response) {
        super(response);
    }

    @Override
    public void run() {
        //arrays and ArrayList
        String[] names1 = new String[3];
        names1[0]="Lisa";
        names1[1]="Kevin";
        names1[2]="Yorch";

        for (String name:names1){
            out.println(name+",");
        }


        out.println("\nArrayList");
        List<String> values = new ArrayList<>();
        values.add("Risa");
        values.add("Tenis");
        values.add("Prisa");

        for(String value: values){
            out.println(value+", ");
        }
        out.println("\nEnd");
    }
}
