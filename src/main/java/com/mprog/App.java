package com.mprog;

import com.mprog.dto.UserDto;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        System.out.println("Hi!");

        var user = new UserDto(1, "Bill", LocalDate.now());
        System.out.println(user);
    }
}
