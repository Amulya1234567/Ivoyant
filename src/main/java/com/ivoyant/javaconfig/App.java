package com.ivoyant.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien al=context.getBean(Alien.class);
        System.out.println(al.getAge());
        al.code();
//        Desktop dt = context.getBean(Desktop.class);//we are specifying a type here  not name
//        dt.compile();
//
//        Desktop dt1 = context.getBean(Desktop.class );
//        dt.compile();
//        System.out.println(dt==dt1);//if we specify scope is prototype the o/p will be false for this
//        if it is singleton the o/p will be true

//        Desktop dt = context.getBean("desktop", Desktop.class );
//        dt.compile();//now we are speciying name the default name of a bean will be method name


//        Desktop dt = context.getBean("com2", Desktop.class );
//        dt.compile();


    }
}
