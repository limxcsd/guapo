package com.study.gupao.abstractfactory;

import com.study.gupao.IProduct;

/**
 * @ClassName: AppleProductFactory
 * @Description: 苹果生产工厂
 * @author: Adminstrator
 * @Date: 2019-03-09 19:53
 */
public class AppleProductFactory implements IProductFactory{


    @Override
    public IMobile createMobile() {
        return new AppleProduct();
    }

    @Override
    public IComputer createComputer() {
        return new AppleComputerProduct();
    }
}
