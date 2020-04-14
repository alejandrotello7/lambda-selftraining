package com.lambda;

public class Tester {

	public static void main(String[] args) {
		
		Greeting printCorrect = () -> System.out.println("informacion correct");
		Greeting printIncorrect = () -> System.out.println("informacion incorrecta");
		Adder operation = (a,b) -> a+b;
		Adder multiplicator = (c,d) -> c*d;
		
		
		printCorrect.perform();
		printIncorrect.perform();
		System.out.println(operation.add(10, 20));
		System.out.println(multiplicator.add(10, 20));

	}
} 