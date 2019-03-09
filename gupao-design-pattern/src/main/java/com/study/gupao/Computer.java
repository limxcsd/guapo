package com.study.gupao;

import com.study.gupao.IProduct;

/**
 * @ClassName: Computer
 * @Description: 具体生产的实现
 * @author: Adminstrator
 * @Date: 2019-03-09 17:12
 */
public class Computer implements IProduct {
    @Override
    public void production() {
        System.out.println("生产电脑");
    }
}
