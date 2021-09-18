package com.mprog.config;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@ToString
public class Settings {

    @Value("${app.server.url}")
    private String serverUrl;

    @Value("${app.server.ip}")
    private String serverIP;

    @Value("${app.server.port}")
    private String serverPort;

    @Value("${app.username}")
    private String username;

    @Value("${app.password}")
    private String password;

}
