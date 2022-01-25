package edu.wctc.dice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public MyApp() {
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        ((GenerateReport)context.getBean("generateReport")).generateReport();
    }
}