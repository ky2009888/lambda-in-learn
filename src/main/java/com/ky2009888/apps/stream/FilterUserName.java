package com.ky2009888.apps.stream;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 过滤用户名字
 *
 * @author Lenovo
 */
@Slf4j
public class FilterUserName {
    public static void main(String[] args) {
        //定义用户名列表
        String userNames = "张梦琪,张筱宇,张可露,张竞予,张颖,张敏,张雅雯,张慧,张琇赑,张琇淼,张玉英,张茹,张馨予,张妍,张馨元,张馨方,张馨怡,张馨逸,张馨仪,张馨伊,张昕怡,张爱萍,张玉芳,张东丽,张玉兰,张笑宁,张小玉,张招英,张潇,张筠,张艺竞,张丽静,张卜鸾,张智雅,张瑞琪,张紫萱,张子萱,张善美,张智娟,张籽萱,张紫楦,张紫暄,张梓萱,张莹,张弦月,张蓝,张爱媛,张丽丽,张丙芳,张雯岚";
        //将用户名列表进行分割
        String[] userNamesArray = userNames.split(",");
        long userNameCount = Arrays.stream(userNamesArray)
                .filter(name -> name.length() == 3)
                .filter((name) -> {
                    return (name.split("")[1]).equals("馨");
                })
                .limit(3).count();
        log.info("{}", userNameCount);
        Arrays.stream(userNamesArray)
                .filter(name -> name.length() == 3)
                .filter((name) -> {
                    return (name.split("")[1]).equals("馨");
                })
                .limit(3)
                .forEach(name -> log.info(name));
        //将处理完成的结果放到一个list结果列表中
        List<String> nameStrList = Arrays.stream(userNamesArray)
                .filter(name -> name.length() == 3)
                .filter((name) -> {
                    return (name.split("")[1]).equals("馨");
                })
                .limit(3).collect(Collectors.toList());
        //方法引用的案例:
        Arrays.stream(userNamesArray)
                .filter(name -> name.length() == 3)
                .filter((name) -> {
                    return (name.split("")[1]).equals("馨");
                })//省略写法
                .limit(3).forEach(log::info);
        log.info("{}", nameStrList);
    }
}
