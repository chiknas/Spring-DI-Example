package com.chiknas.springdi.controllers;

import com.chiknas.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Controller that shows how to inject the bean you want when you have more than one classes that implement
 * the same interface.
 *
 * 1. @Qualifier(<nameOfTheImplementationClass>) before the attribute in the constructor. PREFERRED WAY/BEST PRACTISE
 * 2. The name of the attribute can be the name nameOfTheImplementationClass and spring will figure staff out. SHORTCUT BUT CAN CAUSE PROBLEMS BECAUSE OF #3 BELOW
 * 3. greetingService below does not break the code because we have a @Primary annotation on one of the classes that
 * implement GreetingService. Thus the class with the @Primary overrides the method #2 above but not method 1.
 * If @Qualifier is used at one of the attributes below, then this would be then bean injected to this class
 * and not the @Primary annotation class.
 *
 * @author nkukn - created on 16-Oct-19 11:10 PM
 */
@Controller
public class MainController {

    private GreetingService helloWorldGreetingServiceImpl;
    private GreetingService greetingServiceNikos;
    private GreetingService greetingService;

    @Autowired
    public MainController(GreetingService helloWorldGreetingServiceImpl,
                          @Qualifier("helloNikosGreetingService") GreetingService greetingServiceNikos,
                          GreetingService greetingService) {
        this.helloWorldGreetingServiceImpl = helloWorldGreetingServiceImpl;
        this.greetingServiceNikos = greetingServiceNikos;
        this.greetingService = greetingService;
    }

    public void getHelloWorld(){
        helloWorldGreetingServiceImpl.printGreeting();
    }

    public void getHelloNikos(){
        greetingServiceNikos.printGreeting();
    }

    public void getPrimaryDefault(){
        greetingService.printGreeting();
    }
}
