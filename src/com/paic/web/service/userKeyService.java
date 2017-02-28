package com.paic.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paic.web.dao.UserKeyDao;
import com.paic.web.entity.UserKey;


@Transactional
@Service
public class UserKeyService
{
    @Autowired
    private UserKeyDao userkeydao;

    /**
     * 增加用户密钥
    */
    public void addUserKey(UserKey userkey)
    {
        userkeydao.addUserKey(userkey);
    }
    /**
     * 根据accesskeyid删除用户密钥
    */
    public void deleteUserKey(String accesskeyid)
    {
        userkeydao.deleteUserKey(accesskeyid);
    }
}