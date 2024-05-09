package com.zh.streamdemo.stream;

import java.util.stream.Stream;

/**
 * @author: 周海
 * @Create : 2024/5/9
 **/
public class mystream5 {
    public static void main(String[] args) {
//    一堆零散的数据
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(s -> System.out.println(s));
        ;

        Stream.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j").forEach(s -> System.out.println(s));
    }
}
