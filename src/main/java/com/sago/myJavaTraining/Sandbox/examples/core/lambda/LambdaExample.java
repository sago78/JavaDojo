package com.sago.myJavaTraining.Sandbox.examples.core.lambda;

import com.sago.myJavaTraining.Sandbox.examples.Exercise;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class LambdaExample extends Exercise
{

    public LambdaExample(HttpServletResponse response) {
        super(response);
    }

    @Override
    public void run() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish",true,true));
        animals.add(new Animal("dog",true,false));
        animals.add(new Animal("turtle",false,true));
        animals.add(new Animal("kangaroo",true,false));

        out.println(Jungle.showAnimals(animals, a -> a.canSwim()));
    }
}
