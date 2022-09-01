package com.lelandscaping.app;

import com.lelandscaping.app.controllers.appController;
import com.lelandscaping.app.controllers.clientController;
import com.lelandscaping.dao.implementations.clientDao;
import com.lelandscaping.service.implementations.ClientService;

import io.javalin.Javalin;

public class app {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.enableCorsForAllOrigins();
            config.enableDevLogging();
        });  

        clientDao clientDao = new clientDao();
        ClientService clientService = new ClientService(clientDao);
        clientController clientController = new clientController(clientService);

        appController appController = new appController(app, clientController);

        appController.createClientRoutes();

        app.start();
    }


}
