package com.mprog.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PersonData {
    private long id;
    private String fio;
    private LocalDate birthday;


}
