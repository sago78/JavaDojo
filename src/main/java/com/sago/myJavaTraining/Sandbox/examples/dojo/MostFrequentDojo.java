package com.sago.myJavaTraining.Sandbox.examples.dojo;

import com.sago.myJavaTraining.Sandbox.examples.Exercise;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentDojo extends Exercise {
    public MostFrequentDojo(HttpServletResponse response) {
        super(response);
    }

    @Override
    public void run() {

        out.println("----get the number most frequent:");
        // mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        out.println("R1: "+mostFrequent(array1));
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        out.println("R2: "+mostFrequent(array2));
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        out.println("R3: "+mostFrequent(array3));
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        out.println("R4: "+mostFrequent(array4));
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};
        out.println("R5: "+mostFrequent(array5));
    }

    public int mostFrequent(int[] numbers){
        int topNumber= -1 ;
        int topCount=-1;
        Map<Integer,Integer> count = new HashMap<>();
        //loop
        for (int i =0; i < numbers.length ; i++)
        {

            //set items in a map and increas value, key is the numer

            //validate if exceeds the current top
        }


        return topNumber;
    }


}
