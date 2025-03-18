package com.ivoyant.anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        User ur=context.getBean(User.class);
        ur.code();
//.close() is not available inside ApplicationContext
        context.close();  // ✅ Triggers @PreDestroy in User
    }
}
