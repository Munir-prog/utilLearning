package com.mprog.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class LocaleService {

    @Getter @Setter
    private Locale germany = Locale.GERMANY;
    @Getter @Setter
    private Locale english = Locale.ENGLISH;
    @Getter @Setter
    private Locale current = Locale.forLanguageTag("ru");

}
