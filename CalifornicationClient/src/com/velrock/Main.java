package com.velrock;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) {
        try {
            InetAddress adr = InetAddress.getByName(null);
            Socket testSocket = new Socket(adr,9656);
            OutputStream output = testSocket.getOutputStream();
            long time = System.currentTimeMillis();
            output.write("jdevnotes multithreaded server runs\n".getBytes());
            Thread.currentThread().sleep(50000);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
