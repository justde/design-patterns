package org.justd.abstractFactory.factory;

import org.justd.abstractFactory.sender.Sender;

/**
 * @author: zhangjd
 * @Date: 2018/10/11 20:36
 * @Description:
 */
public interface Provider {
    public Sender produce();
}
