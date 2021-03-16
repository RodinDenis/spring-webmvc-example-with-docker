package com.github.rodindenis.spring.webmvc.api.balance.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class BalanceRepository {
    public BalanceRepository() {
      log.info("BalanceRepository init done");
    }
}
