package Excersises;

import java.util.function.BiPredicate;

interface StrChkIntf{
	public boolean chkString(String str);
}
interface StrChkIntf2{
	public boolean chkStrings(String str1, String str2);
}

public class LambdaChkStr {
	static String hardstring = "The Hard String";
	public boolean chkStrHard(String stri) {
		StrChkIntf strinf =( str)->{
				return(str==hardstring);
			};
//		return strinf.chkString(stri);
//		__________________________________
		BiPredicate<String,String> testor=(q,w)->{
			return( q == w ); 
		};
		return testor.test(stri, hardstring);
		
	}
	public boolean chk2Strings(String strone, String strtwo) {
		
		StrChkIntf2 strinf2 = (str1, str2)->{return str1 == str2;};
		
//		return strinf2.chkStrings(strone, strtwo);
//		_________________________________________
		BiPredicate<String,String> testa=(q,w)->{
			return(q==w);
		};
		return testa.test(strone, strtwo);
		
	}

}
