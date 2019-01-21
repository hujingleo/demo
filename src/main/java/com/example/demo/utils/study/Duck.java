package com.example.demo.utils.study;

public abstract class Duck {
    public  String name;
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    void performQuack(){
        quackBehavior.quack();
    }
    void display(){
        System.out.println("i am a Duck");
    }
}
