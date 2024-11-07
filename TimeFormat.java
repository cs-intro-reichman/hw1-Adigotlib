// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		if (hours>12)
		{
			hours=hours-12;
			if (hours<10)
			{
				System.out.println("0"+hours + ":" + minutes + " PM");

			}
			else
			{
			System.out.println(+hours + ":" + minutes + " PM");
			}
		}
		else
		{
			if (hours<10)
			{
				System.out.println("0"+ hours + ":" + minutes + " AM");	
			}
			System.out.println(hours + ":" + minutes + " AM");

		}
	}
}