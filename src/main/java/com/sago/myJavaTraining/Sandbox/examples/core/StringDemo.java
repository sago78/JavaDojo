package com.sago.myJavaTraining.Sandbox.examples.core;

import com.sago.myJavaTraining.Sandbox.examples.Exercise;

import javax.servlet.http.HttpServletResponse;

public class StringDemo extends Exercise {
    public StringDemo(HttpServletResponse response) {
        super(response);
    }

    @Override
    public void run() {
        String s= "1";
        s+="2";
        s+="3";
        out.println(s);

        s=s.concat("4");
        s.concat("five");
        out.println(s);

        String inPool = "Cherry";
        String notInPool = new String("Pie");
        out.println("Cherry is " + inPool.length() + "and Pie is " + notInPool.length());
        out.println("character at 3: "+ inPool.charAt(3));
        out.println("index of R:" + inPool.indexOf("R"));
        out.println("Index of rry: "+inPool.indexOf("rry"));
        out.println("substring 2,4:" + inPool.substring(2,4));
        out.println("----");

        out.println("inPool to lowercase: " + inPool.toLowerCase());
        out.println("'ABCD1234EF' to lowercase: " + "ABCD1234EF".toLowerCase());

        StringBuilder sbText = new StringBuilder("start");
        sbText.append("+middle");
        sbText.append("+final");
    }
}
