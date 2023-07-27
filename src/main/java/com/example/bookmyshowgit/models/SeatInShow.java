package com.example.bookmyshowgit.models;

import com.example.bookmyshowgit.models.enums.SeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class SeatInShow extends BaseModel{
    private SeatStatus seatStatus;

    @ManyToOne
    private Seat seat;

    @ManyToOne
    private Event event;

    @ManyToOne
    private Ticket ticket;

    private Date statusUpdatedAt;
}
