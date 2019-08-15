package com.cm.network.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @description:
 * @author: caomian
 * @data: 2019/8/15 13:57
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class IpTest {
    @Test
    public void testLocalHostIp() throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip);
        System.out.println(ip.getHostName() + "----" + ip.getHostAddress());
        System.out.println(ip.getCanonicalHostName() + "----" + ip.getAddress());
    }
    @Test
    public void testBaiDuIp() throws UnknownHostException {
        InetAddress ip = InetAddress.getByName("www.baidu.com");
        System.out.println(ip);
        System.out.println(ip.getHostName() + "----" + ip.getHostAddress());
        System.out.println(ip.getCanonicalHostName() + "----" + ip.getAddress());
    }
}
