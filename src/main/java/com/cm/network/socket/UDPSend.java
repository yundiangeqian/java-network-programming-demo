package com.cm.network.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @description:
 * @author: caomian
 * @data: 2019/8/15 16:39
 */
public class UDPSend {
    public static void sendData(InetAddress ip, int port) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        byte[] sendContent;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("你好，你要进行什么操作？");
            sendContent = scanner.nextLine().getBytes();
            DatagramPacket packet = new DatagramPacket(sendContent, sendContent.length, ip, port);
            socket.send(packet);
            if (sendContent.equals("exit")) {
                break;
            }
        }
        socket.close();
    }

    public static void main(String[] args) throws IOException {
        UDPSend.sendData(InetAddress.getLocalHost(), 28635);
    }


}
