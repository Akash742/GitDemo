package com.acc.lkm.JavaDay1;

public class Car {
	String model="";
	String colour="";
	int year;
	  public Car(){
		System.out.println("This is car class");
	}
	Car(String m,String c,int y){
		model=m;
		colour=c;
		year=y;
	}
	public void start() {
		System.out.println("car has started");
	}
	public void stop() {
		System.out.println("var is stopped");
	}
	public void display() {
		System.out.println("car model is: "+model+" car colour is "+colour+" year of manufacture : "+year );
	}
 
}