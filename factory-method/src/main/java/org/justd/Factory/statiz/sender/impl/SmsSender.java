package org.justd.Factory.statiz.sender.impl;

import org.justd.Factory.statiz.sender.Sender;

/**
 * @author: zhangjd
 * @Date: 2018/10/11 20:04
 * @Description:
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is SmsSender");
    }
}
