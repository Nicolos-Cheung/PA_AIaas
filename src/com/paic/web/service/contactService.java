package com.paic.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paic.web.dao.contactDao;
import com.paic.web.entity.contact;



@Transactional
@Service
public class contactService
{
    @Autowired
    private contactDao contactdao;
    
    /**
     * 添加联系人
    */
    public void addContact(contact contactuser)
    {
        contactdao.addContact(contactuser);
    }

    /**
     * 删除联系人
    */
    public void deleteContact(contact contactuser)
    {
        contactdao.deleteContact(contactuser);
    }
}