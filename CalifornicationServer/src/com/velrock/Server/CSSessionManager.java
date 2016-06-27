package com.velrock.Server;

import com.velrock.Server.Client.CSClient;
import com.velrock.Server.Session.CSSession;

import java.util.ArrayList;

/**
 * Created by brigh on 26.06.2016.
 */
public  class CSSessionManager {
    //singleton instance
    public static CSSessionManager sharedInstance = new CSSessionManager();

    //work with session and clients
    public void  addClientToSession(String sessionId, CSClient client,String parameters){}
    public void  removeClientFromSession(String sessionId,CSClient client){}
    public void  createSession(String sessionId, CSClient client,String parameters){}
    public void  removeSession(String sessionId){}
    public void  addClient(CSClient client) {
        if(!clients.contains(client)) {
            clients.add(client);
        }
    }

    //work with session state and transmitting state
    public void  pauseAllSessions(){}
    public void  stopAllImageTransmiting(){}
    public void  stopAllTextTransmiting(){}
    public void  stopAllSessions(){}
    public void  resumeAllSessions(){}
    public void  resumeAllImageTransmiting(){}
    public void  resumeAllTextTransmiting(){}

    //arrays of sessions and clients
    private ArrayList<CSSession> sessions;
    private ArrayList<CSClient>  clients;
    private CSSessionManager() {
        sessions = new ArrayList<CSSession>();
        clients = new ArrayList<CSClient>();
    }

}
