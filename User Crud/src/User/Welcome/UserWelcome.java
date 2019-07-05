package User.Welcome;
import User.Register.UserRegister;

import java.math.BigDecimal;
import java.util.Scanner;

import User.Register.TitleCase;

public class UserWelcome {

	public static void welcome() 
	{
		System.out.println("  \n \n \n \n \n \n \n welcome "+TitleCase.titleCase(UserRegister.name));
		
		changePassword.chPassword();
		updateProfile.updatePhone();
		deleteProfile.delProfile();
		System.out.println(" want to sign up for one more user y/n= ");
		Scanner scanner=new Scanner(System.in);
		String ns=scanner.next();
		if(ns.equals("y")) {
			UserRegister.userDetails();
			
		}
		else
		{
			System.out.println("u exited");
		}

	}
}
