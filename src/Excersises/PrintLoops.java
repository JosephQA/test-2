package Excersises;

public class PrintLoops {

	void print1to10() {
		int i = 0;
		int[] intarr= loopbynum(1,10);
		while( i<10) {
			System.out.println(intarr[i]);
			i++;
		}
	}
	void print100to999() {
		int i = 0;
		int[] intarr = loopbynum(100,999);
		while(i<intarr.length) {
		System.out.println(intarr[i]);
		i++;}
	}
	void printVarArr(int start, int end) {
		int[] intarr= loopbynum(start, end);
		int i = 0;
		while(i<intarr.length) {
			System.out.println(intarr[i]);
			i++;
		}
	}
	//void printStr1to10() {
		//int i = 0;
		//int[] intarr = loopbynum(100,999);
		//while(i<intarr.length)
		//System.out.println("number :"+intarr[i]);
		//i++;
	//}
	
	int[] loopbynum(int start, int end) {
		int[] retArr = new int[(end - start + 1)];
		for(int i = start; i<=end; i++) {
			retArr[i-start]= i;
		}
		return retArr;
	}
	
}
