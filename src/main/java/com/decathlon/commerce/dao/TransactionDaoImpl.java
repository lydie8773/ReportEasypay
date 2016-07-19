package com.decathlon.commerce.dao;

import com.decathlon.commerce.model.Transaction;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by DengYuanqin on 7/18/2016.
 */

@Repository("transactionDao")
public class TransactionDaoImpl extends AbstractDao<Integer,Transaction> implements TransactionDao{

    static final Logger logger = LoggerFactory.getLogger(TransactionDaoImpl.class);

    private AbstractDao abstractDao ;


    @Override
    public List<Transaction> findAllTransactions() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("transact_id"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
        criteria.setMaxResults(10);


        List<Transaction> transactionList = criteria.list();

        return transactionList;
    }
}
