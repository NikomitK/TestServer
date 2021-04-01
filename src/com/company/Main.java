package com.company;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException {
	    ServerSocket serverSocket = new ServerSocket(5000);
	    while(true){
	        Socket s = serverSocket.accept();
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
            System.out.println(fromClient.read());
            s.close();
        }
    }
}
