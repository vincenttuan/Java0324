package com.study.d24_io;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) throws Exception {
        int port = 5000;
        ServerSocket server = new ServerSocket(port);
        System.out.println("等待 Client 連入");
        Socket socket = server.accept();
        System.out.println("Client 連入, port=" + socket.getPort());
        
        try(InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);) {
            
            int data;
            while ((data = isr.read()) != -1) {                
                System.out.print(data);
            }
            System.out.println();
            
        } catch (Exception e) {
        }
    }
}
