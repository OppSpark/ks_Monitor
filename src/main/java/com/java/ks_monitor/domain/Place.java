package com.java.ks_monitor.domain;

import com.java.ks_monitor.constant.PlaceType;

import java.time.LocalDateTime;

public class Place {
    private Long id;

    private PlaceType placeType;
    private String placeName;
    private String address;
    private String phoneNumber;
    private Integer capacity;
    private String name;
    private LocalDateTime createAt;
    private LocalDateTime modifiedAt;
}
