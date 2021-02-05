package com.ky2009888.apps;

import com.ky2009888.apps.vo.OrderInfo;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 比较订单的价格.
 *
 * @author Lenovo
 */
@Slf4j
public class CompareOrderInfoV1 {
    /**
     * 定义订单列表.
     */
    private List<OrderInfo> orderInfoList;

    /**
     * 默认构造方法.
     */
    public CompareOrderInfoV1() {
        orderInfoList = new ArrayList<>();
        orderInfoList.add(new OrderInfo(1, "商品1", 12, "南京"));
        orderInfoList.add(new OrderInfo(2, "商品2", 9, "北京"));
        orderInfoList.add(new OrderInfo(3, "商品3", 11, "东京"));
        orderInfoList.add(new OrderInfo(4, "商品4", 13, "西安"));
    }

    /**
     * 定义构造方法.
     *
     * @param args 命令行参数.
     */
    public static void main(String[] args) {
        CompareOrderInfoV1 compareInfo = new CompareOrderInfoV1();
        /**
         * 按照价格进行排序
         * 1、方法参数的类型可以省略.
         * 2、方法参数只有一个，小括号可以省略.
         * 3、如果方法体只有一个返回值，则可以省略它的大括号和return 关键字。
         */
        Collections.sort(compareInfo.orderInfoList, (orderInfo1,orderInfo2) -> orderInfo1.getPrice() - orderInfo2.getPrice());
        log.info("{}", compareInfo.orderInfoList);
    }
}
