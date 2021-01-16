package com.sda.practical.project.dao;

import com.sda.practical.project.model.TransactionModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TransactionDAO {
    private SessionFactory sessionFactory;

    public TransactionDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addTransaction (TransactionModel transactionModel) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(transactionModel);
        transaction.commit();
        session.close();
    }
}
