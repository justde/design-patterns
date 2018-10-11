package org.justd.Factory.statiz.sender.impl;

import org.justd.Factory.statiz.sender.Sender;

/**
 * @author: zhangjd
 * @Date: 2018/10/11 20:03
 * @Description:
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is MailSender");
    }
}
