package edu.fra.uas.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.fra.uas.hello.HelloApplication;
import edu.fra.uas.hello.Notenberechner;


@Controller
public class HelloWorldController {
    @Autowired
    private Notenberechner notenBerechner ;

@RequestMapping(value="hello", method=RequestMethod.GET)
@ResponseBody
public String getHelloWorld() {
    double[] noten = {1.7, 2.3, 2.0, 3.7, 1.3};
    double durchschnitt = notenBerechner.berechneDurchschnitt(noten);
    return "<h1>Hello World Spring Boot!</h1>" + "<p> Der Durchschnitt ist: " + durchschnitt + "<p>";

}

}
