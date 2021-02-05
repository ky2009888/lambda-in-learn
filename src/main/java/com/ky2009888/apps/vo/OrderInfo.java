package com.ky2009888.apps.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 定义订单对象的简易版本.
 *
 * @author Lenovo
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderInfo implements Serializable {
    /**
     * 订单编码.
     */
    private int orderId;
    /**
     * 商品名称.
     */
    private String productName;
    /**
     * 商品价格.
     */
    private int price;
    /**
     * 收获地址.
     */
    private String address;
}
