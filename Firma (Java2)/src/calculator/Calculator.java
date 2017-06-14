package calculator;

public class Calculator {
	public static int add(int a, int b) {
		System.out.print(a + " + " + b + " = ");
		return a+b;
	}
	
	public static int add(int a, int b, int c) {
		System.out.print(a + " + " + b + " + " + c + " = ");
		return a+b+c;
	}
	
	public static int subs(int a, int b) {
		System.out.print(a + " - " + b + " = ");
		return a-b;
	}
	
	public static int subs(int a, int b, int c) {
		System.out.print(a + " - " + b + " - " + c + " = ");
		return a-b-c;
	}
}
