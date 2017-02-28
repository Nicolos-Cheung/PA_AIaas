package com.paic.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paic.web.dao.userCertificateDao;
import com.paic.web.entity.userCertificate;


@Transactional
@Service
public class userCertificateService
{
    @Autowired
    private userCertificateDao usercertificatedao;

    /**
     * 增加用户证书信息
    */
    public void addUserCertificate(userCertificate usercertificate)
    {
        usercertificatedao.addUserCertificate(usercertificate);
    }
    /**
     * 删除用户证书信息
    */
    public void deleteUserCertificate(userCertificate usercertificate)
    {
        usercertificatedao.deleteUserCertificate(usercertificate);
    }

    /**
     * 返回用户证书列表
    */
    public List<userCertificate> getUserCertificate(String userID)
    {
        return usercertificatedao.getUserCertificate(userID);
    }
}