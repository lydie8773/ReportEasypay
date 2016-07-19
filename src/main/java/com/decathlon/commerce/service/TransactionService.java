package com.decathlon.commerce.service;

import com.decathlon.commerce.model.Transaction;

import java.util.List;

/**
 * Created by DengYuanqin on 7/19/2016.
 */
public interface TransactionService {

    List<Transaction> findAllTransactions();
}
