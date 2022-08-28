package org.member.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MemberCoreApplication {
    public static void main(String[] args) {
        System.out.println("Hello member-core!");
        SpringApplication.run(MemberCoreApplication.class, args);
    }
}