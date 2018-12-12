package com.example.hello;

import com.example.hello.config.HelloProperties;
import  org.slf4j.Logger;
import  org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import sun.tools.jar.CommandLine;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
@EnableConfigurationProperties(HelloProperties.class)
public class HelloApplication {

//    @Autowired
//   private ApplicationContext applicationContext;
    //private  static  final Logger log = LoggerFactory.getLogger(HelloApplication.class);


private  static  final Logger log = LoggerFactory.getLogger(HelloApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
//        System.out.println("Welcome to sprint it");
    }


    @Bean
    CommandLineRunner runner(){
        return args -> {
            log.error("CommandLineRunner.run();");
            log.warn("CommandLineRunner.run();");
            log.info("CommandLineRunner.run();");
            log.debug("CommandLineRunner.run();");
            log.trace("CommandLineRunner.run();");
        };
    }

//    @Bean
//    @Profile("dev")
//    CommandLineRunner runner(){
//        return args -> {
//            System.out.println("This is something that we would only do in dev");
//            System.out.println("-----------------------------------------------");
//            String[] beans = applicationContext.getBeanDefinitionNames();
//            Arrays.sort(beans);
//            for( String bean: beans) {
//                System.out.println(bean);
//            }
//
//           // Spring [] beans = applicatio nContext.getBeanDefinitionNames();
//           // System.out.println("Welcome message:" + helloProperties.getWelcomeMsg());
//        };
//    }
}
