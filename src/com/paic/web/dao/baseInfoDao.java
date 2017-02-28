package com.paic.web.dao;

import javax.annotation.Resource;

import org.hibernate.Query;


import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.paic.web.entity.baseInfo;


@Repository
public class baseInfoDao
{
    @Resource
    private SessionFactory sessionFactory;

    private Session getSession()
    {
        Session session = sessionFactory.getCurrentSession();
        return session;
    }
    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    /**
     * 根据username获取baseinfo对象
     */
    public baseInfo getBaseInfoByUsername(String username)
    {
        return (baseInfo)this.getSession().createQuery("from baseInfo where username = ?").setParameter(0, "username").uniqueResult();
    }
    /**
     * 根据电话号码获取baseinfo对象
     */
    public baseInfo getBaseInfoByTelnumber(String telnumber)
    {
        return (baseInfo)this.getSession().createQuery("from baseInfo where telnumber = ?").setParameter(0, telnumber).uniqueResult();
    }
    /**
     * 根据email获取baseinfo对象
     */
    public baseInfo getBaseInfoByEmail(String email)
    {
        return (baseInfo)this.getSession().createQuery("from baseInfo where email = ?").setParameter(0, email).uniqueResult();
    }
    /**
     * 根据userID获取baseinfo对象
     */
    public baseInfo getBaseInfoByUserID(String userID)
    {
        return (baseInfo)this.getSession().createQuery("from baseInfo where userID = ?").setParameter(0, userID).uniqueResult();
    }

    /**
     * 根据uuid更新基本信息
     */
    public void updateBaseInfo(baseInfo baseinfo)
    {
        //this.getSession().update(baseinfo);
        Session session = this.getSession();
        session.beginTransaction();
        Query query = session.createQuery("update baseInfo info set info.username = :username,info.property = :property,info.primaryclassification = :primaryclassification,info.secondaryclassification = :secondaryclassification,info.bussiness = :bussiness,info.url = :url where info.userID = :userID");
        query.setParameter("username", baseinfo.getUsername());
        query.setParameter("property", baseinfo.getProperty());
        query.setParameter("primaryclassification", baseinfo.getPrimaryclassification());
        query.setParameter("secondaryclassification", baseinfo.getSecondaryclassification());
        query.setParameter("bussiness", baseinfo.getBussiness());
        query.setParameter("url", baseinfo.getUrl());
        query.setParameter("userID", baseinfo.getUserID());
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }
    /**
     *更新电话号码
     */
    public void updateTelNumber(String userID,String telnumber)
    {
        Session session = this.getSession();
        session.beginTransaction();
        Query query = session.createQuery("update userInfo info set info.telnumber = :telnumber where info.userID = :UserID");
        query.setParameter("telnumber", telnumber);
        query.setParameter("userID", userID);
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }

    /**
     *更新email
     */
    public void updateEmail(String userID,String email)
    {
        Session session = this.getSession();
        session.beginTransaction();
        Query query = session.createQuery("update userInfo info set info.email = :email where info.userID = :UserID");
        query.setParameter("email", email);
        query.setParameter("userID", userID);
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }
    /**
     *更新用户密码
     */
    public void updatePassWord(String userID,String password)
    {
        Session session = this.getSession();
        session.beginTransaction();
        Query query = session.createQuery("update userInfo info set info.password = :password where info.userID = :UserID");
        query.setParameter("password", password);
        query.setParameter("userID", userID);
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }
}