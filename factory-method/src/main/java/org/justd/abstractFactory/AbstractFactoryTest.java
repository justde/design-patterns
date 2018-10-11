package org.justd.abstractFactory;

import org.justd.abstractFactory.factory.Provider;
import org.justd.abstractFactory.factory.impl.SendMailFactory;
import org.justd.abstractFactory.sender.Sender;

/**
 * @author: zhangjd
 * @Date: 2018/10/11 20:39
 * @Description:
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}
