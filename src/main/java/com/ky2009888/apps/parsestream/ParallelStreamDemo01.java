package com.ky2009888.apps.parsestream;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * @author Lenovo
 */
@Slf4j
public class ParallelStreamDemo01 {
    public static void main(String[] args) {
        ArrayList names = new ArrayList<String>();
        Collections.addAll(names, "张胜男", "张三", "李四");
        Object zhangList = names.parallelStream().filter(name -> name.toString().startsWith("张")).collect(Collectors.toList());
        log.info("{}", zhangList);
        long startTime = System.currentTimeMillis();
        long sumTotal = LongStream.rangeClosed(0, 1000).reduce(0, (x, y) -> x + y);
        log.info("{}", sumTotal);
        long endTime = System.currentTimeMillis();
        log.info("endTime-startTime:{}", endTime - startTime);
        startTime = System.currentTimeMillis();
        long sumTotal2 = LongStream.rangeClosed(0, 1000).parallel().sum();
        endTime = System.currentTimeMillis();
        log.info("{}", sumTotal2);
        log.info("endTime-startTime:{}", endTime - startTime);
    }
}
