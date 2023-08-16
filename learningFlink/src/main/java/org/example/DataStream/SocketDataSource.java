package org.example.DataStream;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketDataSource {
    public static void main(String[] args) throws UnknownHostException,IOException,InterruptedException {
        try {
            String[]arr=GenerateRandomNames.generateRandomNames(10000);

            ServerSocket serverSocket=new ServerSocket(8000);
            Socket connectionSocket=serverSocket.accept();
            OutputStream outputStreamFromServer=connectionSocket.getOutputStream();
            PrintWriter serverPrintOut=new PrintWriter(new OutputStreamWriter(outputStreamFromServer,"UTF8"),true);
            for (String name : arr) {
                System.out.println(name);
                serverPrintOut.println(name);
                Thread.sleep(2000);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
