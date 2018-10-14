package org.justd.decorator;

public class Decorator implements Sourceable{
    private Sourceable source;

    public Decorator(Sourceable sourcce){
        this.source = sourcce;
    }
    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator");
    }
}
