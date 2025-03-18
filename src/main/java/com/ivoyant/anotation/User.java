package com.ivoyant.anotation;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;


//tells that User is a class where spring has to manage objects for it
@Component
@Data
@Slf4j
public class User implements DisposableBean {
    private int age;

    @Autowired
    @Qualifier("laptop")
    private Computer com;

    public void code() {
        log.info("codding");
        com.compile();
    }

    @Override
    public void destroy() throws Exception {
        log.info("Cleaning up User bean");
//        spring will automatically calls destroy() when context is close
    }

//    @PreDestroy
//    public void cleanup() {  // This method runs before the bean is destroyed
//        log.info("Cleaning up User bean before destruction...");
//    }
}
