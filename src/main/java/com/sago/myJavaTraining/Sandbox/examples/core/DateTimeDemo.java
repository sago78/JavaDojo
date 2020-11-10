package com.sago.myJavaTraining.Sandbox.examples.core;

import com.sago.myJavaTraining.Sandbox.examples.Exercise;

import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo extends Exercise {
    public DateTimeDemo(HttpServletResponse response) {
        super(response);
    }

    @Override
    public void run() {
        out.println(LocalDate.now());
        out.println(LocalTime.now());
        out.println(LocalDateTime.now());
    }
}
