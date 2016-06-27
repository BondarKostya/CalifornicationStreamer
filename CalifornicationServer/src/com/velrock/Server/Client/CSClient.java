package com.velrock.Server.Client;

import com.velrock.Server.CSSessionManager;
import com.velrock.Server.Session.CSSession;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by brigh on 26.06.2016.
 */
public abstract class CSClient extends Thread {
    public Socket clientSocket;
    public String clientId;
    public CSSession currentSession;
    public String clientImage;

    public CSClient(Socket clientSocket,String clientId) {
        this.clientSocket = clientSocket;
        this.clientId = clientId;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()));
            System.out.println(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getImage(String data) {return null;}
}
