package com.chiknas.springdi;

import com.chiknas.springdi.controllers.MainController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDiApplication.class, args);
        MainController mainController = (MainController) context.getBean("mainController");
        mainController.getHelloWorld();
        mainController.getHelloNikos();
        mainController.getPrimaryDefault();
    }

}
