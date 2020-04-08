package Excersises;
 interface HelloIntf{
	public String hello();
}

public class LamdbaHello {
	/**
	 * uses the functional interface HelloIntf with a lambda expression generate a string 
	 * @return string "hi there planet" hardcoded at development time
	 */
	public String sayHi() {
		HelloIntf howdy = ()->{return "hi there planet";};
		return howdy.hello();
	}

}
