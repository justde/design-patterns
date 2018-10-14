package org.justd.prototype;

import java.io.*;

public class Prototype implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String string;

    private SerializableObject obj;
    //浅复制
    @Override
    public Object clone() throws CloneNotSupportedException{
        Prototype proto = (Prototype) super.clone();
        return proto;
    }

    //深复制
    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}



class SerializableObject implements Serializable{
    private static final long serialVersionUID = 1L;
}