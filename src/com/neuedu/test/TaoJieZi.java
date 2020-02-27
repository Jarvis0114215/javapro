package com.neuedu.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Create by Jia on 2020/2/21/021 11:28
 */
public class TaoJieZi {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(9999);
            // 该方法为阻塞 等待客户端连接
            Socket socket = server.accept();
            System.out.println("客户端已连接");
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String str =br.readLine();
            while(true){
                System.out.println("客户端说:"+str);
                str=br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
