package com.company;

import java.util.Random;

public class Subjecta extends Subject{
    //第一种方法对应的Subject的具体实现类
    private int number;
    private Random random = new Random();

    @Override
    public int getState() {
        return number;
    }

    @Override
    public void setState() {
        for(int i = 0 ;i < 10 ;i++){
            number = random.nextInt(48);
            notifyObservers();
        }
    }
}
