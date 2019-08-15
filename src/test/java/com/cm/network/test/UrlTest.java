package com.cm.network.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @description:
 * @author: caomian
 * @data: 2019/8/15 15:35
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UrlTest {

    @Test
    public void testUrl() throws MalformedURLException {
        URL url = new URL("https://blog.csdn.net/allenfoxxxxx/article/details/90707505");
        //获取此的授权部分 URL 。
        System.out.println(url.getAuthority());

        //获取此 URL的文件名。
        System.out.println(url.getFile());

        //获取端口
        System.out.println(url.getPort());

        //获取主机
        System.out.println(url.getHost());

        //获得默认端口
        System.out.println(url.getDefaultPort());

        //获得路径
        System.out.println(url.getPath());

        //获取该 URL的userInfo部分。
        System.out.println(url.getUserInfo());
    }
}
