package com.sago.myJavaTraining.Sandbox.examples.core;

import com.sago.myJavaTraining.Sandbox.examples.Exercise;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class ListsDemo extends Exercise {
    public ListsDemo(HttpServletResponse response) {
        super(response);
    }

    @Override
    public void run() {

        List<String> list  = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        for(String element:list) out.println(element);
    }
}
