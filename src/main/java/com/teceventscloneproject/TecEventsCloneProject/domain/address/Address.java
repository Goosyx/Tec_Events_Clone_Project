package com.teceventscloneproject.TecEventsCloneProject.domain.address;

import com.teceventscloneproject.TecEventsCloneProject.domain.Event;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue
    private UUID id;

    private String city;

    private String uf;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
