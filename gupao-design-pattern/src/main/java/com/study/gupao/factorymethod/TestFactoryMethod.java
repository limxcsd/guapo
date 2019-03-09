package com.study.gupao.factorymethod;

import com.study.gupao.IProduct;

/**
 * @ClassName: TestFactoryMethod
 * @Description: 测试工厂方法
 * @author: Adminstrator
 * @Date: 2019-03-09 18:37
 */
public class TestFactoryMethod {
    public static void main(String[] args) {
        IProductFactory factory = new ComputerProductFactory();
        IProduct animal = factory.create();
        animal.production();

        factory = new MobileProductFactory();
        animal = factory.create();
        animal.production();
    }
}
