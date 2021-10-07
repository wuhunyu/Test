package com.wuhunyu;


import cn.hutool.core.convert.Convert;
import com.alibaba.fastjson.JSONObject;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NewTest {

    public static void main(String[] args) {
        JSONObject userInfo = WXDecryptUtil.getUserInfo("oFJtHZgptxAI0L+rGwexznbQR7lWGoaJjmOIPycTNmvLBPXoh2A5wCf0MqhqTbD9JP5+WTTQL7IT/cv5P2uq9pAuN3K27EqfiteWWQoavwj0ieqfes7wjzjbfSwukqJpD+wFZPPZeA8Fcgi7EoALFYlBWU/hUF7MDyWvk/ZIdf+6RjmadVbBm8rEYOY8dNS2bB0Kj86hrjWKMtpqHw6DdA==", "9dH7kodQ4U1OFy8gnMcENg==", "3yPPJqfDN9pBSqS0qvXVoA==");
        System.out.println(userInfo);
    }
}