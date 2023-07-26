package com.example.bookmyshowgit;

import com.example.bookmyshowgit.models.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookMyShowGitApplication {

    public static void main(String[] args) {

        Test obj = new Test();
        SpringApplication.run(BookMyShowGitApplication.class, args);
    }

}
