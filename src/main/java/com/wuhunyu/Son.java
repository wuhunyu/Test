package com.wuhunyu;

/**
 * @author wuhunyu
 */
public class Son extends Father {

    static InitObj staticObj = new InitObj("้ๆson");

    InitObj obj = new InitObj("son");

    static {
        System.out.println("son static");
    }

    {
        System.out.println("son ๆ้ ");
    }

    public Son() {
        print();
    }

    @Override
    public void print() {
        System.out.println("son.obj is " + obj);
    }

}
