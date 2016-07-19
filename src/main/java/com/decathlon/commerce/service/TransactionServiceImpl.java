package com.decathlon.commerce.service;

import com.decathlon.commerce.dao.TransactionDao;
import com.decathlon.commerce.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by DengYuanqin on 7/19/2016.
 */
@Service("userService")
@Transactional
public class TransactionServiceImpl implements TransactionService{

    @Autowired
    private TransactionDao transactionDao;

    @Override
    public List<Transaction> findAllTransactions() {
        return transactionDao.findAllTransactions();
    }
}
