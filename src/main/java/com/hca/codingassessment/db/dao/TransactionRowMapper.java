package com.hca.codingassessment.db.dao;

import com.hca.codingassessment.models.Transaction;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;


public class TransactionRowMapper implements RowMapper<Transaction> {
    @Override
    public Transaction map(ResultSet rs, StatementContext ctx) throws SQLException {
        return new Transaction.Builder()
                .setId(UUID.fromString(rs.getString("id")))
                .setBudtenderId(UUID.fromString(rs.getString("budtender_id")))
                .setLocationId(UUID.fromString(rs.getString("location_id")))
                .setBasketSize(rs.getDouble("basket_size"))
                .setTimestamp(rs.getTimestamp("timestamp_"))
                .build();
    }
}
