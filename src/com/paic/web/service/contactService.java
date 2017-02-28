package com.paic.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paic.web.dao.ContactDao;
import com.paic.web.entity.Contact;



@Transactional
@Service
public class ContactService
{
    @Autowired
    private ContactDao contactdao;
    
    /**
     * 添加联系人
    */
    public void addContact(Contact contactuser)
    {
        contactdao.addContact(contactuser);
    }

    /**
     * 删除联系人
    */
    public void deleteContact(Contact contactuser)
    {
        contactdao.deleteContact(contactuser);
    }
}