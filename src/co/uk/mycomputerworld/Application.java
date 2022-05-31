package co.uk.mycomputerworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("HELLO WORLD");

        String[] beanNames = ctx.getBeanDefinitionNames();

        /* Display all the beans defined in the Spring application context
         *  They are Auto-configured by the Spring Boot auto-configuration */
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }


}
