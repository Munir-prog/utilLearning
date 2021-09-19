package com.mprog.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageService {

    private static final Object[] EMPTY_ARGS = new Object[0];

    private final MessageSource messageSource;
    private final LocaleService localeService;

    public String localize(String code, Object ... params) {
        return messageSource.getMessage(code, params, localeService.getCurrent());
    }
}
