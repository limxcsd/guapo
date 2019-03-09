package com.study.gupao;

/**
 * @ClassName: DogAnimal
 * @Description:
 * @author: Adminstrator
 * @Date: 2019-03-09 18:33
 */
public class MobileProduct implements IProduct {
    @Override
    public void production() {
        System.out.println("正在生产手机");
    }
}
