package org.justd.builder;

import org.justd.builder.sender.Sender;
import org.justd.builder.sender.impl.MailSender;
import org.justd.builder.sender.impl.SmsSender;

import java.util.ArrayList;
import java.util.List;

public class Builder {
    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for (int i=0; i<count; i++){
            list.add(new MailSender());
        }
    }
    public void produceSmsSender(int count){
        for (int i = 0; i <count ; i++) {
            list.add(new SmsSender());
        }
    }
}
