package com.paic.web.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paic.web.dao.UserInfoDao;
import com.paic.web.entity.UserInfo;

@Transactional 
@Service
public class UserService 
{
	@Autowired
	private UserInfoDao userinfodao;
    
    /**
     * 添加
     * @param user
     */
    public void addUser(UserInfo user) {
    	userinfodao.addUser(user);
    }
    /**
     * 根据username查询
     * @param username
     * @return
     */
    public UserInfo getUserByUserName(String username){
        return userinfodao.getUserByUserName(username);
    }
    public UserInfo getUserByTelnum(String telnum){
        return userinfodao.getUserByTelnum(telnum);
    }
    /**
     * 更新
     * @param user
     */
    public void updateUser(UserInfo user) {
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
    public List<UserInfo> getUsers() {
        return userinfodao.getUser();
    }
}
