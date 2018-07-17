package com.company;

public class ObserverI2 implements ObserverI{
    @Override
    public void update(Subject subject) {
        System.out.print("Observerb : ");
        for(int i = 0 ;i< subject.getState();i++) {
            System.out.print('-');
        }
        System.out.println();
    }
}
