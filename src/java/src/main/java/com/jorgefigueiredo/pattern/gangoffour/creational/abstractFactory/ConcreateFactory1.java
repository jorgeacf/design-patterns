package com.jorgefigueiredo.pattern.gangoffour.creational.abstractFactory;

public class ConcreateFactory1 implements Factory {

    @Override
    public ObjectA createObjectA() {
        return new ConcreateObjectA1();
    }

    @Override
    public ObjectB createObjectB() {
        return new ConcreateObjectB1();
    }
}
