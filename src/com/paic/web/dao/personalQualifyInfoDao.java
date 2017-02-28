package com.paic.web.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.paic.web.entity.personalQualifyInfo;



@Repository
public class personalQualifyInfoDao
{
    @Resource
    private SessionFactory sessionFactory;
    private Session getsession()
    {
        return this.sessionFactory.getCurrentSession();
    }
    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    /**
     * 添加个人认证证书
     */
    public void addPersonalCertificateInfo(personalQualifyInfo personalqualifyinfo)
    {
        Session session = this.getsession();
        session.beginTransaction();
        session.save(personalqualifyinfo);
        session.getTransaction().commit();
        session.close();
    }
}