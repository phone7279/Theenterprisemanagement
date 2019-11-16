package com.lw.demo;

import com.lw.fankui.FankuiEntity;
import com.lw.recommend.RecommendEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class RecommendDemo {

    public String RD() {
        Configuration cfg = new Configuration();

        cfg.configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction ta = session.beginTransaction();

        Query query =  session.createQuery("from RecommendEntity where id = :id");

        int id = (int)(Math.random()*(10)+1);

        query.setParameter("id", id);

        List<RecommendEntity> list = query.list();

        session.close();

        sessionFactory.close();

        return list.get(0).getContent();
    }

}
