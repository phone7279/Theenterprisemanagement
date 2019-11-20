package com.lw.demo;

import com.lw.entity.RecommendEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class RecommendDemo {

    public String RD() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SessionFactory sessionFactory = (SessionFactory) applicationContext.getBean("sessionFactory");

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Query query =  session.createQuery("from RecommendEntity where id = :id");

        int id = (int)(Math.random()*(10)+1);

        query.setParameter("id", id);

        List<RecommendEntity> list = query.list();

        transaction.commit();

        session.close();

        sessionFactory.close();

        return list.get(0).getContent();
    }

}
