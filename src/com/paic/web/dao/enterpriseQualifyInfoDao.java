package com.paic.web.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.paic.web.entity.EnterpriseQualifyInfo;

@Repository
public class EnterpriseQualifyInfoDao
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
     * 增加企业实名认证信息
     * */
    public void addEnterpriseQualifyInfo(EnterpriseQualifyInfo qualifyInfo)
    {
        Session session = this.getSession();
        session.beginTransaction();
        session.save(qualifyInfo);
        session.getTransaction().commit();
        session.close();
    }
    /**
     * 删除企业实名认证信息
     * */
    public void deleteEnterpriseQualifyInfo(EnterpriseQualifyInfo qualifyInfo)
    {
        Session session = this.getSession();
        session.beginTransaction();
        session.delete(qualifyInfo);
        session.getTransaction().commit();
        session.close();
    }
}