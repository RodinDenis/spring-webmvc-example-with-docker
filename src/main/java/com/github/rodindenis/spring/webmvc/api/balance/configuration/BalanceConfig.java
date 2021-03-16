package com.github.rodindenis.spring.webmvc.api.balance.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BalanceConfig {
    public BalanceConfig() {
      log.info("BalanceConfig init done");
    }
}
