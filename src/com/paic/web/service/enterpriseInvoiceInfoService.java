package com.paic.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paic.web.dao.EnterpriseInvoiceInfoDao;
import com.paic.web.entity.EnterpriseInvoiceInfo;



@Transactional
@Service
public class EnterpriseInvoiceInfoService
{
    @Autowired
    private EnterpriseInvoiceInfoDao enterpriseinvoiceinfodao;

    /**
    *增加企业增值税发票信息 
    */
    public void addEnterpriseInvoiceInfo(EnterpriseInvoiceInfo enterpriseinvoiceinfo)
    {
        enterpriseinvoiceinfodao.addEnterpriseInvoiceInfo(enterpriseinvoiceinfo);
    }
}