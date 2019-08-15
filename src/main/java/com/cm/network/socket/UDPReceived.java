package com.cm.network.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @description:
 * @author: caomian
 * @data: 2019/8/15 17:08
 */
public class UDPReceived {
    public static void ReceiveData(int port) throws IOException {
        DatagramSocket socket = new DatagramSocket(port);
        //准备容器接收
        byte[] receiveBuf = new byte[100];
        //等待包裹容器封包
        DatagramPacket packet = new DatagramPacket(receiveBuf, receiveBuf.length);
        System.out.println("等你包裹来。。。。");
        while (true) {
            socket.receive(packet);
            String receStr = new String(packet.getData(), 0, packet.getLength());
            System.out.println("我收到了：" + receStr);
            if (receStr.equals("exit")) {
                break;
            }
        }
        socket.close();
    }

    public static void main(String[] args) throws IOException {
        UDPReceived.ReceiveData(28635);
    }
}
