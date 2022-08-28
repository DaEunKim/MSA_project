package org.member.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * packageName    : org.member.core
 * fileName       : ${NAME}
 * author         : ${USER}
 * date           : ${DATE}
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * ${DATE}        ${USER}       최초 생성
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello member-core!");
        SpringApplication.run(Main.class, args);
    }
}