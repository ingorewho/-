package com.ignore.bridge.sender.impl;

import com.ignore.bridge.sender.SenderService;

/**
 * @Author: ignore1992
 * @Description:
 * @Date: Created In 10:38 2019/2/18
 */
public class SendEMailService implements SenderService{
    public void send(String message) {
        System.out.println("发送emali消息: " + message);
    }
}
