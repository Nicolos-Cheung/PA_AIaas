package com.paic.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paic.web.dao.baseInfoDao;
import com.paic.web.entity.baseInfo;


@Transactional
@Service
public class baseInfoService
{
    @Autowired
    private baseInfoDao baseinfodao;
    /**
     * 根据用户名获取用户基本信息
    */
    public baseInfo getBaseInfoByUsername(String username)
    {
        return baseinfodao.getBaseInfoByUsername(username);
    }
    /**
     * 根据电话号码获取用户基本信息
    */
    public baseInfo getBaseInfoByTelnumber(String telnumber)
    {
        return baseinfodao.getBaseInfoByTelnumber(telnumber);
    }
    /**
     * 根据uuid获取用户基本信息
    */
    public baseInfo getBaseInfoByUserID(String userID)
    {
        return baseinfodao.getBaseInfoByUserID(userID);
    }
    /**
     * 根据邮件地址获取用户基本信息
    */
    public baseInfo getBaseInfoByEmail(String email)
    {
        return baseinfodao.getBaseInfoByEmail(email);
    }
    /**
     * 更新用户全部基本信息
    */
    public void updateBaseInfo(baseInfo baseinfo)
    {
        baseinfodao.updateBaseInfo(baseinfo);
    }
    /**
     * 更新用户email
    */
    public void updateEmail(String userID,String email)
    {
        baseinfodao.updateEmail(userID, email);
    }
    /**
     * 更新用户密码
    */
    public void updatePassWord(String userID,String password)
    {
        baseinfodao.updatePassWord(userID, password);
    }
    /**
     * 更新用户电话号码
    */
    public void updateTelNumber(String userID,String telnumber)
    {
        baseinfodao.updateTelNumber(userID, telnumber);
    }

}