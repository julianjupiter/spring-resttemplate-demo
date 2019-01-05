package io.github.julianjupiter.springresttemplatedemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
