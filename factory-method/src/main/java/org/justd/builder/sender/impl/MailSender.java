package org.justd.builder.sender.impl;

import org.justd.builder.sender.Sender;

/**
 * @author: zhangjd
 * @Date: 2018/10/11 20:34
 * @Description:
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}
