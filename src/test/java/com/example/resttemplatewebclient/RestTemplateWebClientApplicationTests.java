package com.example.resttemplatewebclient;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class RestTemplateWebClientApplicationTests {

    @Test
    void contextLoads() {
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
