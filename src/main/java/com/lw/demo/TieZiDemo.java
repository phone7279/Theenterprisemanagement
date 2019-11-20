package com.lw.demo;

import com.lw.entity.TieziEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TieZiDemo {

    public List<TieziEntity> selectedTop() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SessionFactory sessionFactory = (SessionFactory) applicationContext.getBean("sessionFactory");

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from TieziEntity where rId = null");
        List<TieziEntity> list = query.list();

        transaction.commit();

        session.close();

        sessionFactory.close();

        return list;

    }

    public TieziEntity selectedTop(int id) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SessionFactory sessionFactory = (SessionFactory) applicationContext.getBean("sessionFactory");

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from TieziEntity where rId = null and id = :id");
        query.setParameter("id", id);
        List<TieziEntity> list = query.list();
        TieziEntity tieziEntity = list.get(0);

        transaction.commit();

        session.close();

        sessionFactory.close();

        return tieziEntity;

    }

    public List<TieziEntity> selectedLast(int id) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SessionFactory sessionFactory = (SessionFactory) applicationContext.getBean("sessionFactory");

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from TieziEntity where rId = :id");
        query.setParameter("id", id);
        List<TieziEntity> list = query.list();

        transaction.commit();

        session.close();

        sessionFactory.close();

        return list;

    }

    public boolean insertTop(String title, String name, String message) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SessionFactory sessionFactory = (SessionFactory) applicationContext.getBean("sessionFactory");

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        TieziEntity tieziEntity = new TieziEntity();
        tieziEntity.setTitle(title);
        tieziEntity.setName(name);
        tieziEntity.setMessage(message);
        session.save(tieziEntity);

        transaction.commit();

        session.close();

        sessionFactory.close();

        return true;
    }

    public void insertLast(String name, String message, int rid) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SessionFactory sessionFactory = (SessionFactory) applicationContext.getBean("sessionFactory");

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        TieziEntity tieziEntity = new TieziEntity();
        tieziEntity.setName(name);
        tieziEntity.setMessage(message);
        tieziEntity.setrId(rid);
        session.save(tieziEntity);

        transaction.commit();

        session.close();

        sessionFactory.close();

    }

    public void insertLast2(String name, String message, int rid , String rname) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SessionFactory sessionFactory = (SessionFactory) applicationContext.getBean("sessionFactory");

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        TieziEntity tieziEntity = new TieziEntity();
        tieziEntity.setName(name);
        tieziEntity.setMessage(message);
        tieziEntity.setrId(rid);
        tieziEntity.setrName(rname);
        session.save(tieziEntity);

        transaction.commit();

        session.close();

        sessionFactory.close();

    }

    public void delete(int id){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SessionFactory sessionFactory = (SessionFactory) applicationContext.getBean("sessionFactory");

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        String hql = "delete TieziEntity where id = :id";
        Query query = session.createQuery(hql);
        query.setParameter("id",id);
        query.executeUpdate();

        transaction.commit();

        session.close();

        sessionFactory.close();
    }

    public boolean update(int id, String jEmail, String jMessage) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SessionFactory sessionFactory = (SessionFactory) applicationContext.getBean("sessionFactory");

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        transaction.commit();

        session.close();

        sessionFactory.close();

        return true;

    }

}
