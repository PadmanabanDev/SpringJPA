package com.pn.springjpa;

import com.pn.springjpa.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaApplication {

    public static void main(String[] args) {
     //   SpringApplication.run(SpringJpaApplication.class, args);

       // User user = new User(1L, "Padmanaban","naban@gmail.com","7113pn");

        User user=User.builder()
                .name("padmanaban")
                .email("naban@gmail.com")
                .password("7113pn")
                .build();

    }

}
