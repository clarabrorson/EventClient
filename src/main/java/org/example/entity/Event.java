package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    private long id;
    private String eventName;
    private String eventDescription;
    private String eventDate;
    private String location;
    private String organizer;
    private String category;
}
