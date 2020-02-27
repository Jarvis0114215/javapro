package com.neuedu.test;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Create by Jia on 2020/2/21/021 11:37
 */
public class MyClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1",9999);
            System.out.println("客户端连接");
            Scanner scanner = new Scanner(System.in);
            OutputStream os = socket.getOutputStream();
            PrintStream pw = new PrintStream(os);
            while(true) {
                String str =scanner.nextLine();
                pw.println(str);
                pw.flush();
            }


        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
