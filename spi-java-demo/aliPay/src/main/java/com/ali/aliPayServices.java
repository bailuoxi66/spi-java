package com.ali;

import com.aiyu.pay;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/7/23 7:49 下午
 * @description
 */

public class aliPayServices implements pay {
    @Override
    public void payIn() {
        System.out.println("aliServices pay...");
    }

    public aliPayServices(){
        System.out.println("here aliPayServices 构造函数");
    }
}
