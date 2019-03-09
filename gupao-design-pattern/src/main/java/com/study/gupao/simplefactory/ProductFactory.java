package com.study.gupao.simplefactory;

import com.study.gupao.Computer;
import com.study.gupao.IProduct;
import com.study.gupao.Mobile;

/**
 * @ClassName: ProductFactory
 * @Description: 生产工厂类：创建具体的产品
 * @author: Adminstrator
 * @Date: 2019-03-09 17:17
 */
public class ProductFactory {

    public static IProduct createAnimal(String name){
        IProduct product = null;
        switch (name){
            case "computer":
                product = new Computer();
                break;
            case "mobile":
                product = new Mobile();
                break;
            default:
                System.out.println("没有该产品");
        }
        return product;
    }

    public static IProduct createClass(Class<? extends IProduct> clazz){
       try{
           if(null != clazz){
               return clazz.newInstance();
           }
       }catch (Exception e){
           e.printStackTrace();
       }
        return null;
    }
}
