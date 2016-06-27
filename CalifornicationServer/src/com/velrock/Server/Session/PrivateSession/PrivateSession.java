package com.velrock.Server.Session.PrivateSession;

import com.velrock.Server.Client.CSClient;
import com.velrock.Server.Session.CSSession;

/**
 * Created by brigh on 26.06.2016.
 */
public class PrivateSession extends CSSession {
    private String password;
    public PrivateSession(String sessionId, CSClient creator, String parameters) {
        super(sessionId, creator);
    }
}
