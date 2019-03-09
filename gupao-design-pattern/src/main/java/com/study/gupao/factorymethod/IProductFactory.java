package com.study.gupao.factorymethod;

import com.study.gupao.IProduct;

/**
 * @ClassName: IAnimalFactory
 * @Description: 产品工厂
 * @author: Adminstrator
 * @Date: 2019-03-09 18:30
 */
public interface IProductFactory {
    /**
     * 创建产品
     * @return
     */
    IProduct create();
}
