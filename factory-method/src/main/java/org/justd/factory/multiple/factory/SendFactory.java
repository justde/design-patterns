package org.justd.factory.multiple.factory;


import org.justd.factory.multiple.sender.Sender;
import org.justd.factory.multiple.sender.impl.MailSender;
import org.justd.factory.multiple.sender.impl.SmsSender;

/**
 * @author: zhangjd
 * @Date: 2018/9/30 10:13
 * @Description:
 */
public class SendFactory {
   public Sender produceMail(){
       return new MailSender();
   }

   public Sender produceSms(){
       return new SmsSender();
   }
}
