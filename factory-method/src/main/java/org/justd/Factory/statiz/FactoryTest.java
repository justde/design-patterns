package org.justd.Factory.statiz;

import org.justd.Factory.statiz.factory.SenderFactory;
import org.justd.Factory.statiz.sender.Sender;

/**
 * @author: zhangjd
 * @Date: 2018/10/11 20:06
 * @Description:
 */
public class FactoryTest {

    public static void main(String[] args) {
        Sender sender = SenderFactory.produceMail();
        sender.send();
    }
}
