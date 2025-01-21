package org.example.ex4;

import java.net.ServerSocket;

public class HttpFTServer {

    //bad code
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(5555);

        System.out.println("FTserver run.............");

        while(true){

            //브라우저와 연결해서 Socket을 생성해야 한다. - accept()

            //보내고 싶으니 OutputStream을 생성한다.

            //읽고 싶은 파일에 빨대 InputStream을 준비한다.

            // HTTP에 맞는 image/png 헤더 메시지를 outputStream에 기록

            // 파일 데이터를 읽어서 outputStream에 write( )한다. - byte[] 이용하면 1000배 빨라짐


        }//end while

    }

}
