package com.wuhunyu;

/**
 * @author wuhunyu
 */
public class Son extends Father {

    static InitObj staticObj = new InitObj("静态son");

    InitObj obj = new InitObj("son");

    static {
        System.out.println("son static");
    }

    {
        System.out.println("son 构造");
    }

    public Son() {
        print();
    }

    @Override
    public void print() {
        System.out.println("son.obj is " + obj);
    }

}
