package com.ky2009888.apps.stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * 获取流的两种方式
 *
 * @author Lenovo
 */
public class StreamCreateTwoWays {
    /**
     * stream的获取方式
     *
     * @param args
     */
    public static void main(String[] args) {
        //1、list stream
        List<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();
        //2、set stream
        Set<String> set = new HashSet<>();
        Stream<String> setStream = set.stream();
        //3、map keyset
        Map<String, String> map = new HashMap<>();
        Stream<String> mapKeySetStream = map.keySet().stream();
        Stream<String> stream = map.values().stream();
        Stream<Map.Entry<String, String>> mapEntrySetStream = map.entrySet().stream();
        //4、通过Stream.of的方式创建流
        Stream<String> stringStream = Stream.of("1", "2", "3", "4");
        //Stream流的使用注意事项:
        //1、Stream只能操作一次；
        //2、Stream返回的是新的流；
        //3、Stream不调用终结方法，中间的方法不会执行。
    }
}
