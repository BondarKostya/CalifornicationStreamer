package com.velrock.Server.Client;

import com.velrock.Server.CSServer;

import java.io.*;

/**
 * Created by brigh on 28.06.2016.
 */
public class CSClientReader extends Thread {
    BufferedReader reader;
    Boolean isRun;

    public CSClientReader(InputStream inputStream) {
        this.reader =  new BufferedReader(new InputStreamReader(inputStream));
        this.isRun = false;
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
                    e.printStackTrace();
                }
                System.out.println(out);
            }
        }
    }
}
