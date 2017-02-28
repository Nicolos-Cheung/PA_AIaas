package com.paic.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paic.web.dao.EnterpriseQualifyInfoDao;


import com.paic.web.entity.EnterpriseQualifyInfo;

@Transactional
@Service
public class EnterpriseQualifyInfoService
{
    @Autowired
    private EnterpriseQualifyInfoDao  enterprisequalifyinfodao;

    /**
     * 增加企业实名认证信息
    */
    public void addEnterpriseQualifyInfo(EnterpriseQualifyInfo qualifyInfo)
    {
        enterprisequalifyinfodao.addEnterpriseQualifyInfo(qualifyInfo);
    }
    /**
     * 删除企业实名认证信息
    */
    public void deleteEnterpriseQualifyInfo(EnterpriseQualifyInfo qualifyInfo)
    {
        enterprisequalifyinfodao.deleteEnterpriseQualifyInfo(qualifyInfo);
    }

}