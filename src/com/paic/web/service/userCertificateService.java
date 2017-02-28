package com.paic.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paic.web.dao.UserCertificateDao;
import com.paic.web.entity.UserCertificate;


@Transactional
@Service
public class UserCertificateService
{
    @Autowired
    private UserCertificateDao usercertificatedao;

    /**
     * 增加用户证书信息
    */
    public void addUserCertificate(UserCertificate usercertificate)
    {
        usercertificatedao.addUserCertificate(usercertificate);
    }
    /**
     * 删除用户证书信息
    */
    public void deleteUserCertificate(UserCertificate usercertificate)
    {
        usercertificatedao.deleteUserCertificate(usercertificate);
    }

    /**
     * 返回用户证书列表
    */
    public List<UserCertificate> getUserCertificate(String userID)
    {
        return usercertificatedao.getUserCertificate(userID);
    }
}