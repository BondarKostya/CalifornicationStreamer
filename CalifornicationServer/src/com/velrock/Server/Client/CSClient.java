package com.velrock.Server.Client;

import com.velrock.Server.CSSessionManager;
import com.velrock.Server.Session.CSSession;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * Created by brigh on 26.06.2016.
 */
public abstract class CSClient {
    public Socket clientSocket;
    public String clientId;
    public CSSession currentSession;
    public String clientImage;
    public CSClientWriter clientWriter;
    public CSClientReader clientReader;

    public CSClient(Socket clientSocket,String clientId) {
        this.clientSocket = clientSocket;
        this.clientId = clientId;
        try {
            clientReader = new CSClientReader(this.clientSocket.getInputStream(),this);
            clientWriter = new CSClientWriter(this.clientSocket.getOutputStream(),this);
            clientReader.start();
            clientWriter.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private String getImage(String data) {return null;}
}
