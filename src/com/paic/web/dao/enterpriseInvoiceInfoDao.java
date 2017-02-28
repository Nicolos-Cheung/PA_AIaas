package com.paic.web.dao;

import javax.annotation.Resource;

import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.paic.web.entity.EnterpriseInvoiceInfo;



@Repository
public class EnterpriseInvoiceInfoDao
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
     * 增加企业增值税发票信息
     */
    public void addEnterpriseInvoiceInfo(EnterpriseInvoiceInfo enterpriseinvoiceinfo)
    {
        Session session = this.getSession();
        session.beginTransaction();        
        session.save(enterpriseinvoiceinfo);
        session.getTransaction().commit();
        session.close();
    }
} 