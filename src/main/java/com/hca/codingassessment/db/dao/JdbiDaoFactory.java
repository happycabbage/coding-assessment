package com.hca.codingassessment.db.dao;

import org.jdbi.v3.core.Jdbi;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class JdbiDaoFactory {
    @Bean
    public TransactionDAO transactionDAO(Jdbi jdbi) {
        return jdbi.onDemand(TransactionDAO.class);
    }
}
