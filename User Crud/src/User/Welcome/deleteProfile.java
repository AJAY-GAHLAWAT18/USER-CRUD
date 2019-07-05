package User.Welcome;
import java.math.BigDecimal;
import java.util.Scanner;
import User.login.UserLogin;
import User.Register.UserRegister;
public class deleteProfile {
	public static void delProfile() {
		System.out.println(" \n \n \n  \n ");
		System.out.println("do u want to delete  profile (y/n)= ");
		Scanner scanner=new Scanner(System.in);
		String c2=scanner.next();
		if (c2.equals("y")) {
		System.out.println("your profile is deletd sucessfully");
			
		}
		else
		{
		System.out.println("thank u for visiting ");
		}
	}
}
