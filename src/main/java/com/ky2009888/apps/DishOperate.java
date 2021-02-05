package com.ky2009888.apps;

import com.ky2009888.apps.vo.Dish;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * @author Lenovo
 */
@Slf4j
public class DishOperate {
    /**
     * 定义菜单列表.
     */
    private List<Dish> menu;

    /**
     * 定义构造函数.
     */
    public DishOperate() {
        menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH));
    }

    /**
     * 入口执行方法.
     *
     * @param args 命令行参数.
     */
    public static void main(String[] args) {
        //集合说的数据，而流说的是计算
        //流的数据处理功能支持类似于数据库的操作，以及函数式编程语言中
        //的常用操作，如filter、 map、 reduce、 find、 match、 sort等。流操作可以顺序执
        //行，也可并行执行
        //需求，将热量排名前三的菜肴的名字列出来
        DishOperate dishOperate = new DishOperate();
        List<String> dishNameList = dishOperate.menu
                .parallelStream().sorted(comparing(Dish::getCalories).reversed())
                .map(Dish::getName).limit(3).collect(toList());
        log.info("{}", dishNameList);
    }
}
