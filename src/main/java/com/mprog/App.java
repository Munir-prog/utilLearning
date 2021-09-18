package com.mprog;

import com.mprog.dto.PersonData;
import com.mprog.dto.UserDto;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
public class App {
    public static void main(String[] args) {
        log.info("Hi!");

        var user = new UserDto(1, "Bill", LocalDate.now());
        log.info(user + "");

        var person = new PersonData();
        person.setId(1);
        person.setFio("Peter");
        person.setBirthday(LocalDate.now());

        log.info(person + "");
    }
}
