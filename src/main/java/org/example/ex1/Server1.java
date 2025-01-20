package org.example.ex1;

import lombok.Cleanup;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {

    //bad code
    public static void main(String[] args)throws Exception {

        //5555번으로 가게 열기
        @Cleanup
        ServerSocket serverSocket = new ServerSocket(5555);
        System.out.println("Server Opened...");

        for(int i = 0; i < 100; i++){
            @Cleanup
            Socket clientSocket = serverSocket.accept();
            System.out.println(clientSocket);

            @Cleanup
            InputStream inputStream = clientSocket.getInputStream();

            @Cleanup
            Scanner inScanner = new Scanner(inputStream);

            String line = inScanner.nextLine();

            System.out.println(line);

        }//for end

    }//end main
}//end class








