package com.example.limitsService.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties("limit-server")
public class Configuration {
    private int maximum;
    private int minimum;
}
