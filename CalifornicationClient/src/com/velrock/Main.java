package com.velrock;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) {
        try {
            InetAddress adr = InetAddress.getByName(null);
            Socket testSocket = new Socket(adr,9656);
            OutputStream output = testSocket.getOutputStream();
            BufferedReader reader =  new BufferedReader(new InputStreamReader(testSocket.getInputStream()));
            //System.out.println(reader.readLine());
            //System.out.println(reader.readLine());
            long time = System.currentTimeMillis();
            BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
            while(true) {
                String line=buffer.readLine();
                output.write((line + "\n").getBytes());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
