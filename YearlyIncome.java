import java.util.Scanner;
public class YearlyIncome{
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your yearly income in dollars?");
		double pay = scan.nextInt();
		double taxpay = 0;

		if (pay <= 15000){
			System.out.println("You paid $0 which is 0% of " + pay);
		}else if (pay <= 35000){
			taxpay = (pay - 15000) * 0.1;
			double percent = taxpay / pay * 100;
			System.out.println("You paid " + taxpay + " which is " + percent + " percent of " + pay);
		}else if (pay <= 65000){
			taxpay = (pay - 35000) * 0.16 + 20000 * 0.1;
			double percent = taxpay / pay * 100;
			System.out.println("You paid " + taxpay + " which is " + percent + " percent of " + pay);
		}else if (pay <= 105000){
			taxpay = (pay - 65000) * 0.19 + 30000 * 0.16 + 20000 * 0.1;
			double percent = taxpay / pay * 100;
			System.out.println("You paid " + taxpay + " which is " + percent + " percent of " + pay);
		}else {
			taxpay = (pay - 105000) * 0.22 + 40000 * 0.19 + 30000 * 0.16 + 20000 * 0.1;
			double percent = taxpay / pay * 100;
			System.out.println("You paid " + taxpay + " which is " + percent + " percent of " + pay);
		} 
	}
}