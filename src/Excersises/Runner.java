package Excersises;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
	//	runHello();
	//	runCalc();2
	//	runchkStr();
	//	runpriloop();
	//	runcolls();
	//	runstrems();
	//	runHelLambda();
	//	runChkStrLambda();
		runCalcLambda();
		
		 
		
		
		
	
		
		
	}
	
	
	static void runHello() {
		HelloWorld hworld = new HelloWorld();
		hworld.sysOut();
		String hi = hworld.strOut();
		System.out.println(hi);
	}
	static void runCalc() {
		Calculator calc = new Calculator();
		double resu;
		resu = calc.Adder(1,2);
		System.out.println(resu);
		resu = calc.subber(54,23);
		System.out.println(resu);
		resu = calc.multiplier(3, 4);
		System.out.println(resu);
		resu = calc.division(8, 3);
		System.out.println(resu);
		Scanner scan = new Scanner(System.in);
		System.out.println("input a number");
		int a = scan.nextInt();
		System.out.println("input a number");
		int b = scan.nextInt();
		System.out.println("input an operator (+-*/)");
		String op = (scan.next());
		System.out.println(calc.calculate(a, b, op));
		scan.close();
	}
	static void runchkStr() {
		CheckString strChk = new CheckString();
		//boolean bool;
		String string1 = "This is my check";
		String string2 = "This is my check";
		String string3 = "garbage time";
		System.out.println(strChk.matches(string1)); //true
		System.out.println(strChk.matches(string1, string2)); //true
		System.out.println(strChk.matches(string1, string3));//false
	}
	static void runpriloop() {
		PrintLoops priLoo = new PrintLoops();
		priLoo.print1to10();
		priLoo.print100to999();
		priLoo.printVarArr(12, 19);
	}
	static void runcolls() {		
		Collections coller = new Collections();
		System.out.print(Arrays.toString(coller.arrayAdd1to100()));
		(coller.arrayAdd100to999()).forEach(System.out::println);
		coller.multiply10100999();//.forEach(System.out::println);
	}
	static void runstrems() {
		collectionStreams collS = new collectionStreams();
		collS.stream1to100().forEach(System.out::println);
		collS.stream100to999().forEach(System.out::println);
		collS.stremby10();
	}
	static void runHelLambda() {
		LamdbaHello lH = new LamdbaHello();
		System.out.println(lH.sayHi());
	}
	static void runChkStrLambda() {
		LambdaChkStr  chkstring = new LambdaChkStr();
		System.out.println(chkstring.chkStrHard("is this it?")); //flase
		System.out.println(chkstring.chkStrHard("The Hard String")); //true
		System.out.println(chkstring.chk2Strings("one","two")); //false 
		System.out.println(chkstring.chk2Strings("one","one")); //true
	}
	static void runCalcLambda() {
		LambdaCalculator calc = new LambdaCalculator();
		System.out.println(calc.promptcalc());
	}

}
