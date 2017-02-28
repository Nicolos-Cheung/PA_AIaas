package com.paic.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 * 用户管理中心
 */
@Controller
public class UserManageCenterController
{
    //用户中心
    @RequestMapping(value = "userInfoAction",method = RequestMethod.POST)
    public ModelAndView userInfo()
    {
        return new ModelAndView("/");
    }

    //用户中心-基本信息
    @RequestMapping(value = "baseInfoAction",method = RequestMethod.POST)
    public ModelAndView baseInfo()
    {
        return new ModelAndView("/");
    }

    //用户中心-安全信息
    @RequestMapping(value = "authInfoAction",method = RequestMethod.POST)
    public ModelAndView authInfo()
    {
        return new ModelAndView("/");
    }

    //用户中心-联系人管理
    @RequestMapping(value = "contactManageAction",method = RequestMethod.POST)
    public ModelAndView contactManage()
    {
        return new ModelAndView("/");
    }

    //accessList
    @RequestMapping(value = "accessListAction",method = RequestMethod.POST)
    public ModelAndView accessList()
    {
        return new ModelAndView("/");
    }
    //accessList-实名认证（安全认证）
    @RequestMapping(value = "userQualifyAction",method = RequestMethod.POST)
    public ModelAndView userQualify()
    {
        return new ModelAndView("/");
    }
    //accessList-资质认证
    @RequestMapping(value = "QualifyAction",method = RequestMethod.POST)
    public ModelAndView qualify()
    {
        return new ModelAndView("/");
    }
    //accessList-证书管理
    @RequestMapping(value = "licenseManageAction",method = RequestMethod.POST)
    public ModelAndView licenseManage()
    {
        return new ModelAndView("/");
    }

    //退出登录
    @RequestMapping(value = "logoutAction",method = RequestMethod.POST)
    public ModelAndView logout()
    {
        return new ModelAndView("/");
    }
}