// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int Number=Integer.parseInt(args[0]); 
		int ones=Number%10;
		int tens= (Number%100)/10;
		int hundreds= Number/100;

		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}

