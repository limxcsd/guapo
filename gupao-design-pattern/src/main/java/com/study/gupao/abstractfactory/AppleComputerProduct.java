package com.study.gupao.abstractfactory;

/**
 * @ClassName: AppleComputerProduct
 * @Description:  苹果电脑
 * @author: Adminstrator
 * @Date: 2019-03-09 19:59
 */
public class AppleComputerProduct implements IComputer{

    @Override
    public void productionComputer() {
        System.out.println("苹果生产电脑");
    }
}
