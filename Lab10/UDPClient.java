import java.io.*;
import java.net.*;
public class UDPClient {
    public static void main(String[] args) {
        // Define server's IP address and port
        String serverIP = "127.0.0.1";
        int serverPort = 12345;
        
        try {
            // Create a UDP socket
            DatagramSocket clientSocket = new DatagramSocket();
            // Get user input
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a message to send to the server: ");
            String message = userInput.readLine();
            // Convert the message to bytes
            byte[] sendData = message.getBytes();
            // Create a UDP packet with the server's IP address, port, and message
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,
            InetAddress.getByName(serverIP), serverPort);
            // Send the packet to the server
            clientSocket.send(sendPacket);
            // Create a buffer to receive the server's response
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            // Receive the server's response
            clientSocket.receive(receivePacket);
            // Convert the response to a string and display it
            String serverResponse = new String(receivePacket.getData());
            System.out.println("Response from server: " + serverResponse.trim());
            // Close the socket
            clientSocket.close();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
}