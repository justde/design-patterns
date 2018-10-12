package org.justd.builder.sender.impl;

import org.justd.builder.sender.Sender;

/**
 * @author: zhangjd
 * @Date: 2018/10/11 20:35
 * @Description:
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
