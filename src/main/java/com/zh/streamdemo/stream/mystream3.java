package com.zh.streamdemo.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author: 周海
 * @Create : 2024/5/9
 **/
public class mystream3 {
    public static void main(String[] args) {
//        双列集合

        HashMap<String, Integer> hs = new HashMap<>();
        hs.put("aaa", 111);
        hs.put("bbb", 222);
        //获取所有的键
        hs.keySet().forEach(s -> System.out.println(s));

//       获取所有的键值对
        hs.entrySet().forEach(s -> System.out.println(s));


    }
}
