package com.noodles.oop.abstraction.mylog.impl;

import com.noodles.oop.abstraction.mylog.Logger;

import java.util.logging.Level;

/**
 * @Description
 * @Author liuxian
 * @Date 2023/10/20 13:56
 **/
public class MessageQueueLogger extends Logger {

    private MessageQueueClient msgQueueClient;

    public MessageQueueLogger(String name, boolean enabled, Level minPermittedLevel, MessageQueueClient msgQueueClient) {
        super(name, enabled, minPermittedLevel);
        this.msgQueueClient = msgQueueClient;
    }

    @Override
    protected void doLog(Level level, String message) {
        msgQueueClient.send(message);
    }

}
