package com.paic.web.dao;

import javax.annotation.Resource;

import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.paic.web.entity.Contact;



@Repository
public class ContactDao
{
    @Resource
    public SessionFactory sessionFactory;

    private Session getSession()
    {
        Session session = this.sessionFactory.getCurrentSession();
        return session;
    }

    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }

    /**
     * 增加联系人
     */
    public void addContact(Contact contactuser)
    {
        Session session = this.getSession();
        session.beginTransaction();
        session.save(contactuser);
        session.getTransaction().commit();
        session.close();
    }
    /**
     * 删除联系人
     */
    public void deleteContact(Contact contactuser)
    {
        Session session = this.getSession();
        session.beginTransaction();
        session.delete(contactuser);
        session.getTransaction().commit();
        session.close();
    }

}