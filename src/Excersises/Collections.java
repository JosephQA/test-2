package Excersises;

import java.util.ArrayList;
import java.util.List;

public class Collections {
	/**
	 * just makes an array filled with ints 1 to 100
	 * @return int array
	 */
	int[] arrayAdd1to100() {
		int[] arrint = new int[100];
		for(int i = 0; i<100;i++) {
			arrint[i] = i + 1;
		}
		return arrint;
	}
	/**
	 * generates Double list form 100-999
	 * @return filled list
	 */
	List<Double> arrayAdd100to999() {
		List<Double> listint = new ArrayList<Double>();
		for(Double i = 0.0; i<999-100+1;i++) {
			listint.add( i + 100) ;
		}
		return listint;
	}
	
	/**
	 * sysouts list from arrayadd100to999 with each
	 * element * 10
	 */
	void multiply10100999(){
		List<Double> lister = this.arrayAdd100to999();
		lister.forEach(ele -> System.out.println( ele *10));
		//return lister;
	}

}
