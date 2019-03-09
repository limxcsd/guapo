package com.study.gupao.factorymethod;

import com.study.gupao.MobileProduct;
import com.study.gupao.IProduct;

/**
 * @ClassName: CatAnimalFactory
 * @Description: 猫的工厂方法，创建猫
 * @author: Adminstrator
 * @Date: 2019-03-09 18:31
 */
public class MobileProductFactory implements IProductFactory {
    @Override
    public IProduct create() {
        return new MobileProduct();
    }
}
