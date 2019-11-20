package com.lw.demo;

import com.lw.entity.AutoReplyEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class AutoReplyDemo {
    public String selected(String Receive) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory sessionFactory = (SessionFactory) applicationContext.getBean("sessionFactory");
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "from AutoReplyEntity s where s.mReceive like :receive";
        Query query = session.createQuery(hql);
        query.setParameter("receive", ("%"+Receive+"%"));
        List<AutoReplyEntity> list = query.list();
        String string = null;
        for (AutoReplyEntity a:list){
            string = a.getmSend();
        }
        if(string == null) {
            string = "抱歉，我不知道你在说什么，请再说一遍!";
        }
        transaction.commit();
        session.close();
        sessionFactory.close();
        return string;
    }
}
