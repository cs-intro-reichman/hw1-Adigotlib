// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int limit=Integer.parseInt(args[0]); 
		int random1=(int)(Math.random()*limit+1);
		int random2=(int)(Math.random()*limit+1);
		int random3=(int)(Math.random()*limit+1);

		System.out.println(random1 + " " + random2 + " " + random3);

		int min = Math.min(random1,random2);
		int max = Math.max(random1,random2);
		int middle= random3;
		if (min>random3)
		{
			middle=min;
			min=random3;

		}
		if (max<random3)
		{
			middle=max;
			max=random3;
		}

		System.out.println(min + " " + middle + " " + max);

	}
}
