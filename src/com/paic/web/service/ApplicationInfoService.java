package com.paic.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paic.web.dao.ApplicationInfoDao;
import com.paic.web.entity.ApplicationInfo;


@Service
public class ApplicationInfoService
{
    @Autowired
    private ApplicationInfoDao applicationinfodao;
    /**
     * 添加应用信息
     */
    public void addApplicationInfoItem(ApplicationInfo applicationinfo)
    {
        applicationinfodao.addApplicationInfoItem(applicationinfo);
    }
    /**
     * 删除应用信息
     */
    public void deleteApplicationInfoItem(ApplicationInfo applicationinfo)
    {
        applicationinfodao.deleteApplicationInfoItem(applicationinfo);
    }
}