package com.chiknas.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author nkukn - created on 19-Oct-19 8:35 PM
 */
@Service
@Primary
public class DefaultPrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public void printGreeting() {
        System.out.println("Hello default");
    }
}
