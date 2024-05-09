package com.zh.streamdemo.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: 周海
 * @Create : 2024/5/9
 **/
public class demo01 {
    /*
      1.定义数据，过滤奇数，保留偶数
     */
//    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        Collections.addAll(arr,1,2,3,4,5,6,7,8,9);
//        List<Integer> list = arr.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
//        System.out.println(list);
//
//    }

    /**
     * 2.定义数据，添加字符串
     * 保留年龄大于等于24的人，将集合收集到map中
     * @param args
     */
//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list,"zhangsan,23","周海,28","王者,29","李四,19");
//
//        Map<String, String> map = list.stream()
//                .filter(s -> 24 < Integer.parseInt(s.split(",")[1]))
//                .collect(Collectors.toMap(s -> s.split(",")[0], s -> s.split(",")[1]));
//        System.out.println(map);
//
//
//    }

    /**
     * 3.定义两个list集合
     * 集合1：存储6名男性名字和年龄
     * 集合2：存储6名女性名字和年龄
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list, "周wi海,18", "陆a威,19", "淘d车,29", "周是海,18", "陆威,19", "淘车,29");
        Collections.addAll(list2, "周天海,18", "杨笑威,19", "淘与车,29", "杨1海,18", "陆d威,19", "淘p车,29");

        /**
         * 需求：
         * 1.男演员只要名字为3个字的前两人
         *
         */
        List<String> manlist = list.stream().filter(s -> s.split(",")[0].length() == 3).limit(2).collect(Collectors.toList());
        System.out.println(manlist);
        /**
         * 2.女演员只要名字为杨,且不要第一个
         */
        List<String> girlList = list2.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(girlList);
        /**
         *3.过滤后的男女数据合并到一起
         */

        /**
         * 4.把演员封装到Avtor对象
         */
//         Stream.concat(list.stream().filter(s -> s.split(",")[0].length() == 3).limit(2), list2.stream()
//                .filter(s -> s.split(",")[0].startsWith("杨"))
//                .skip(1))
//                 .map(new Function<String, Avtor>() {
//                     @Override
//                     public Avtor apply(String s) {
//                         return new Avtor(s.split(",")[0],Integer.parseInt(s.split(",")[1]));
//                     }
//                 });
        Stream<Avtor> avtorStream = Stream.concat(list.stream().filter(s -> s.split(",")[0].length() == 3).limit(2), list2.stream()
                        .filter(s -> s.split(",")[0].startsWith("杨"))
                        .skip(1))
                .map(s -> new Avtor(s.split(",")[0], Integer.parseInt(s.split(",")[1])));
        /**
         * 5.将所有的对象保存到list中
         *
         */
        List<Avtor> avtorList = avtorStream.collect(Collectors.toList());

    }
}
