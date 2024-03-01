package com.java.ks_monitor.domain;

import com.java.ks_monitor.constant.EventStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Event {

    private Long id;
    private Long placedId;
    private EventStatus eventStatus;
    private LocalDateTime eventStartDatetime;
    private LocalDateTime eventEndDatetime;
    private  Integer currentNumberOfPeople;
    private Integer capacity;
    private LocalDateTime createAt;
    private LocalDateTime modifiedAt;
}
