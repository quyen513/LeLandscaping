package com.lelandscaping.dao.interfaces;

import java.util.List;

import com.lelandscaping.entity.client;

public interface clientDaoInt  {
    client createNewClient(client client);
    List<client> getAllClients(); 
}
