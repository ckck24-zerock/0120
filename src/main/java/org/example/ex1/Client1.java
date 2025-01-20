package org.example.ex1;

import lombok.Cleanup;

import java.net.Socket;

public class Client1 {

    //bad code
    public static void main(String[] args) throws Exception{

        @Cleanup Socket socket = new Socket("127.0.0.1", 5555);

        System.out.println(socket);


    }
}
