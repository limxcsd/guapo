package com.study.gupao.abstractfactory;

/**
 * @ClassName: AppleProductFactory
 * @Description:  小米生产工厂
 * @author: Adminstrator
 * @Date: 2019-03-09 19:53
 */
public class XiaomiProductFactory implements IProductFactory{


    @Override
    public IMobile createMobile() {
        return new XiaomiProduct();
    }

    @Override
    public IComputer createComputer() {
        return null;
    }
}
