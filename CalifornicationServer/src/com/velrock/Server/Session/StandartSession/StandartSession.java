package com.velrock.Server.Session.StandartSession;


import com.velrock.Server.Client.CSClient;
import com.velrock.Server.Session.CSSession;

/**
 * Created by brigh on 26.06.2016.
 */
public class StandartSession extends CSSession {
    public StandartSession(String sessionId, CSClient creator) {
        super(sessionId, creator);
    }
}
