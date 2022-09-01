package com.lelandscaping.UnitTest.repository;

import org.junit.Test;
import org.testng.Assert;

import com.lelandscaping.dao.implementations.clientDao;
import com.lelandscaping.dao.interfaces.clientDaoInt;
import com.lelandscaping.entity.client;

public class ClientTest {
    public static clientDaoInt clientDao = new clientDao();

    @Test
    public void createClient(){
        client createNewClient = new client(
            10,
            "Quyen Vu",
            "377 QL1A",
            "765027",
            50,
            "4x",
            "regular",
            "check",
            "B",
            "FRI"
        );
        client createdClient = clientDao.createNewClient(createNewClient);
        Assert.assertNotNull(createdClient); 

    }
}
