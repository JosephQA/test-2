package Excersises;



public class Calculator {
	/**
	adds two numbers
	@param int1 any interger to add to int2
	@param int2 any ineger to add to int1
	@return sum of two imputs as a double
	*/
	double Adder(int int1, int int2) {
		return ( int1+int2 );
		}
	/**
	multiplys two numbers
	@param int1 any interger to multiply with int2
	@param int2 any integer to multiply with int1
	@return multiplaction of two imputs as a double
	*/
	double multiplier(int int1,int  int2) {
		return(int1*int2);
		}
	/**divides two numbers
	@param a any interger to divide by b
	@param b any integer to divide a by
	@return division of two imputs as a double
	*/
	double division(int a, int b) {
		return(a/b);
		}
	/**subtract a number from another number
	@param a any interger
	@param b any integer to take from a
	@return result of two imputs as a double
	*/
	double subber(int a, int b) {
		return(a-b);
		}
	/**
	 * add subtract multiply or divide based on operator input
	 * @param a any int
	 * @param b any int
	 * @param op any valid string input ( + - * ((slash)))
	 * @return double value of calculation
	 */
	double calculate( int a, int b, String op) {
		switch(op) {
			case("-"):
				return subber(a,b);
				
			case("+"):
				return Adder(a, b);
			
			case("*"):
				return multiplier(a, b);
				
			case("/"):
				return subber(a, b);
				
			default: 
				System.out.println("valid entries are: + - * /");
				return 0;  
		}
		}
	}
	
	

