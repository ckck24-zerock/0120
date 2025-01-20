package org.example;

import lombok.Cleanup;

import java.io.*;

public class FileCopy2 {

    //try ~ catch ~ finally
    public static void main(String[] args)throws Exception {

        // try catch finally
        // try with resource // auto close
        @Cleanup
        InputStream in = new FileInputStream("C:\\zzz\\aaa.jpg");
        @Cleanup
        OutputStream out = new FileOutputStream("C:\\zzz\\copy.jpg");

        //모든 빨대는 사용후에 닫는다. close
        while(true){

            int data = in.read(); // 1 byte  + 255 음수가 나올 수 없게

            //System.out.println(data);

            if(data == -1){ //더 이상 읽어야 하는 데이터가 없는 경우
                break;
            }

            out.write(data);

        }//end while
    }

}
