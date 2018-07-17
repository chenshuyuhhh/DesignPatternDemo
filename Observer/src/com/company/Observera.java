package com.company;

public class Observera extends Observer{
    public Observera(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println( "Observera : " + subject.getState());
    }
}