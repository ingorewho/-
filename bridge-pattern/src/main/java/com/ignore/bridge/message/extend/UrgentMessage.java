package com.ignore.bridge.message.extend;

import com.ignore.bridge.message.AbstractMessage;
import com.ignore.bridge.sender.SenderService;

/**
 * @Author: ignore1992
 * @Description:
 * @Date: Created In 10:33 2019/2/18
 */
public class UrgentMessage extends AbstractMessage{
    public UrgentMessage(SenderService senderService){
        super(senderService);
    }

    /**
     * 扩展一个监控接口
     */
    public void watch(){
        System.out.println("加急消息监控");
    }
}
