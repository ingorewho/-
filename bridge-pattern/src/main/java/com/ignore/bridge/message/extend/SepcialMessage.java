package com.ignore.bridge.message.extend;

import com.ignore.bridge.message.AbstractMessage;
import com.ignore.bridge.sender.SenderService;

/**
 * @Author: ignore1992
 * @Description:
 * @Date: Created In 10:35 2019/2/18
 */
public class SepcialMessage extends AbstractMessage{
    public SepcialMessage(SenderService senderService){
        super(senderService);
    }

    /**
     * 扩展一个特急处理接口.
     */
    public void sepcailHandle(){
        System.out.println("特急处理.");
    }
}
