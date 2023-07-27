package com.example.bookmyshowgit.models;

import com.example.bookmyshowgit.models.enums.Feature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Event extends BaseModel{
    private String name;
    private Date start;
    private Date end;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Feature> requiredFeatures;

    @ManyToOne
    private Auditorium auditorium;

}
