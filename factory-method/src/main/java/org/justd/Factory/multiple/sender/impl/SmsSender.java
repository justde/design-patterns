package org.justd.Factory.multiple.sender.impl;

import org.justd.Factory.multiple.sender.Sender;

/**
 * @author: zhangjd
 * @Date: 2018/9/30 21:12
 * @Description:
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is SmsSender");
    }
}
