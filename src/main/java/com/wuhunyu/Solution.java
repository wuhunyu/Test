package com.wuhunyu;

import cn.hutool.core.convert.Convert;

import java.util.Arrays;

public class Solution {

    public static int nextGreaterElement(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        int len = chars.length;
        boolean flag = false;
        for (int i = len - 2; i >= 0; i--) {
            if (chars[i] != chars[i + 1]) {
                char temp = chars[i];
                chars[i] = chars[i + 1];
                chars[i + 1] = temp;
                if (chars[i] > chars[i + 1]) {
                    flag = true;
                    break;
                }
            }
        }
        System.out.println(Convert.toStr(chars));
        long res = Long.parseLong(new String(chars));
        return flag && res <= Integer.MAX_VALUE ? (int) res : -1;
    }

    public static void main(String[] args) {
        System.out.println(nextGreaterElement(230241));
    }

}
