package com.ivoyant.javaconfig;
import com.ivoyant.javaconfig.Desktop;
import com.ivoyant.javaconfig.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
//    replace xml configuration
//    @Bean(name = {"com2", "beast"})
    //    if we want to specify name we can use name attribute inside bean annotation
    //    and we specify multiple name also using array and call it with any of them
//    the default name will be method name;

    @Bean
        public Alien alien(Computer com){ //@Qualifier("desktop") specifies exact bean to inject by name
                                          // same as ref attribute in xml file
        Alien obj=new Alien();
        obj.setAge(25);
//        obj.setCom(desktop());//tight coupling
        obj.setCom(com);
        return obj;
    }
    @Bean
//    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    @Primary //specifies it as default bean which get first preference
    public Laptop laptop(){
        return new Laptop();
    }
}
