package com.wuhunyu;

/**
 * @author wuhunyu
 */
public class Father {

    static InitObj staticObj = new InitObj("静态father");

    InitObj obj = new InitObj("father");

    static {
        System.out.println("father static");
    }

    {
        System.out.println("father 构造");
    }

    public Father() {
        print();
    }

    public void print() {
        System.out.println("father.obj is " + obj);
    }
}
