package org.example.ex1;

import lombok.Cleanup;

import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

    //bad code
    public static void main(String[] args)throws Exception {

        //5555번으로 가게 열기
        @Cleanup
        ServerSocket serverSocket = new ServerSocket(5555);
        System.out.println("Server Opened...");

        @Cleanup
        Socket clientSocket = serverSocket.accept();
        System.out.println(clientSocket);

        


    }
}








