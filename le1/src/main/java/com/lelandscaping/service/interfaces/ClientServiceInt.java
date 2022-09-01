package com.lelandscaping.service.interfaces;

import com.lelandscaping.entity.client;

public interface ClientServiceInt {
    client createNewClientService(client client);
    client getUserByIdService(int clientId);
    
}
