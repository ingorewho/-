package com.ignore.bridge.sender.impl;

import com.ignore.bridge.sender.SenderService;

/**
 * @Author: ignore1992
 * @Description:
 * @Date: Created In 10:37 2019/2/18
 */
public class SendSMSService implements SenderService{
    public void send(String message) {
        System.out.println("发送短信消息: " + message);
    }
}
