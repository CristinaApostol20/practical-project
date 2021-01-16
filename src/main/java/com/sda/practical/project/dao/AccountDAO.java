package com.sda.practical.project.dao;

import com.sda.practical.project.model.AccountsModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AccountDAO {
    SessionFactory sessionFactory;

    public AccountDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addAccount(AccountsModel accountsModel) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(accountsModel);
        transaction.commit();
        session.close();
    }
}
