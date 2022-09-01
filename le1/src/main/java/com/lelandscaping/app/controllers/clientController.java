package com.lelandscaping.app.controllers;

import java.util.HashMap;

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

    // Register User
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
}
