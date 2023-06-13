package com.coreJava.DesignPatterns.singelton.design.pattern;

import com.coreJava.DesignPatterns.abstract_factory.pattern.TraineeTeacher;


public class MainClass {
	public static void main(String[] args) {
		SingeltonClass singeltonObject = SingeltonClass.getInstance();
		singeltonObject.simpleMethod();
		
		SingeltonClass singeltonObject2 = SingeltonClass.getInstance();
		singeltonObject2.simpleMethod();
		
		TraineeTeacher teacher = new TraineeTeacher();
		System.out.println(teacher);
		
		TraineeTeacher teacher2 = new TraineeTeacher();
		System.out.println(teacher2);
	}

}
