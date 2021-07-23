package com.wechat;

import com.aiyu.pay;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/7/23 7:39 下午
 * @description
 */

public class wechatServices implements pay {
    @Override
    public void payIn() {
        System.out.println("wechatServices pay...");
    }
}
