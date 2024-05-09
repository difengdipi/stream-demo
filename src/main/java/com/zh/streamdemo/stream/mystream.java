package com.zh.streamdemo.stream;

import java.util.ArrayList;

/**
 * @author: 周海
 * @Create : 2024/5/9
 **/
public class mystream {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("周海");
        arr.add("罗怡骋");
        arr.add("张三");
        arr.add("张三风");

        arr.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).forEach(name -> System.out.println(name));

//        ArrayList<String> arr2 = new ArrayList<>();
//        for (String name : arr) {
//            if(name.startsWith("张")){
//                arr2.add(name);
//            }
//        }
//        System.out.println(arr2);
//        arr2.add("-------------");
////        2.张开头，长度为三
//        for (String name : arr) {
//            if(name.startsWith("张")&&name.length() == 3){
//                arr2.add(name);
//            }
//        }
//        System.out.println(arr2);
    }
}
