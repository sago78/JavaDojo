package com.sago.myJavaTraining.Sandbox.examples.dojo.fibonacci;

import com.sago.myJavaTraining.Sandbox.examples.Exercise;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class FibonacciExample extends Exercise {

    public FibonacciExample(HttpServletResponse response) {
        super(response);
    }

    @Override
    public void run() {
        out.println("Fibonacci Result 5:" + recursiveFibonacci(5));

        out.println("----");
        out.println("Regular , position = 8: " + regularFibonacci(8));

    }

    int recursiveFibonacci (int position){

        if (position < 2 ) {
            out.print(position+",");
            if (position ==0 )
                out.println();
            return position;
        }else
        {
            int result = recursiveFibonacci(position-1) +recursiveFibonacci(position-2);
            out.print(result+",");
            return result;
        }
    }

    ArrayList<Integer> regularFibonacci (int position){
        ArrayList<Integer> series = new ArrayList<>();
        series.add(0);
        if (position > 0 )
            series.add(1);

        for(int x = 2 ; x <= position; x++)
        {
            int a= series.get(x-1);
            int b= series.get(x-2);
            series.add(a+b);
        }
        return series;
    }

}
