package org.example.ex2;

import lombok.Cleanup;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpTest {

    //bad code
    public static void main(String[] args) throws Exception{

        @Cleanup
        ServerSocket serverSocket = new ServerSocket(5555);

        System.out.println("Server Opened...........");

        for (int i = 0; i < 10; i++) {
            byte[] arr = new byte[100 * 8]; //800


            @Cleanup Socket client = serverSocket.accept();
            @Cleanup InputStream in = client.getInputStream();

            int count = in.read(arr); //몇 개나 새로운 데이터가 채워졌는지

            String str = new String(arr,0,count);

            System.out.println(str);
            System.out.println("----------------------------");

        }//end for


    }
}
