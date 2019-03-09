package com.study.gupao.abstractfactory;

/**
 * @ClassName: AppleMobile
 * @Description: 苹果产品
 * @author: Adminstrator
 * @Date: 2019-03-09 19:54
 */
public class AppleProduct implements IMobile {

    @Override
    public void productionMobile() {
        System.out.println("苹果生产手机");
    }
}
