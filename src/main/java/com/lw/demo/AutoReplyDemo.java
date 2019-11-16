package com.lw.demo;

import com.lw.auto_reply.AutoReplyEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.List;

public class AutoReplyDemo {
    public String selected(String Receive) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction ta = session.beginTransaction();

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
        session.close();
        sessionFactory.close();
        return string;
    }
}
