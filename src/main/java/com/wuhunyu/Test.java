package com.wuhunyu;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 测试类
 *
 * @author wuhunyu
 */
public class Test {

public boolean isPrefixString(String s, String[] words) {
    int strLen = s.length();
    int index = 0;
    for (String word : words) {
        int len = word.length();
        for (int i = 0; i < len; i++) {
            if (index < strLen && s.charAt(index) == word.charAt(i)) {
                index++;
            } else {
                return false;
            }
        }
        if (index == strLen) {
            return true;
        }
    }
    return false;
}

    public static void main(String[] args) {
        System.out.println(new Test().isPrefixString("iloveleetcod", new String[]{"i", "love", "leetcode", "apples"}));
    }

}

