package com.paic.web.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.Source;
import org.springframework.stereotype.Repository;

import com.paic.web.entity.ApplicationInfo;



@Repository
public class ApplicationInfoDao
{
    @Source
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
     * 删除应用信息
     */
    public void deleteApplicationInfoItem(ApplicationInfo applicationinfo)
    {
        Session session = this.getSession();
        session.beginTransaction();
        session.delete(applicationinfo);
        session.getTransaction().commit();
        session.close();
    }
    /**
     * 增加应用信息
     **/
    public void addApplicationInfoItem(ApplicationInfo applicationinfo)
    {
        Session session = this.getSession();
        session.beginTransaction();
        session.save(applicationinfo);
        session.getTransaction().commit();
        session.close();
    }
}