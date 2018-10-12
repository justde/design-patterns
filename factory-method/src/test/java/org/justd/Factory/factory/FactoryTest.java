package org.justd.Factory.factory;

import org.justd.factory.general.factory.Sender;
import org.justd.factory.general.factory.SendFactory;

/**
 * @author: zhangjd
 * @Date: 2018/9/30 10:22
 * @Description:
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("mail");
            sender.send();
    }
}
