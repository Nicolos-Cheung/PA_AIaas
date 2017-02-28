package com.paic.web.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;


import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.paic.web.entity.userCertificate;


@Repository
public class userCertificateDao
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
     * 增加证书
     */
    public void addUserCertificate(userCertificate usercertificate)
    {
        Session session = this.getSession();
        session.beginTransaction();
        session.save(usercertificate);
        session.getTransaction().commit();
        session.close();
    }
    /**
     * 删除证书
     */
    public void deleteUserCertificate(userCertificate usercertificate)
    {
        Session session = this.getSession();
        session.beginTransaction();
        session.delete(usercertificate);
        session.getTransaction();
        session.close();
    }
    /**
     * 返回用户证书列表
     */
    public List<userCertificate> getUserCertificate(String userID)
    {
        Session session = this.getSession();
        session.beginTransaction();
        Query query = session.createQuery("select from userCertificate where userID = :userid");
        query.setParameter("userid", userID);
        session.getTransaction().commit();
        session.close();
        return query.list();
    }
}