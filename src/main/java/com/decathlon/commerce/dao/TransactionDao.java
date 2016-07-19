package com.decathlon.commerce.dao;

import com.decathlon.commerce.model.Transaction;

import java.util.List;

/**
 * Created by DengYuanqin on 7/18/2016.
 */
public interface TransactionDao {

    List<Transaction> findAllTransactions();

}
