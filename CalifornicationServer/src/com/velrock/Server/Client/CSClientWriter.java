package com.velrock.Server.Client;

import java.io.*;

/**
 * Created by brigh on 28.06.2016.
 */
public class CSClientWriter extends Thread {
    PrintWriter writer;
    Boolean isRun;
    CSClient client;

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
//                BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
//                try {
//                    String line=buffer.readLine();
//                    this.writer.print(line + "\n");
//                } catch (IOException e) {
//                    try {
//                        client.clientSocket.close();
//                        return;
//                    } catch (IOException e1) {
//                        e1.printStackTrace();
//                    }
//                }
//                this.writer.print("ResponseOne\n");
//                this.writer.flush();
                //System.out.println("Write");
            }
        }
    }
}
