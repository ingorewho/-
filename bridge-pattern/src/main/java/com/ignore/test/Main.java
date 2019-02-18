package com.ignore.test;

import com.ignore.bridge.message.AbstractMessage;
import com.ignore.bridge.message.extend.SepcialMessage;
import com.ignore.bridge.sender.SenderService;
import com.ignore.bridge.sender.impl.SendSMSService;

/**
 * @Author: ignore1992
 * @Description:
 * @Date: Created In 10:39 2019/2/18
 */
public class Main {
    public static void main(String[] args) {
        //选择短信发送器
        SenderService senderService = new SendSMSService();
        //选择加急消息类型
        SepcialMessage message = new SepcialMessage(senderService);
        //调用公共发送接口
        message.send("hello world.");
        //调用扩展接口
        message.sepcailHandle();
    }
}
