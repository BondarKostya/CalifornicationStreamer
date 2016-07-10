package com.velrock.Server.Client;

import java.io.*;

/**
 * Created by brigh on 28.06.2016.
 */
public class CSClientWriter extends Thread {
    PrintWriter writer;
    Boolean isRun;
    CSClient client;
    Boolean haveDateForTransmitt;
    String dataForTransmitt;

    public CSClientWriter(OutputStream outputStream,CSClient client) {
        writer = new PrintWriter(outputStream, true);
        this.isRun = false;
        this.client = client;
    }

    @Override
    public void run() {
        super.run();
        this.isRun = false;
        while(true) {
            if(this.isRun == false) {
                continue;
            }else {
                if(haveDateForTransmitt && dataForTransmitt.length() > 0) {
                    this.writer.print(dataForTransmitt + "\n");
                    this.writer.print("ResponseOne\n");
                    this.writer.flush();
                    System.out.println("Write");
                }

            }
        }
    }
}
