package com.bright;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
@MapperScan("com.bright.dao")
public class MySpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringApplication.class, args);
    }

   // @Bean
   // public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
   //     return args -> {
   //         System.out.println("Let's inspect the beans provided by Spring Boot:");
   //         String[] beanNames = ctx.getBeanDefinitionNames();
   //         Arrays.sort(beanNames);
   //         for (String beanName : beanNames) {
   //             System.out.println(beanName);
   //         }
   //     };
   // }

}
