package Practice;
import java.util.Scanner;
public class Sum_Of_Natural_Number {
public static void main(String args[]) {
	int n ;
	Scanner scan = new Scanner (System.in);
		System.out.println("Enter n value:");
		n = scan.nextInt();
			int sum=n*(n+1)/2;
			System.out.println("sum of first" +n+"numbers :"+ sum);

			
}
}
