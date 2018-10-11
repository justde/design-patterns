package org.justd.abstractFactory.factory.impl;

import org.justd.abstractFactory.factory.Provider;
import org.justd.abstractFactory.sender.Sender;
import org.justd.abstractFactory.sender.impl.MailSender;

/**
 * @author: zhangjd
 * @Date: 2018/10/11 20:37
 * @Description:
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
