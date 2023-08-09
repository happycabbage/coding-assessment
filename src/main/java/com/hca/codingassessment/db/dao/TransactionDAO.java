package com.hca.codingassessment.db.dao;

import com.hca.codingassessment.models.Transaction;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

public interface TransactionDAO {
    @SqlUpdate("insert into transactions (id, basket_size, budtender_id, location_id, timestamp_)" +
            " values (:id, :basketSize, :budtenderId, :locationId, :timestamp)")
    void createTransaction(@BindBean Transaction transaction);

    @SqlQuery("select * from transactions")
    @RegisterRowMapper(TransactionRowMapper.class)
    List<Transaction> getTransactions();
}
