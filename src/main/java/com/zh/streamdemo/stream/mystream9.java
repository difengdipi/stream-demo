package com.zh.streamdemo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author: 周海
 * @Create : 2024/5/9
 **/
public class mystream9 {
    public static void main(String[] args) {
//    //steam的Api
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "周海-1", "周海-2", "周海-11", "周海-12", "周海-13", "周海-14", "周海-15", "周海-22", "周海-112");

        System.out.println(list.stream().count());
        System.out.println(list.stream().map(s -> Integer.parseInt(s.split("-")[1])).count());

//        toArray()
//        收集流中的数据--放到数组中
//        String[] arr = list.stream().toArray(String[]::new);
//        System.out.println(Arrays.toString(arr));
//        String[] array = list.stream().toArray(String[]::new);
//        System.out.println(Arrays.toString(array));

        String[] array = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(array));

    }
}
