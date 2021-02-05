package com.ky2009888.apps;

import com.ky2009888.apps.api.SwimmingApi;
import lombok.extern.slf4j.Slf4j;

/**
 * lambda的标准格式:
 * (参数列表)->{}
 * lambda 表达式就是对接口抽象法方法的重写.
 *
 * @author Lenovo
 */
@Slf4j
public class SwimingLambda {
    /**
     * 主入口方法
     *
     * @param args 参数列表.
     */
    public static void main(String[] args) {
        goSwimming(() -> {
            log.info("start to learn swim ,because it's interesting");
        });
    }

    /**
     * 定义方法调用.
     *
     * @param swimmingApi
     */
    public static void goSwimming(SwimmingApi swimmingApi) {
        swimmingApi.swiming();
    }
}
