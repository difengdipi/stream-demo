package com.zh.streamdemo.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author: 周海
 * @Create : 2024/5/9
 **/
public class mystream2 {
    public static void main(String[] args) {
//        单列集合
        ArrayList<String> arr = new ArrayList<>();
        Collections.addAll(arr, "1", "2", "3", "4", "5");
//        Stream<String> stream = arr.stream();
//        stream.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        arr.stream().forEach(s -> System.out.println(s));
    }
}
