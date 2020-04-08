package Excersises;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class collectionStreams {
	Collections coll;
	public collectionStreams() {
		// TODO Auto-generated constructor stub
	 coll = new Collections();
	}
	/**
	 * converts previously made aaray of 1-100 to stream
	 * @return stream(int) of 1 - 100
	 */
	IntStream stream1to100(){
		IntStream  streamint= Arrays.stream(coll.arrayAdd1to100());
		
		return streamint;
	}
	/**
	 * converts previous made list(double) to stream
	 * @return stream of 100-999
	 */
	Stream<Double> stream100to999(){
		Stream<Double> dobstrem = coll.arrayAdd100to999().stream();
		
		return dobstrem;
	}
	/**
	 * converts previous made list of 100-999 to stream
	 * prints each element * 10 
	 */
	void stremby10(){
		Stream<Double>exstrem = coll.arrayAdd100to999().stream();
		exstrem.forEach(ele-> System.out.println(ele*10));
	}

}
