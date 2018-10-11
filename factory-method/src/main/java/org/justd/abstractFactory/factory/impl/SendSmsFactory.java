package org.justd.abstractFactory.factory.impl;

import org.justd.abstractFactory.factory.Provider;
import org.justd.abstractFactory.sender.Sender;
import org.justd.abstractFactory.sender.impl.SmsSender;

/**
 * @author: zhangjd
 * @Date: 2018/10/11 20:38
 * @Description:
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
