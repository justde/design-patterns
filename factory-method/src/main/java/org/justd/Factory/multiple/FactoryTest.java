package org.justd.Factory.multiple;


import org.justd.Factory.multiple.factory.SendFactory;
import org.justd.Factory.multiple.sender.Sender;

/**
 * @author: zhangjd
 * @Date: 2018/10/11 19:56
 * @Description:
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.send();
    }
}
