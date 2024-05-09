package com.zh.streamdemo.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: 周海
 * @Create : 2024/5/9
 **/
public class mystream10 {
    /**
     * collect 生成集合
     *
     * @param args
     */
    public static void main(String[] args) {
//    //steam的Api
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "周海-男-1", "周海-男-2", "周海-男-11", "周海-男-12", "周海-女-13", "周海-男-14", "周海-女-15", "周海-女-22", "周海-男-112");
//        收集所有的男性
//        List<String> list1 = list.stream().filter(s -> s.split("-")[1].equals("男")).collect(Collectors.toList());
//        System.out.println(list1);
//        收集所有的女性
        Set<String> set = list.stream().filter(s -> "女".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println("set" + set);
//      收集男性，且名称不重复---set中本来就不重复--可以达到去重效果
        Set<String> collect = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(collect);
//        收集集合，并且实现键值对--对于流中的数据不能有重复项，且不为空，会报错
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "周海-男-19", "罗怡-女-19");
        Map<String, Integer> map = list2.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(map);
    }
}
