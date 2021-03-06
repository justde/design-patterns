package org.justd.factory.statiz.factory;

import org.justd.factory.statiz.sender.Sender;
import org.justd.factory.statiz.sender.impl.MailSender;
import org.justd.factory.statiz.sender.impl.SmsSender;

/**
 * @author: zhangjd
 * @Date: 2018/10/11 20:05
 * @Description:
 */
public class SenderFactory {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
