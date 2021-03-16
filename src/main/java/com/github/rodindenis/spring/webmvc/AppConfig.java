package com.github.rodindenis.spring.webmvc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@ComponentScan("com.github.rodindenis.spring.webmvc.api")
public class AppConfig {
    public AppConfig() {
      log.info("AppConfig init done");
    }
}
