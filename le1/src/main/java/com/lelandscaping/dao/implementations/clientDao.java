package com.lelandscaping.dao.implementations;



import java.util.List;

import com.lelandscaping.dao.interfaces.clientDaoInt;
import com.lelandscaping.entity.client;
import com.lelandscaping.util.HibernateUtil;

public class clientDao implements clientDaoInt {

    @Override
    public client createNewClient(client client) {
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().save(client);
        HibernateUtil.endTransaction();
        return client;
    }

    @Override
    public List<client> getAllClients() {
        HibernateUtil.beginTransaction();
        List<client> returnClients = HibernateUtil.getSession().createQuery("FROM client", client.class ).list();
        HibernateUtil.endTransaction();
        return returnClients;    
    }
    
}
