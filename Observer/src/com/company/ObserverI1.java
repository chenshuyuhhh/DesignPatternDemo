package com.company;

public class ObserverI1 implements ObserverI{
    @Override
    public void update(Subject subject) {
        System.out.println( "Observera : " + subject.getState());
    }
}
