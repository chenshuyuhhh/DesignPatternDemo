package com.company;

public class Observerb extends Observer{
    public Observerb(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.print("Observerb : ");
        for(int i = 0 ;i< subject.getState();i++) {
            System.out.print('-');
        }
        System.out.println();
    }
}
