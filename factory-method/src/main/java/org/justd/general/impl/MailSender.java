package org.justd.general.impl;

import org.justd.general.Sender;

/**
 * @author: zhangjd
 * @Date: 2018/9/30 11:11
 * @Description:
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is MailSender");
    }
}
