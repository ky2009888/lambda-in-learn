package com.ky2009888.apps.parsestream;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 添加演示效果
 *
 * @author Lenovo
 */
@Slf4j
public class StreamParallelSafeDemo {
    public static void main(String[] args) {
        //boxed方法:Returns a {@code Stream} consisting of the elements of this stream,
        //each boxed to an {@code Integer}
        List<Integer> collect = IntStream.rangeClosed(1, 100).parallel().boxed().collect(Collectors.toList());
        log.info("collect:{}", collect);
        log.info("collect:{}", collect.size());
        //线程安全操作的方法1:
        List<Integer> integerList = new ArrayList<>();
        Object intObject = new Object();
        IntStream.rangeClosed(1, 100).parallel().forEach((int x) -> {
            synchronized (intObject) {
                integerList.add(x);
            }
        });
        //线程安全操作的方法2：
        //移动代码的快捷键:alt+up/down
        List<Integer> synIntegerList = Collections.synchronizedList(new ArrayList<>());
        IntStream.rangeClosed(1, 100).parallel().forEach((int x) -> {
            synIntegerList.add(x);
        });
        log.info("integerList:{}", integerList);
        log.info("integerList.count:{}", integerList.size());
    }
}
