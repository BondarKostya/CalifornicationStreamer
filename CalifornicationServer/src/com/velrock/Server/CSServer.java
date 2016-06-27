package com.velrock.Server;

import com.velrock.Server.Client.CSClient;
import com.velrock.Server.Client.StandartClient.StandartClient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by brigh on 26.06.2016.
 */
public class CSServer implements Runnable {
    public static final int serverPort = 9656;
    //singleton instance
    public static CSServer sharedInstance  = new CSServer();
    public CSServerState serverState;
    private CSSessionManager sessionManager;
    private ServerSocket serverSocket;
    private CSServer() {
        serverState = CSServerState.serverStop;
        sessionManager = CSSessionManager.sharedInstance;


    }

    //work with state server
    public void launchServer() {
        serverState = CSServerState.serverRun;
        this.run();
    }
    public void pauseServer() {
        serverState = CSServerState.serverPause;
    }
    public void stopServer() {
        serverState = CSServerState.serverStop;
        try {
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void run() {
        while(true) {
            if(serverState == CSServerState.serverStop) {
                return;
            }
            while(serverState == CSServerState.serverPause) {

            }
            try {
                this.serverSocket = new ServerSocket(serverPort);
                while(serverState == CSServerState.serverRun) {
                    Socket client = this.serverSocket.accept();
                    CSSessionManager.sharedInstance.addClient(new StandartClient(client,client.getInetAddress().getHostAddress()));
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
