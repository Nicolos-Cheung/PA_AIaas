package com.paic.web.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paic.web.dao.userInfoDao;
import com.paic.web.entity.userInfo;

@Transactional 
@Service
public class userService 
{
	@Autowired
	private userInfoDao userinfodao;
    
    /**
     * 添加
     * @param user
     */
    public void addUser(userInfo user) {
    	userinfodao.addUser(user);
    }
    /**
     * 根据username查询
     * @param username
     * @return
     */
    public userInfo getUserByUserName(String username){
        return userinfodao.getUserByUserName(username);
    }
    public userInfo getUserByTelnum(String telnum){
        return userinfodao.getUserByTelnum(telnum);
    }
    /**
     * 更新
     * @param user
     */
    public void updateUser(userInfo user) {
    	userinfodao.updateUser(user);
    }
    /**
     * 删除
     * @param id
     */
    public void deleteUserById(String id) {
    	userinfodao.deleteUserById(id);
    }
    /**
     * 查询所有
     * @return
     */
    public List<userInfo> getUsers() {
        return userinfodao.getUser();
    }
}
