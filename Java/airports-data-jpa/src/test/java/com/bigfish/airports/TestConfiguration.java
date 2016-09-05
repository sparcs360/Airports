package com.bigfish.airports;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration for Integration Tests
 * 
 * @author Lee Newfeld
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
//@Profile("dev")
public class TestConfiguration {

}
