package com.study.gupao.factorymethod;

import com.study.gupao.ComputerProduct;
import com.study.gupao.IProduct;

/**
 * @ClassName: ComputerProductFactory
 * @Description:  电脑创建工厂
 * @author: Adminstrator
 * @Date: 2019-03-09 18:31
 */
public class ComputerProductFactory implements IProductFactory {
    @Override
    public IProduct create() {
        return new ComputerProduct();
    }
}
