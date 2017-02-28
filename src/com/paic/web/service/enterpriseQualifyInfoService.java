package com.paic.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paic.web.dao.enterpriseQualifyInfoDao;


import com.paic.web.entity.enterpriseQualifyInfo;

@Transactional
@Service
public class enterpriseQualifyInfoService
{
    @Autowired
    private enterpriseQualifyInfoDao  enterprisequalifyinfodao;

    /**
     * 增加企业实名认证信息
    */
    public void addEnterpriseQualifyInfo(enterpriseQualifyInfo qualifyInfo)
    {
        enterprisequalifyinfodao.addEnterpriseQualifyInfo(qualifyInfo);
    }
    /**
     * 删除企业实名认证信息
    */
    public void deleteEnterpriseQualifyInfo(enterpriseQualifyInfo qualifyInfo)
    {
        enterprisequalifyinfodao.deleteEnterpriseQualifyInfo(qualifyInfo);
    }

}