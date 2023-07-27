package com.example.bookmyshowgit.models;

import com.example.bookmyshowgit.models.enums.Feature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{
    private String name;
    private int numberOfRows;
    private int numberOfColumns;
    @ManyToOne
    private Theatre theatre;

    @OneToMany(mappedBy = "auditorium")
    private List<Seat> seats;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Feature> supportedFeatures;

    @OneToMany(mappedBy = "auditorium")
    private List<Event> events;
}
