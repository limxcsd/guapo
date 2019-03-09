package com.study.gupao.simplefactory;

import com.study.gupao.Computer;
import com.study.gupao.IProduct;
import com.study.gupao.Mobile;

/**
 * @ClassName: Client
 * @Description: 客户端测试
 * @author: Adminstrator
 * @Date: 2019-03-09 17:23
 */
public class Client {
    public static void main(String[] args) {
        /*IAnimal dog = AnimalFactory.createAnimal("dog");
        dog.eat();
        IAnimal cat = AnimalFactory.createAnimal("cat");
        cat.eat();*/

        IProduct computer = ProductFactory.createClass(Computer.class);
        computer.production();
        IProduct mobile = ProductFactory.createClass(Mobile.class);
        mobile.production();
    }
}
