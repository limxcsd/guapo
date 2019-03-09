package com.study.gupao.abstractfactory;

/**
 * @ClassName: AppleMobile
 * @Description: 小米产品
 * @author: Adminstrator
 * @Date: 2019-03-09 19:54
 */
public class XiaomiProduct implements IMobile {
    @Override
    public void productionMobile() {
        System.out.println("小米生产手机");
    }
}
