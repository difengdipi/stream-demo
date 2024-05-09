package com.zh.streamdemo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author: 周海
 * @Create : 2024/5/9
 **/
public class mystream8 {
    public static void main(String[] args) {
//    //steam的Api
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "周海-1", "周海-2", "周海-11", "周海-12", "周海-13", "周海-14", "周海-15", "周海-22", "周海-112");

//        list.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
////               切割字符串
//                String[] split = s.split("-");
//                String s1 = split[1];
//                int i = Integer.parseInt(s1);
//                return  i;
//            }
//        }).forEach(s-> System.out.println(s));
//        转换流中的数据类型map
        list.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s -> System.out.println(s));


    }
}
