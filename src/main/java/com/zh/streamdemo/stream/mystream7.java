package com.zh.streamdemo.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @author: 周海
 * @Create : 2024/5/9
 **/
public class mystream7 {
    public static void main(String[] args) {
//    //steam的Api
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "周海", "周海", "周海1", "周海", "周海3", "周海4", "周海5", "周海22", "周海12");

//        这里如果是复杂对象需要重写hashcode,和equals方法

        list.stream().distinct().forEach(s -> System.out.println(s));

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "罗怡骋");
        System.out.println("-------------------");
//        concat合并两个流，尽可能的让数据类型相同
        Stream.concat(list1.stream(), list.stream()).forEach(s -> System.out.println(s));

//        获取里面的年龄，并进行打印


    }
}
