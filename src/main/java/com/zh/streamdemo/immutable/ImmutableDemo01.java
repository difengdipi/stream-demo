package com.zh.streamdemo.immutable;

import java.util.Iterator;
import java.util.List;

/**
 * @author: 周海
 * @Create : 2024/5/8
 **/
public class ImmutableDemo01 {
    /**
     * 不可变集合List
     */
    public static void main(String[] args) {
        // “周海”,”罗怡骋”
        List<String> l = List.of("周海", "罗怡骋");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        for (String s : l) {
            System.out.println(s);
        }
        Iterator<String> iterator = l.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
