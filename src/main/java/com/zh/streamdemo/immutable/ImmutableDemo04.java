package com.zh.streamdemo.immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author: 周海
 * @Create : 2024/5/9
 **/
public class ImmutableDemo04 {
    /**
     * 不可变集合SMap-->只能进行查询操作
     * 细节：
     * 键是不可重复的，参数是有上限的，最多就只有20个
     * 这里解决了这解决了这里的上限问题，解决方案是传递对象（key,value）整体
     */
    public static void main(String[] args) {
        HashMap<String, String> hs = new HashMap<>();
        hs.put("周海", "贵州");
        hs.put("罗怡骋", "遵义");
        hs.put("罗怡骋1", "遵义");
        hs.put("罗怡骋2", "遵义");
        hs.put("罗怡骋3", "遵义");
        hs.put("罗怡骋4", "遵义");
        hs.put("罗怡骋5", "遵义");
        hs.put("罗怡骋6", "遵义");
        hs.put("罗怡骋7", "遵义");
        hs.put("罗怡骋8", "遵义");
        hs.put("罗怡骋9", "遵义");
        hs.put("罗怡骋10", "遵义");
//
////        获取到大于10的键值对对象
//        Set<Map.Entry<String, String>> entries = hs.entrySet();
//        Map.Entry[] entriesArray = entries.toArray(new Map.Entry[0]);
////        生成map 不可边的map集合
//        Map map = Map.ofEntries(entriesArray);

        Map<String, String> kvMap = Map.ofEntries(hs.entrySet().toArray(new Map.Entry[0]));

        System.out.println(kvMap.toString());

//        Map<String, String> map = Map.copyOf(hs);


    }

}
