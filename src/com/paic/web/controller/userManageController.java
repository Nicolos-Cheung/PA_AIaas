package com.paic.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.paic.web.entity.UserInfo;
import com.paic.web.form.UserForm;
import com.paic.web.service.UserService;

@Controller
public class UserManageController 
{
	@Autowired
    public UserService userservice;
	@RequestMapping("index")
    public ModelAndView index()
	{  
		System.out.println("index.jsp"); 
        //创建模型和视图,用于渲染页面
        ModelAndView mv = new ModelAndView(); 
        mv.setViewName("/rxIndex");  
        return mv;
    }
	
	@RequestMapping("login")
    public ModelAndView login()
	{  
		System.out.println("login.html"); 
        //创建模型和视图,用于渲染页面
        ModelAndView mv = new ModelAndView(); 
        mv.setViewName("/rxLogin");  
        return mv;
    }
	@RequestMapping(value ="loginAction", method = RequestMethod.POST)  
	public ModelAndView login(UserForm user)  
	{  
		System.out.println("loginAction");
		String name = user.getUsername();
		String passwd = user.getPassword();
		System.out.println(name + ":" + passwd);
		UserInfo userinfo = new UserInfo();
		userinfo = userservice.getUserByUserName(name);
		if(userinfo != null)
		{
			System.out.println(userinfo.getUsername() + ":" + userinfo.getPassword());
			if(userinfo.getUsername().equals(name)&&userinfo.getPassword().equals(passwd))
			{
				//登录成功
				ModelAndView mv = new ModelAndView();  
				mv.setViewName("/rxIndex");  
				return mv; 
			}
			else
			{
				//用户名或者密码错误
				System.out.println("用户名或者密码错误");
				return new ModelAndView("/rxLoginResult","tip","用户名或密码错误");
			}
		}
		else
		{
			//用户名不存在
			System.out.println("用户名不存在");
			return new ModelAndView("/rxLoginResult","tip","用户名不存在,请注册后使用");
		}
	}  
	@RequestMapping("register")  
    public ModelAndView register()
	{  
		System.out.println("register.html"); 
        //创建模型和视图,用于渲染页面
        ModelAndView mv = new ModelAndView();  
        mv.setViewName("/rxRegister");  
        return mv;  
    }  
	@RequestMapping(value ="registerAction", method = RequestMethod.POST)  
	public ModelAndView register(UserForm user)
	{  
		System.out.println("registerAction"); 
		UserInfo userinfo = new UserInfo();
		userinfo.setUsername(user.getUsername());
		userinfo.setPassword(user.getPassword());
		userinfo.setTelnumber(user.getTelnum());
		System.out.println(userinfo.getUsername()+userinfo.getPassword()+userinfo.getTelnumber()); 
		userservice.addUser(userinfo);
        //创建模型和视图,用于渲染页面
		return new ModelAndView("/rxRegSuc","username",userinfo.getUsername()); 
    }  
	//发送手机短信
	/*@RequestMapping(value = "sendMessageAction",method = RequestMethod.POST)
	public ModelAndView sendMessage(UserForm user)
	{
		//
		System.out.println("发送短信");
		System.out.println(user.getTelnum());
		return new ModelAndView("/rxRegisterResult","tip","用户名不存在,请注册后使用");
	}*/
	@RequestMapping(value = "sendMessageAction",method = RequestMethod.POST)
	public @ResponseBody String sendMessage(UserForm user)
	{
		System.out.println("发送短信");
		UserInfo userinfo = new UserInfo();
		userinfo = userservice.getUserByTelnum(user.getTelnum());
		if(userinfo == null)
		{
			return new String("");
		}
		else
		{
			return new String("手机号已被注册");
		}
	}
}


