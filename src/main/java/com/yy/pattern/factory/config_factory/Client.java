package com.yy.pattern.factory.config_factory;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: 
 * @Author: YY
 */
public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("american");
        System.out.println(coffee.getName());

        System.out.println("=============");
        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());
    }
}
