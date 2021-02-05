package com.ky2009888.apps;

import com.ky2009888.apps.vo.OrderInfo;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 比较订单的价格.
 *
 * @author Lenovo
 */
@Slf4j
public class CompareOrderInfo {
    /**
     * 定义订单列表.
     */
    private List<OrderInfo> orderInfoList;

    /**
     * 默认构造方法.
     */
    public CompareOrderInfo() {
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
        CompareOrderInfo compareInfo = new CompareOrderInfo();
        /**
         * 按照价格进行排序
         */
       /* Collections.sort(compareInfo.orderInfoList, new Comparator<OrderInfo>() {
            @Override
            public int compare(OrderInfo o1, OrderInfo o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });*/
        Collections.sort(compareInfo.orderInfoList, (OrderInfo orderInfo1, OrderInfo orderInfo2) -> {
            return orderInfo1.getPrice() - orderInfo2.getPrice();
        });
        log.info("{}", compareInfo.orderInfoList);
    }
}
