package com.sago.myJavaTraining.Sandbox.examples;

import com.sago.myJavaTraining.Sandbox.examples.dojo.CommonAmongTwo;
import com.sago.myJavaTraining.Sandbox.examples.dojo.MostFrequentDojo;
import com.sago.myJavaTraining.Sandbox.examples.dojo.fibonacci.FibonacciExample;
import com.sago.myJavaTraining.Sandbox.examples.dojo.OneEditAwayDojo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@Controller
public class CodeDojoController {
    PrintWriter out;

    @GetMapping(path = "/dojo/oneEditAway")
    public void oneEditAwayCall(HttpServletResponse response) {
        OneEditAwayDojo oneEdit = new OneEditAwayDojo(response);
        oneEdit.run();
    }

    @GetMapping(path="/dojo/fibonacci")
    public void recursiveFibonacciResult(HttpServletResponse response)  {
        FibonacciExample fibo = new FibonacciExample(response);
        fibo.run();
    }


    @GetMapping(path="/dojo/mostFrequent")
    public void mostFrequent(HttpServletResponse response)  {
        MostFrequentDojo most = new MostFrequentDojo(response);
        most.run();
    }

    @GetMapping(path="/dojo/commonAmongTwo")
    public void commonAmongTwo(HttpServletResponse response) throws IOException {
        CommonAmongTwo common = new CommonAmongTwo(response);
        common.run();

    }
    
    
}
