package com.company;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class Subject{

    private ArrayList observers = new ArrayList();//保存Observer们
    public void addObserver(Observer observer){
        observers.add(observer);
    };//第一种，注册Obeserver

    public void addObserver(ObserverI observer){
        observers.add(observer);
    };//第二种方法，注册Obeserver的方式

    public void notifyObservers(){
        //向Observer发送通知
        Iterator it = observers.iterator();
        while (it.hasNext()){
            Observer observer = (Observer)it.next();
            observer.update();
        }
    }

    public void notifyObservers2(){
        //第二种方法，向Observer发送通知
        Iterator it = observers.iterator();
        while (it.hasNext()){
            ObserverI observer = (ObserverI)it.next();
            observer.update(this);
        }
    }
    public abstract int getState();
    public abstract void setState();
}
