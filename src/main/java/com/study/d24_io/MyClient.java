package com.study.d24_io;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) throws Exception {
        int port = 5000;
        Socket socket = new Socket("127.0.0.1", port);
        System.out.println("連線成功~");
        try(OutputStream os = socket.getOutputStream();) {
            Scanner sc = new Scanner(System.in);
            System.out.print("請輸入資料: ");
            String data = sc.next();
            os.write(data.getBytes());
        } catch (Exception e) {
        }
    }
}
