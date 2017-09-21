package com.flipkart.gradle.config;

import com.flipkart.gradle.controller.GreetingController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by imteyaz.khan on 06/07/17.
 */
@Configuration

public class ControllerConfig {
    @Bean
    public GreetingController greetingController() {
        return new GreetingController();
    }

}
