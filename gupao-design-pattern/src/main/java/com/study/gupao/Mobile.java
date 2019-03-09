package com.study.gupao;

import com.study.gupao.IProduct;

/**
 * @ClassName: Mobile
 * @Description: 接口的具体实现-手机
 * @author: Adminstrator
 * @Date: 2019-03-09 17:13
 */
public class Mobile implements IProduct {
    @Override
    public void production() {
        System.out.println("生产手机");
    }
}
