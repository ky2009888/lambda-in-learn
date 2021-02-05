package com.ky2009888.apps;

import com.ky2009888.apps.api.SomkApi;
import lombok.extern.slf4j.Slf4j;

/**
 * 演示了有lambda有参函数的使用方法
 * （参数列表）->{retrun 返回值;}
 *
 * @author Lenovo
 */
@Slf4j
public class SmokeLambda {
    public static void main(String[] args) {
        /**
         * 原始方法的写法.
         */
        smoke(new SomkApi() {
            @Override
            public int somke(String somkeTypeName) {
                return 5;
            }
        });
        /**
         * lambda表达式方式的改写.
         */
        smoke((String smockTypeName) -> {
            return 5;
        });
    }

    public static void smoke(SomkApi somkApi) {
        int somkeCount = somkApi.somke("金陵13钗");
        log.info("{}", somkeCount);
    }
}
