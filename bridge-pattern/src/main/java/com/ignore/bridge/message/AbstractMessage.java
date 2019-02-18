package com.ignore.bridge.message;

import com.ignore.bridge.sender.SenderService;

/**
 * @Author: ignore1992
 * @Description: 将发送动作和消息类型解耦，便于系统扩展
 * @Date: Created In 10:25 2019/2/18
 */
public abstract class AbstractMessage {
   private SenderService senderService;

   public AbstractMessage(SenderService senderService){
       this.senderService = senderService;
   }
   public void send(String message){
       senderService.send(message);
   }
}
