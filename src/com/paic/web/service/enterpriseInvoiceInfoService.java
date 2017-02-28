package com.paic.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paic.web.dao.enterpriseInvoiceInfoDao;
import com.paic.web.entity.enterpriseInvoiceInfo;



@Transactional
@Service
public class enterpriseInvoiceInfoService
{
    @Autowired
    private enterpriseInvoiceInfoDao enterpriseinvoiceinfodao;

    /**
    *增加企业增值税发票信息 
    */
    public void addEnterpriseInvoiceInfo(enterpriseInvoiceInfo enterpriseinvoiceinfo)
    {
        enterpriseinvoiceinfodao.addEnterpriseInvoiceInfo(enterpriseinvoiceinfo);
    }
}