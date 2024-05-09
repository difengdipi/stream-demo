package com.zh.streamdemo.stream;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author: 周海
 * @Create : 2024/5/9
 **/
public class mystream4 {
    public static void main(String[] args) {
//       数组
        int[] arr = {1, 2, 3, 4, 5, 6};
//        获取数组的stream流
        Arrays.stream(arr).forEach(s -> System.out.println(s));

        String[] arrs = {"a", "b", "c"};
        Arrays.stream(arrs).forEach(s -> System.out.println(s));

    }
}
