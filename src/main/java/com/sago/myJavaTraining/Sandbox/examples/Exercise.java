package com.sago.myJavaTraining.Sandbox.examples;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class Exercise {
    protected PrintWriter out;

    public Exercise() {
    }

    public Exercise(HttpServletResponse response) {
        response.setHeader("content-type","text/plain; charset=utf-8");
        response.setStatus(200);
        try{
            out =response.getWriter();
        }catch (IOException ex)
        {
            System.out.println(ex.getStackTrace());
        }
    }

    public abstract void run();
}
