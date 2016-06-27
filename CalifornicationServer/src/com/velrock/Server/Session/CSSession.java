package com.velrock.Server.Session;

import com.velrock.Server.Client.CSClient;

import java.util.ArrayList;

/**
 * Created by brigh on 27.06.2016.
 */
public abstract class CSSession {
    public String sessionId;
    public  CSSession(String sessionId,CSClient creator){}
    public void stopTransmitingImage(){}
    public void stopTransmitingText(){}
    public void resumeTrasmitingText(){}
    public void resumeTrasmitingImage(){}
    public void pause(){}
    public void resume(){}
    public ArrayList<CSClient> getSessionClients(){return null;}
    public void removeAllUsers(){}
    public void addClient(CSClient newClient){}
    public void removeClient(String clientId){}
    public void blockClient(String clientId){}
}
