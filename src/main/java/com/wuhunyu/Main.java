package com.wuhunyu;

import java.util.*;

/**
 * @author wuhunyu
 */
public class Main {

    public int countSegments(String s) {
        int length = s.length();
        if (length == 0) {
            return 0;
        }
        char pre = s.charAt(0);
        if (length == 1) {
            return pre == ' ' ? 0 : 1;
        }
        int count = 0;
        for (int i = 1; i < length; i++) {
            char ch = s.charAt(i);
            if (pre != ' ' && s.charAt(i) == ' ') {
                count++;
            }
            pre = ch;
        }
        if (pre != ' ') {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Main().countSegments("ac"));
    }

}
