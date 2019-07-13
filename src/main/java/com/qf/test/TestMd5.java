package com.qf.test;
/*
 *Author:赵兴康
 *Date:2019/7/11 15:33
 */

import org.apache.shiro.crypto.hash.Md5Hash;

public class TestMd5 {
    public static void main(String[] args) {


        Md5Hash md5Hash1 = new Md5Hash("123","qf");
        System.out.println(md5Hash1.toString());

    }
}
