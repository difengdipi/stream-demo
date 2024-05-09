package com.zh.streamdemo.immutable;

import java.util.Map;
import java.util.Set;

/**
 * @author: 周海
 * @Create : 2024/5/8
 **/
public class ImmutableDemo03 {
    /**
     * 不可变集合SMap-->只能进行查询操作
     * 细节：
     * 键是不可重复的，参数是有上限的，最多就只有20个
     */
    public static void main(String[] args) {
        // "周海", "罗怡骋"
        Map<String, String> map = Map.of("周海", "无锡", "罗怡骋", "成都");

//        只能进行查询操作
        Set<String> s = map.keySet();
        for (String key : s) {
            String s1 = map.get(key);
            System.out.println(key + "=" + s1);
        }
        System.out.println("-------------------------");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("-------------------------");


    }
}
