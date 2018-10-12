package org.justd.factory.statiz;

import org.justd.factory.statiz.factory.SenderFactory;
import org.justd.factory.statiz.sender.Sender;

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
