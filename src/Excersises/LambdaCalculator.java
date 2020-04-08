package Excersises;

import java.util.Scanner;
import java.util.function.BiFunction;

interface basicMathIntf{
	public int maththese(int a, int b);
}

public class LambdaCalculator {
	int add(int a, int b) {
		BiFunction<Integer, Integer, Integer> funcky = (aa,bb)->{
			Integer cc = aa+bb;
			return cc;
		};
		return funcky.apply(a,b);
	}
	int sub(int a, int b) {
		BiFunction<Integer, Integer, Integer> funcky = (aa,bb)->{
			Integer cc = aa-bb;
			return cc;
		};
		return funcky.apply(a,b);
	}
	int mul(int a, int b) {
		BiFunction<Integer, Integer, Integer> funcky = (aa,bb)->{
			Integer cc = aa*bb;
			return cc;
		};
		return funcky.apply(a,b);
	}
	int div(int a, int b) {
		BiFunction<Integer, Integer, Integer> funcky = (aa,bb)->{
			Integer cc = aa/bb;
			return cc;
		};
		return funcky.apply(a,b);
	}
	int promptcalc() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number 1 of 2");
		int A = scan.nextInt();
		System.out.println("enter number 2 of 2");
		int B = scan.nextInt();
		scan.nextLine();
		System.out.println("enter operator (+,-,*,/");
		String op = scan.nextLine();
		switch(op) {
		case("+"):
			return this.add(A, B);
		case("-"):
			return this.sub(A,B);
		case("*"):
			return this.mul(A, B);
		case("/"):
			return this.div(A, B);
		default:
			System.out.println("operator not valid: aborting \n returning 0");
			return 0;
		}
	}
}
