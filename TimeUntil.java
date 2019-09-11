import java.util.Scanner;
import java.time.LocalDateTime;
public class TimeUntil
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the hour beta:");
		int hour = scan.nextInt();
		int converthour = hour * 60 * 60;

		scan = new Scanner(System.in);
		System.out.println("Input the minutes beta:");
		int minutes = scan.nextInt();
		int convertminutes = minutes * 60;

		scan = new Scanner(System.in);
		System.out.println("Input the seconds beta:");
		int seconds = scan.nextInt();

		int totalseconds = converthour + convertminutes + seconds;

		int nowhour = LocalDateTime.now().getHour();
		int nowminutes = LocalDateTime.now().getMinute();
		int nowseconds = LocalDateTime.now().getSecond();
		int totalnowseconds = nowhour * 60 * 60 + nowminutes * 60 + seconds;

		int houruntil = totalseconds / 3600 - nowhour;
		int minutesuntil = (totalseconds - converthour) / 60 - nowminutes;
		int secondsuntil = (totalseconds - converthour - convertminutes) - nowseconds;

		if (nowhour > hour)
		System.out.println("there are " + houruntil + " hours, " + minutesuntil + " minutes, and " + secondsuntil + " seconds until that time.");

		// if (hour > nowhour){
		// 	System.out.println(totalseconds / 3600 - nowhour + " hours until that time");
		// 	if (minutes > nowminutes){
		// 	System.out.println((totalseconds - converthour) / 60 - nowminutes + " minutes until that time");
		// 	}
		// 	if (seconds > nowseconds){
		// 	System.out.println((totalseconds - converthour - convertminutes) - nowseconds + " seconds until that time");
		// 	}
		// } else{

		// }

		// if (minutes > nowminutes){
		// 	System.out.println(minutes - nowminutes + " minutes until that time");
		// } else{

		// }

		// if (seconds > nowseconds){
		// 	System.out.println(seconds - nowseconds + " seconds until that time");
		// } else{

		// }
	}
}