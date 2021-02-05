package com.ky2009888.apps;

import com.ky2009888.apps.vo.OrderInfo;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * 比较订单的价格.
 *
 * @author Lenovo
 */
@Slf4j
public class CompareOrderInfoV2 {
    /**
     * 定义订单列表.
     */
    private List<OrderInfo> orderInfoList;

    /**
     * 默认构造方法.
     */
    public CompareOrderInfoV2() {
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
        CompareOrderInfoV2 compareInfo = new CompareOrderInfoV2();
        List<OrderInfo> collect = compareInfo
                .orderInfoList
                .stream()
                .sorted(((o1, o2) -> o1.getPrice() - o2.getPrice())).collect(toList());
        log.info("{}", collect);
        List<OrderInfo> orderInfoList = compareInfo.orderInfoList.parallelStream().sorted(comparing(OrderInfo::getPrice)).collect(toList());
        log.info("{}", orderInfoList);
        compareInfo.orderInfoList.parallelStream().sorted(comparing(OrderInfo::getOrderId).reversed()).map(OrderInfo::getProductName);
        List<String> stringList = compareInfo.orderInfoList.parallelStream().sorted(comparing(OrderInfo::getOrderId).reversed()).map(OrderInfo::getProductName).collect(toList());
        log.info("{}", stringList);
    }
}
