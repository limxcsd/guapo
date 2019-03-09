package com.study.gupao.abstractfactory;

import com.study.gupao.IProduct;

/**
 * @ClassName: IProductFactory
 * @Description: 产品的抽象，所有产品都实现该工厂，
 * @author: Adminstrator
 * @Date: 2019-03-09 19:16
 */
public interface IProductFactory {


    /**
     * 生产手机
     * @return
     */
    IMobile createMobile();

    /**
     * 生产电脑
     * @return
     */
    IComputer createComputer();

}
