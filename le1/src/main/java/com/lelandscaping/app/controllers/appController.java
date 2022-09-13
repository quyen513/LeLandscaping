package com.lelandscaping.app.controllers;

import io.javalin.Javalin;

public class appController {
    private clientController clientController;
    private Javalin app;

    public appController(Javalin app, clientController clientController){
        this.clientController = clientController;
        this.app = app;
    };

    public void createClientRoutes(){
        app.post("/client/createNewClient",clientController.registerClient);
        app.get("/clients/getAll", clientController.getAllClients);
    }
    
}
