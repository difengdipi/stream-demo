package com.zh.streamdemo.immutable;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author: 周海
 * @Create : 2024/5/8
 **/
public class ImmutableDemo02 {
    /**
     * 不可变集合Set-->只能进行查询操作
     * 细节：
     * 里面的参数必须要保证唯一性
     */
    public static void main(String[] args) {
        // "周海", "罗怡骋"
        Set<String> set = Set.of("周海", "罗怡骋");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("------------------------");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
        System.out.println("------------------------");

       /* set.remove("周海");
        set.add("你好");


        */
    }
}
