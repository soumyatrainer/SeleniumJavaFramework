package Practice;
import java.util.Scanner;
public class LeapYear {
public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter year : ");
	int n = scan.nextInt();
	if((n%400==0) || (n%4==0 && n%100!=0)) {
		System.out.println("Leap Year");
	}
		else {
			System.out.println("Not a Leap Year");
		}
}
}

