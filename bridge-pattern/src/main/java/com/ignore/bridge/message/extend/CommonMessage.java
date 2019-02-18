package com.ignore.bridge.message.extend;

import com.ignore.bridge.message.AbstractMessage;
import com.ignore.bridge.sender.SenderService;

/**
 * @Author: ignore1992
 * @Description: 普通消息发送器
 * @Date: Created In 10:32 2019/2/18
 */
public class CommonMessage extends AbstractMessage{
    public CommonMessage(SenderService senderService){
        super(senderService);
    }

}
