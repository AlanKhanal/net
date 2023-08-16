package Assign;

import java.io.*;
import java.net.*;

import javax.sound.sampled.Port;

public class readServer {
    public static void main(String[] args) {
        try {
            // Create a socket and connect to the server
            Socket socket = new Socket("https://www.oracle.com/", 8080);
            System.out.println("Connected to server");

            // Get the input stream from the socket
            InputStream input = socket.getInputStream();

            // Create a buffer to store the received data
            byte[] buffer = new byte[1024];

            // Read data from the server
            int bytesRead = input.read(buffer);

            // Convert the received data to a string
            String data = new String(buffer, 0, bytesRead);

            // Print the received data
            System.out.println("Received data: " + data);

            // Close the socket and input stream
            input.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}