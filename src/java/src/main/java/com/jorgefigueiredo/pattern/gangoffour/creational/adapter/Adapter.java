package com.jorgefigueiredo.pattern.gangoffour.creational.adapter;

public class Adapter extends Target {

    private final NewTarget newTarget = new NewTarget();

    @Override
    public String operation() {
        return newTarget.newOperation();
    }
}
