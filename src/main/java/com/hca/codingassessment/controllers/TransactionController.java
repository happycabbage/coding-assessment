package com.hca.codingassessment.controllers;

import com.hca.codingassessment.db.dao.TransactionDAO;
import com.hca.codingassessment.models.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionDAO transactionDAO;

    @Autowired
    public TransactionController(TransactionDAO transactionDAO) {
        this.transactionDAO = transactionDAO;
    }

    @GetMapping
    List<Transaction> getTransactions() {
        return this.transactionDAO.getTransactions();
    }

    @PostMapping
    Transaction createTransaction(@RequestBody Transaction transaction) {
        this.transactionDAO.createTransaction(transaction);
        return transaction;
    }
}
