package com.company;

public class Main {

    public static void main(String[] args) {
		System.out.println("第一种方法");

    	Subject subject = new Subjecta();
	    new Observera(subject);
	    new Observerb(subject);
	    subject.setState();

	    System.out.println("第二种方法");

	    Subject newsubject = new Subjectafter();
		ObserverI observer1 = new ObserverI1();
		ObserverI observer2 = new ObserverI2();
		newsubject.addObserver(observer1);
		newsubject.addObserver(observer2);
		newsubject.setState();
    }
}
