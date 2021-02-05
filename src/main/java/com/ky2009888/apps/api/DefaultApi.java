package com.ky2009888.apps.api;

/**
 * 接口定义默认方法，新增方法的时候，不需要每个实现接口的类都要重新修改一下
 *
 * @author Lenovo
 */
public interface DefaultApi {
    /**
     * 接口定义默认方法
     *
     * @return GOTO
     */
    default void goTo() { }

    /**
     * 将字符串转成大写的格式.
     *
     * @param targetStr 目标字符串.
     * @return String.
     */
    String toUpcase(String targetStr);
}
