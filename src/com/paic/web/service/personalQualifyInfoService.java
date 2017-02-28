package com.paic.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paic.web.dao.personalQualifyInfoDao;
import com.paic.web.entity.personalQualifyInfo;


@Transactional
@Service
public class personalQualifyInfoService
{
    @Autowired
    private personalQualifyInfoDao personalqualifyinfodao;
    /**
     * 添加个人认证证书信息
    */
    public void addPersonalCertificateInfo(personalQualifyInfo personalqualifyinfo)
    {
        personalqualifyinfodao.addPersonalCertificateInfo(personalqualifyinfo);
    }
}