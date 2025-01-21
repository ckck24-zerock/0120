package org.example.ex4;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpFTServer {

    //bad code
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(5555);

        System.out.println("FTserver run.............");

        while(true){

            //브라우저와 연결해서 Socket을 생성해야 한다. - accept()
            Socket socket = serverSocket.accept();

            //보내고 싶으니 OutputStream을 생성한다.
            OutputStream outputStream = socket.getOutputStream();

            //읽고 싶은 파일에 빨대 InputStream을 준비한다.
            InputStream inputStream = new FileInputStream("C:\\zzz\\1.png");

            // HTTP에 맞는 image/png 헤더 메시지를 outputStream에 기록
            outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
            outputStream.write("Content-Type: image/png;\r\n".getBytes());
            outputStream.write("\r\n".getBytes());

            // 파일 데이터를 읽어서 outputStream에 write( )한다. - byte[] 이용하면 1000배 빨라짐
            byte[] buffer = new byte[1024*8]; //8kb
            while(true){

                int count = inputStream.read(buffer);//내용물은 buffer에 있고,
                if(count == -1) {
                    break;
                }
                outputStream.write(buffer,0,count);
            }
        }//end while
    }

}
