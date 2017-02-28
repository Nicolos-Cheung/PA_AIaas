package com.paic.web.dao;

import javax.annotation.Resource;

import org.hibernate.Query;


import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.paic.web.entity.UserKey;



@Repository
public class UserKeyDao
{
    @Resource
    private SessionFactory sessionFactory;

    private Session getSession()
    {
        return this.sessionFactory.getCurrentSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    /**
     * 创建accesskey
     */
    public void addUserKey(UserKey userkey)
    {
        Session session = this.getSession();
        session.beginTransaction();
        session.save(userkey);
        session.getTransaction().commit();
        session.close();
    }
    /**
     * 根据accesskeyid删除accesskey
     */
    public void deleteUserKey(String accesskeyid)
    {
        Session session = this.getSession();
        session.beginTransaction();
        Query query = session.createQuery("delete from userkey where accesskey = :accesskeyvalue");
        query.setParameter("accesskeyvalue", accesskeyid);
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }
}