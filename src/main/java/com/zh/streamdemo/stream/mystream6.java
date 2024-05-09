package com.zh.streamdemo.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @author: 周海
 * @Create : 2024/5/9
 **/
public class mystream6 {
    public static void main(String[] args) {
//    //steam的Api
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5", "22", "12");

        list.stream().filter(s -> s.contains("2")).forEach(s -> System.out.println(s));
        //获取
        list.stream().limit(3).forEach(s -> System.out.println(s));

        list.stream().skip(2)
                .limit(3)
                .forEach(s -> System.out.println(s));

    }
}
