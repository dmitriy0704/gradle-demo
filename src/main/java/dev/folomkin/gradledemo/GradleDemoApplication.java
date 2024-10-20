package dev.folomkin.gradledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradleDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradleDemoApplication.class, args);
        demo();
    }

    static void demo() {
        System.out.println("Hello World");
    }

}
