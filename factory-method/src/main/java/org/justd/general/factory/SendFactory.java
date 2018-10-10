package org.justd.general.factory;


import org.justd.general.Sender;
import org.justd.general.impl.MailSender;
import org.justd.general.impl.SmsSender;

/**
 * @author: zhangjd
 * @Date: 2018/9/30 10:13
 * @Description:
 */
public class SendFactory {
    public Sender produce(String type){
        if ("mail".equals(type)){
            return new MailSender();
        }else if ("sms".equals(type)){
            return new SmsSender();
        }else {

            System.out.println("type is error\n 不能正确创建对象，空指针异常");
            return null;
        }
    }
}
