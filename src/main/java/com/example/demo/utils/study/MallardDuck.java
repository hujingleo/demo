package com.example.demo.utils.study;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior =new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("i am a real MallardDuck");
    }
}
