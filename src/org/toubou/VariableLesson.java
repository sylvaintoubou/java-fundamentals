package org.toubou;

public class VariableLesson {
static int age=5;

public static void play() {
	int age=50;
	System.out.println(age);
}

public static void main(String[] args) {
	age=10;
	play();
}
}
