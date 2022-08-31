package com.lelandscaping;

import com.lelandscaping.entity.client;
import com.lelandscaping.util.HibernateUtil;



public class App 
{
    public static void main( String[] args )
    {
       client client = new client(5,"test","test","test");
       
       HibernateUtil.beginTransaction();
       HibernateUtil.getSession().save(client);
       HibernateUtil.endTransaction();
    }
}
