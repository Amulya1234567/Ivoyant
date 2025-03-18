package com.ivoyant.anotation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Laptop implements Computer{
    @Override
    public void compile() {
         log.info("Compiling using laptop");
    }
}
