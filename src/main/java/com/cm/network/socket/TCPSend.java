package com.cm.network.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @description:
 * @author: caomian
 * @data: 2019/8/15 16:39
 */
public class TCPSend {

    public static void TCPSendData(InetAddress ip, int port) throws IOException {
        Socket socket = new Socket(ip, port);
        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
        outputStream.writeUTF("TCP数据包");
    }


    public static void main(String[] args) throws IOException {
        TCPSend.TCPSendData(InetAddress.getLocalHost(), 33660);
    }
}
