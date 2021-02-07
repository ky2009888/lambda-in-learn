package com.ky2009888.apps.optionals;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * 演示optional的操作
 *
 * @author Lenovo
 */
@Slf4j
public class OptionalOp {
    public static void main(String[] args) {
        //通过of方法创建一个Optional的实例.
        Optional<String> stringOptional = Optional.of("中国电信");
        //创建一个空的Optional
        Optional<Object> nullOptional = Optional.ofNullable(null);
        //创建一个空的Optional
        Optional<Object> emptyOptional = Optional.empty();
        //Return {@code true} if there is a value present, otherwise {@code false}.
        //@return {@code true} if there is a value present, otherwise {@code false}
        boolean present = stringOptional.isPresent();
        log.info("present：{}", present);
        if (stringOptional.isPresent()) {
            String name = stringOptional.get();
            log.info("name：{}", name);
        }
        //Optional的高级使用----------------------------->
        if (stringOptional.isPresent()) {
            String name = stringOptional.orElse("江苏电信");
            log.info("name：{}", name);
        }
        //Return the value if present, otherwise return {@code other}.
        log.info("{}", nullOptional.orElse("默认值"));
        //If a value is present, invoke the specified consumer with the value,
        //otherwise do nothing
        nullOptional.ifPresent(s -> log.info("s:{}", s));
        //演示Optional的操作
        List<String> namesList = new ArrayList<>();
        Collections.addAll(namesList, "JIJINLIANG", null, "JIM", "JINLIANG", "JIYOUHUI", "JIMANNING");
        Optional<List<String>> namesListOptional = Optional.ofNullable(namesList);
        String nameList = namesListOptional.map(name -> name.toString().toLowerCase()).orElse("xx");
        log.info("nameList：{}", nameList);
    }
}
