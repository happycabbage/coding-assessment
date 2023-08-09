package com.hca.codingassessment.db.dao;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class JdbiConfiguration {
  @Bean
  public Jdbi jdbi(DataSource ds) {
    Jdbi jdbi = Jdbi.create(ds);
    jdbi.installPlugin(new SqlObjectPlugin());
    return jdbi;
  }
}
