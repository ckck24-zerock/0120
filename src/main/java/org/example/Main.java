package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //bad code
    public static void main(String[] args) throws Exception{

        //Menu m = new PizzaMenu();
        InputStream in = new FileInputStream("C:\\zzz\\aaa.jpg");
        OutputStream out = new FileOutputStream("C:\\zzz\\copy.jpg");

        //모든 빨대는 사용후에 닫는다. close
        while(true){

            int data = in.read();

            System.out.println(data);

            if(data == -1){
                break;
            }

        }//end while

        in.close();
        out.close();
    }
}









