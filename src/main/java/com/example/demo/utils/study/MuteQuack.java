package com.example.demo.utils.study;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("can't quack");
    }
}
