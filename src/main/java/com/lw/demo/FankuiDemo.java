package com.lw.demo;

import com.lw.fankui.FankuiEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.List;

public class FankuiDemo {
    public boolean insert(String name, String email, String phone, String message) {
        Configuration cfg = new Configuration();

        cfg.configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction ta = session.beginTransaction();

        FankuiEntity fankuiEntity = new FankuiEntity(name, email, phone, message);

        session.save(fankuiEntity);

        session.close();

        sessionFactory.close();

        return true;
    }

    public List<FankuiEntity> selected() {
        Configuration cfg = new Configuration();

        cfg.configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction ta = session.beginTransaction();

        Query query =  session.createQuery("from FankuiEntity ");

        List<FankuiEntity> list = query.list();

        session.close();

        sessionFactory.close();

        return list;

    }

}
