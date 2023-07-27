package com.example.bookmyshowgit.models;

import com.example.bookmyshowgit.models.enums.PaymentProvider;
import com.example.bookmyshowgit.models.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private float amount;
    private String transactionId;

    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;

    @Enumerated(EnumType.ORDINAL)
    private PaymentProvider paymentProvider;

    @ManyToOne
    private Ticket ticket;
}
