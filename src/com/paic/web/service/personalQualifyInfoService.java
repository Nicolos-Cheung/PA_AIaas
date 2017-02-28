package com.paic.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paic.web.dao.PersonalQualifyInfoDao;
import com.paic.web.entity.PersonalQualifyInfo;


@Transactional
@Service
public class PersonalQualifyInfoService
{
    @Autowired
    private PersonalQualifyInfoDao personalqualifyinfodao;
    /**
     * 添加个人认证证书信息
    */
    public void addPersonalCertificateInfo(PersonalQualifyInfo personalqualifyinfo)
    {
        personalqualifyinfodao.addPersonalCertificateInfo(personalqualifyinfo);
    }
}