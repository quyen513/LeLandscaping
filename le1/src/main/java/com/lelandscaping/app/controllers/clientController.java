package com.lelandscaping.app.controllers;

import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;
import com.lelandscaping.customException.BlankInputs;
import com.lelandscaping.entity.client;
import com.lelandscaping.service.implementations.ClientService;
import io.javalin.http.Handler;

public class clientController {

    
    private ClientService clientService;
    public clientController(ClientService clientService){
        this.clientService = clientService;
    }

    // Register Client
    public Handler registerClient = ctx -> {
        Gson gson = new Gson();
        try {
           client newClient = gson.fromJson(ctx.body(), client.class);
           client createClient = this.clientService.createNewClientService(newClient);
           if (createClient == null) {
            HashMap<String, String> message = new HashMap<>();
            message.put("errorMessage", "Error processing request");
            ctx.result(gson.toJson(message));
            ctx.status(400);
            }
        String createdUserJson = gson.toJson(createClient);
        ctx.result(createdUserJson);
        ctx.status(201);
    
        }catch (BlankInputs e) {
            HashMap<String, String> message = new HashMap<>();
            message.put("errorMessage", e.getMessage());
            ctx.result(gson.toJson(message));
            ctx.status(400);
        }
    };

     // Get all Clients
     public Handler getAllClients = ctx ->{
        Gson gson = new Gson();
        
        try {
            List<client> clients = this.clientService.getAllClientsService();
            if (clients == null) {
                HashMap<String, String> message = new HashMap<>();
                message.put("errorMessage", "Error processing request");
                ctx.result(gson.toJson(message));
                ctx.status(400);
            }
            String clientsJSONs = gson.toJson(clients);
            ctx.result(clientsJSONs);
            ctx.status(200);
        } catch (BlankInputs e) {
            HashMap<String, String> message = new HashMap<>();
            message.put("errorMessage", e.getMessage());
            ctx.result(gson.toJson(message));
            ctx.status(400);
        }
    };

   

}
