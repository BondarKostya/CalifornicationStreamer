package com.velrock;

import com.velrock.Server.CSServer;

public class Main {

    public static void main(String[] args) {
        CSServer.sharedInstance.launchServer();
    }
}
