package com.cm.network.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * @description:
 * @author: caomian
 * @data: 2019/8/15 14:22
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SocketAddress {
    @Test
    public void testSocket() throws UnknownHostException {
        InetSocketAddress socketAddress = new InetSocketAddress(InetAddress.getLocalHost(), 20);
        System.out.println(socketAddress);
        System.out.println(socketAddress.getHostName());
        System.out.println(socketAddress.getPort());

        socketAddress = new InetSocketAddress(20);
        System.out.println(socketAddress);
        System.out.println(socketAddress.getHostName());
        System.out.println(socketAddress.getPort());

        socketAddress = new InetSocketAddress("BSS-CM",56);
        System.out.println(socketAddress);
        System.out.println(socketAddress.getHostName());
        System.out.println(socketAddress.getPort());
    }
}
