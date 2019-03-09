package com.study.gupao;

/**
 * @ClassName: FanProduct
 * @Description:
 * @author: Adminstrator
 * @Date: 2019-03-09 18:33
 */
public class ComputerProduct implements IProduct {
    @Override
    public void production() {
        System.out.println("正在生产风扇");
    }
}
