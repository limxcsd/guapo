package com.study.gupao.abstractfactory;

/**
 * @ClassName: AbstractFactoryTest
 * @Description: 抽象工厂测试
 * @author: Adminstrator
 * @Date: 2019-03-09 20:00
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AppleProductFactory factory = new AppleProductFactory();
        factory.createComputer().productionComputer();

        factory.createMobile().productionMobile();

        XiaomiProductFactory xiaomiFactory = new XiaomiProductFactory();
        xiaomiFactory.createMobile().productionMobile();
    }
}
