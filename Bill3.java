public class Bill3 {
	public static void main(String[] args)
	 {
		String name1 = args[0];
		String name2 = args [1];
		String name3 = args [2];
		
		double bill = Double.parseDouble(args[3]);
		double eachone= bill/3 ;
		double eachOnePay = Math.ceil(eachone);

		System.out.println("Dear " + name3 + ", " + name2 + "qnd "+ name1 + ":" + " pay " + eachOnePay + " Shekels each ");
	}
}  
