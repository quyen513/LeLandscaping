package com.lelandscaping.service.interfaces;

import java.util.List;

import com.lelandscaping.entity.client;

public interface ClientServiceInt {
    client createNewClientService(client client);
    client getUserByIdService(int clientId);
    List<client> getAllClientsService();
}
