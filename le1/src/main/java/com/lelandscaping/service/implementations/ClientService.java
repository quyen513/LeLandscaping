package com.lelandscaping.service.implementations;

import java.util.List;

import com.lelandscaping.customException.BlankInputs;
import com.lelandscaping.dao.implementations.clientDao;
import com.lelandscaping.entity.client;
import com.lelandscaping.service.interfaces.ClientServiceInt;

public class ClientService implements ClientServiceInt{

    private final clientDao clientDao;
    public ClientService(clientDao clientDao){
        this.clientDao = clientDao;
    }


    @Override
    public client createNewClientService(client client) {
        if(client.getPhone().isEmpty() ||
         client.getFull_name().isEmpty()||
         client.getAddress().isEmpty()||
         client.getCharge() == 0 ||
         client.getPayment().isEmpty() ||
         client.getSchedule().isEmpty() ||
         client.getWorkdate().isEmpty() ||
         client.getWorktype().isEmpty() ||
         client.getFrequent().isEmpty()){
            throw new BlankInputs("Please fill in the blanks");
         } else {
            return this.clientDao.createNewClient(client);
         }

       
    }

    @Override
    public client getUserByIdService(int clientId) {
        // TODO Auto-generated method stub
        return null;
    }


  


    @Override
    public List<client> getAllClientsService() {
        
        return this.clientDao.getAllClients();
    }
    
}
