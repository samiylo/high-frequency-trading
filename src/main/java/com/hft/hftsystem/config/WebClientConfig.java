package com.hft.hftsystem.config;

import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    WebClient.Builder webClientBuilder() {
        return WebClient.builder()
                .baseUrl("https://www.alphavantage.co")
                .defaultHeader("apikey", System.getenv("API_KEY"));
    }
}
