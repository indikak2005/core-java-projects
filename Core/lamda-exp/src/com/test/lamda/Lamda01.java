package com.test.lamda;

import java.io.Serializable;

public class Lamda01 {
	
	private static void runByImplementingRunnable() {
		Thread t = new Thread(new CodeToRun());
		t.setName("Print-Thread");
		t.start();
		System.out.println("Something written from Main Thread :" + Thread.currentThread().getName());
	}
	
	private static void runViaAnnonymousClass() {		
		 new Thread(new Runnable() {			
			@Override
			public void run() {
				System.out.println("Printing from Annonymous Inner Class :" + Thread.currentThread().getName() );					
			}
		}).start();			
	}
	
	private static void runViaLamdaExpression() {
		new Thread(()->  {
			System.out.println("Printing Via Lamda Expression " + Thread.currentThread().getName());
		}).start();
	}
	
	
	public static void main(String[] args) {
		runByImplementingRunnable();
		runViaAnnonymousClass();
		runViaLamdaExpression();
	}

}

class CodeToRun implements Runnable {
	@Override
	public void run() {
		System.out.println("Printing from Runnable :" + Thread.currentThread().getName());		
	}
	
}

class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	
	public Employee() {
	}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
	
}