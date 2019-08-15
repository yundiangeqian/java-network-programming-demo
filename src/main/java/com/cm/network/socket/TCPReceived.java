package com.cm.network.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;

/**
 * @description:
 * @author: caomian
 * @data: 2019/8/15 17:16
 */
public class TCPReceived {
    public static void TCPReceivedData(int port) throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("服务器监听了端口" + port);
        while (true) {
            DataInputStream inputStream = new DataInputStream(serverSocket.accept().getInputStream());
            System.out.println(inputStream.readUTF());
        }


    }

    public static void main(String[] args) throws IOException {
        TCPReceived.TCPReceivedData(33660);
    }
}
