package com.jorgefigueiredo.pattern.gangoffour.creational.abstractFactory;

public class ConcreateFactory2 implements Factory {
    @Override
    public ObjectA createObjectA() {
        return new ConcreateObjectA2();
    }

    @Override
    public ObjectB createObjectB() {
        return new ConcreateObjectB2();
    }
}
