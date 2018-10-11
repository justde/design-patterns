package org.justd.Factory.multiple.factory;


import org.justd.Factory.multiple.sender.Sender;
import org.justd.Factory.multiple.sender.impl.MailSender;
import org.justd.Factory.multiple.sender.impl.SmsSender;

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
