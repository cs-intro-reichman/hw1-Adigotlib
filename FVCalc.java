// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
	 int currentValue= Integer.parseInt(args[0]); 
	 double interstRate= Double.parseDouble(args[1]);
	 int NumOFYears= Integer.parseInt(args[2]); 
	 
	
	 double precent=interstRate/100;
	 double FutureValue=currentValue*Math.pow((1+precent), NumOFYears);
	 System.out.println("After " + NumOFYears + " years, a $" + currentValue + " saved at " + interstRate + "% will yield $" + (int) FutureValue  );

		}
} 
