package com.ivoyant.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    /**
     * Hello world!
     *
     */
        public static void main( String[] args )
        {
            ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");

//        Alien obj = (Alien) context.getBean("alien");

//        Alien obj = context.getBean("alien", Alien.class);
//        instead of typecasting we can specify name of the class

            Alien obj = context.getBean(Alien.class);
//        instead of specify name of the bean we specify name of the class
            System.out.println(obj.getAge());
            obj.code();
//
//        Desktop obj1= (Desktop) context.getBean("com1");
//        if we call the desktop object then only object will be created bz we have initialized
//        lazy-init-"true" for desktop bean


//        Alien obj1 = (Alien) context.getBean("alien");
//        obj .code();
//        System.out.println(obj1.age);//when we use prototype scope o/p will bw 0 for this
//        //because each time new instance of bean will be created
//        //if it is singleton o/p will be 21 only


        }
    }


