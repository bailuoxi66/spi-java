package com.luoyu;

import com.aiyu.pay;

import java.util.ServiceLoader;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/7/23 7:44 下午
 * @description
 */

public class test {
    public static void main(String[] args) {
        ServiceLoader<pay> load = ServiceLoader.load(pay.class);
        for (pay pay : load) {
            pay.payIn();
        }
    }
}
