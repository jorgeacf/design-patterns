package com.jorgefigueiredo.pattern.gangoffour.creational.abstractFactory;

public class Client {
    private final ObjectA a;
    private final ObjectB b;

    public Client(Factory factory) {
        a = factory.createObjectA();
        b = factory.createObjectB();
    }

    public void run() {
        b.interact(a);
    }
}
