package com.chiknas.springdi.services;

import org.springframework.stereotype.Service;

/**
 * @author nkukn - created on 19-Oct-19 8:21 PM
 */
@Service
public class HelloWorldGreetingServiceImpl implements GreetingService {
    @Override
    public void printGreeting() {
        System.out.println("Hello world");
    }
}
