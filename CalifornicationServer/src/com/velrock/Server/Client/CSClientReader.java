package com.velrock.Server.Client;

import com.velrock.Server.CSServer;

import java.io.*;

/**
 * Created by brigh on 28.06.2016.
 */
public class CSClientReader extends Thread {
    BufferedReader reader;
    Boolean isRun;
    CSClient client;

    public CSClientReader(InputStream inputStream,CSClient client) {
        this.reader =  new BufferedReader(new InputStreamReader(inputStream));
        this.isRun = false;
        this.client = client;
    }

    @Override
    public void run() {
        super.run();
        this.isRun = true;
        while(true) {
            if(this.isRun == false) {
                return;
            }else {
                String out = null;
                try {
                    out = reader.readLine();
                } catch (IOException e) {
                    try {
                        client.clientSocket.close();
                        return;
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
                System.out.println(out);
            }
        }
    }
}
