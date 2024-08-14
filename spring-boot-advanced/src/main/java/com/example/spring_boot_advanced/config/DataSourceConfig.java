package com.example.spring_boot_advanced.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.datasource")
public class DataSourceConfig {
    private String url;
    private String username;
    private String password;

}
