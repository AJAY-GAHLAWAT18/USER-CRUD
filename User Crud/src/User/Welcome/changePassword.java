package User.Welcome;
import User.login.UserLogin;

import java.util.Scanner;

import User.Register.UserRegister;
public class changePassword {
	public static void chPassword() {
		System.out.println(" \n  \n \n ");
		System.out.println("do u want to change password (y/n)= ");
		Scanner scanner=new Scanner(System.in);
		String c=scanner.next();
		if (c.equals("y")) {
			System.out.println("enter new password ");
			String newPassword=scanner.next();
			System.out.println("re conifrm password ");
			String reconfirmPassword=scanner.next();
			if(newPassword.contentEquals(reconfirmPassword)) {
				System.out.println("password updated successfully");
				UserRegister.password=newPassword;
			}
			else
			{
				System.out.println("mis match password");
			}
		}
	}

}
