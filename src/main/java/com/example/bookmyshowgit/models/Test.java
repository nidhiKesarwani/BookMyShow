package com.example.bookmyshowgit.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Test {
    @Id
    private Long id;
    private String name;
}
