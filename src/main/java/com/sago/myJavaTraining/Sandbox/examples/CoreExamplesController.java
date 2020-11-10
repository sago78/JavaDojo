package com.sago.myJavaTraining.Sandbox.examples;

import com.sago.myJavaTraining.Sandbox.examples.core.ArrayDemo;
import com.sago.myJavaTraining.Sandbox.examples.core.DateTimeDemo;
import com.sago.myJavaTraining.Sandbox.examples.core.ListsDemo;
import com.sago.myJavaTraining.Sandbox.examples.core.StringDemo;
import com.sago.myJavaTraining.Sandbox.examples.core.lambda.LambdaExample;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class CoreExamplesController {
    @GetMapping(path = "examples/array")
    public void arrayListExample(HttpServletResponse response)  {
        ArrayDemo demo = new ArrayDemo(response);
        demo.run();
    }

    @GetMapping(path="/examples/string")
    public void stringExample(HttpServletResponse response) {
        StringDemo demo = new StringDemo(response);
        demo.run();

    }

    @GetMapping(path="/examples/list")
    public void listCollectionsExample(HttpServletResponse response) {

        ListsDemo demo = new ListsDemo(response);
        demo.run();

    }

    @GetMapping(path="/examples/lambda")
    public void lambdaExample(HttpServletResponse response) {

        LambdaExample program = new LambdaExample(response);

        program.run();

    }
    @GetMapping(path = "/examples/date-time")
    public void dateTimeExamples (HttpServletResponse response) {
        DateTimeDemo demo = new DateTimeDemo(response);
        demo.run();

    }

}
