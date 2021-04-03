package de.nikomitk.testserver;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException {
        int port = 5000;
        if(args.length >0 && args[0].length()<10){
            port = Integer.parseInt(args[0]);
        }
	    ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Server running on port: " + port);
	    while(true){
            System.out.println("Schleifenanfang");
	        Socket s = serverSocket.accept();
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
            System.out.println(fromClient.readLine());
            s.close();
        }
    }
}
