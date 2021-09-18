package com.mprog.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app.properties")
public class MainConfig {

    @Getter
    @Value("#{ T(Math).random() * T(Long).MAX_VALUE }")
    private long random;

}
