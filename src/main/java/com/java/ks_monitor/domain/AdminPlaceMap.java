package com.java.ks_monitor.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AdminPlaceMap {
    private Long id;
    private long PlaceId;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
