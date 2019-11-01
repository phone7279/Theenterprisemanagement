package com.lw.demo;

import com.lw.fankui.FankuiEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.List;

public class FankuiDemo {

    public List<FankuiEntity> selected() {
        Configuration cfg = new Configuration();

        cfg.configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Query query =  session.createQuery("from FankuiEntity ");

        List<FankuiEntity> list = query.list();

        transaction.commit();

        session.close();

        sessionFactory.close();

        return list;

    }

    public boolean insert(String name, String email, String phone, String message){
        Configuration cfg = new Configuration();

        cfg.configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        FankuiEntity fankuiEntity = new FankuiEntity(name, email, phone, message);

        session.save(fankuiEntity);

        transaction.commit();

        session.close();

        sessionFactory.close();

        return true;
    }

    public boolean update(int id, String jEmail, String jMessage) {
        Configuration cfg = new Configuration();

        cfg.configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        FankuiEntity fankuiEntity = session.get(FankuiEntity.class, id);

        fankuiEntity.setjEmail(jEmail);

        fankuiEntity.setjMessage(jMessage);

        session.update(fankuiEntity);

        transaction.commit();

        session.close();

        sessionFactory.close();

        return true;

    }

}
