import java.util.Scanner;
public class SignUp
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to this sick website! What do you want your username to be? \nEnter below:");
		String username = scan.nextLine();
		
		if (username.equals("admin") || username.equals("person") || username.equals("jimbob234") || username.equals("skater_gurl17") || username.equals("gary")){
			System.out.println("You fool. This username is already taken.");
		} else {
			scan = new Scanner(System.in);
			System.out.println("Epic bro. Now its time to make a password. Remember it must:\nStart with a vowel\nContain #, !, $, &, or, *\nNot contain the username anywhere in the password\nContain numbers only in the last two digits\nNow please enter your password below.");
			String initialpassword = scan.nextLine();

			char[] password = initialpassword.toCharArray();
			boolean itworks = true;

			if (password[0] == 'a' || password[0] == 'e' || password[0] == 'i' || password[0] == 'o' || password[0] == 'u'){
				itworks = true;
			} else {
				System.out.println("Remember it has to start with a vowel BUDDY.");
				itworks = false;
			}

			if (initialpassword.contains("!") || initialpassword.contains("#") || initialpassword.contains("$") || initialpassword.contains("&") || initialpassword.contains("*")){
				itworks = true;
			} else {
				System.out.println("Bro it has to have #, !, $, &, or, *");
				itworks = false;
				}

			if (initialpassword.contains(username)){
				itworks = false;
				System.out.println("These directions are not hard. It clearly states you cannot have your username ANYWHERE in the password you absolute dingus. (Sorry for the sass, but this project is very stressful to code.");
			} else{
				itworks = true;
			}

			int length = initialpassword.length();
			String passwordminustwo = initialpassword.substring(0, length - 2);

			if (passwordminustwo.indexOf('1') == -1 && passwordminustwo.indexOf('2') == -1 && passwordminustwo.indexOf('3') == -1 && passwordminustwo.indexOf('4') == -1 && passwordminustwo.indexOf('5') == -1 && passwordminustwo.indexOf('6') == -1 && passwordminustwo.indexOf('7') == -1 && passwordminustwo.indexOf('8') == -1 && passwordminustwo.indexOf('9') == -1 && passwordminustwo.indexOf('0') == -1){
				itworks = true;
			} else {
				itworks = false;
				System.out.println("You moron idiot dummy head. I said only use numbers in the last two digits of the passcode.");
			}

			if (itworks == true) {
				System.out.println("It works! Well done and welcome to the cult!");
			} else {
				System.out.println("Try again brother.");
			}
		}
	}
}