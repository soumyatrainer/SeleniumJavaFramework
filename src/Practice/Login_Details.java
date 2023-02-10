package Practice;
import java.util.Scanner;
public class Login_Details {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter user name:");
		String user = scan.next();
		System.out.println("Enter pasword:");
		int pwd = scan.nextInt();
		if(user.equals("Chintu")&& pwd==1234) {
			System.out.println("Login successful");
		}
			else {
				System.out.println("Error : Invalid login");
			
		}
			
	}

}

