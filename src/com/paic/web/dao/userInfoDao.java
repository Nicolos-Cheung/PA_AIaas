package com.paic.web.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.paic.web.entity.userInfo;

@Repository
public class userInfoDao
{
	@Resource
	private SessionFactory sessionFactory;
	
    public Session getSession() 
    {
    	Session session = sessionFactory.getCurrentSession();
        return session;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
	public List<userInfo> getAllUser(){
        String hsql="from userInfo";
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hsql);
        return query.list();
    }
    
    /**
     * 根据username查询
     * @param username
     * @return
     */
    public userInfo getUserByUserName(String username) 
    {
        return (userInfo) this.getSession().createQuery("from userInfo where username=?").setParameter(0, username).uniqueResult();
    }
    public userInfo getUserByTelnum(String telnum) 
    {
        return (userInfo) this.getSession().createQuery("from userInfo where username=?").setParameter(0, telnum).uniqueResult();
    }
    /**
     * 添加
     * @param person
     */
    public void addUser(userInfo user) 
    {
    	this.getSession().save(user);
    }
    /**
     * 更新
     * @param person
     */
    public void updateUser(userInfo user) {
        this.getSession().update(user);
    }
    /**
     * 删除
     * @param id
     */
    public void deleteUserById(String id) {
        this.getSession().createQuery("delete user where id=?").setParameter(0, id).executeUpdate();
    }
    /**
     * 查询所有
     * @return
     */
    @SuppressWarnings("unchecked")
    public List<userInfo> getUser() {
        return this.getSession().createCriteria(userInfo.class).list();
    }
}
