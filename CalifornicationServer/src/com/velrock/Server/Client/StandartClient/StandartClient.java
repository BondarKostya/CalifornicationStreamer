package com.velrock.Server.Client.StandartClient;

import com.velrock.Server.Client.CSClient;

import java.net.Socket;

/**
 * Created by brigh on 26.06.2016.
 */
public class StandartClient extends CSClient {
    public StandartClient(Socket clientSocket, String clientId) {
        super(clientSocket, clientId);
    }
}
