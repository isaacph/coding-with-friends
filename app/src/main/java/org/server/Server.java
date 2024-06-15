/*
 * This source file was generated by the Gradle 'init' task
 */
package org.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception{

        while (true) {
            // create a server socket on port number 9090
            ServerSocket serverSocket = new ServerSocket(9090);
            System.out.println("Server is running and waiting for client connection...");

            // Accept incoming client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected!");

            // Setup input and output streams for communication with the client
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Read message from client
            String message = in.readLine();
            System.out.println("Client says: " + message);

            // Send response to the client
            out.println("Hello Anson!@!!!!");

            // Close the client socket
            clientSocket.close();
            // Close the server socket
            serverSocket.close();
        }
    }
}