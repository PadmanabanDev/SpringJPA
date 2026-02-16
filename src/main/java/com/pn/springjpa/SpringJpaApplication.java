package com.pn.springjpa;

import com.pn.springjpa.entities.Address;
import com.pn.springjpa.entities.Profile;
import com.pn.springjpa.entities.Tag;
import com.pn.springjpa.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaApplication {

    public static void main(String[] args) {
       // SpringApplication.run(SpringJpaApplication.class, args);

       // User user = new User(1L, "Padmanaban","naban@gmail.com","7113pn");

        User user=User.builder()
                .name("Padmanaban")
                .email("naban@gmail.com")
                .password("7113pn")
                .build();
//
////        Address address = Address.builder()
////                .street("street")
////                .city("city")
////                .state("state")
////                .zip("zip")
////                .build();
////
////        user.addAddress(address);
//
       //user.addTag("tag1");
        var profile = Profile.builder()
                        .bio("bio")
                                .build();
//
//
user.setProfile(profile);

profile.setUser(user);
        System.out.println(user);
    }



}
