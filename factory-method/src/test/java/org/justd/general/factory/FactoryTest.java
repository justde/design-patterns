package org.justd.general.factory;

import org.justd.general.Sender;

/**
 * @author: zhangjd
 * @Date: 2018/9/30 10:22
 * @Description:
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("22");
            sender.send();
    }
}
