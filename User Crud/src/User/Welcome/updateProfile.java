package User.Welcome;
import java.math.BigDecimal;
import java.util.Scanner;
import User.login.UserLogin;
import User.Register.UserRegister;
import User.Register.printDetails;
public class updateProfile {
	public static void updatePhone() {
		Scanner scanner=new Scanner(System.in);
		System.out.println(" \n \n \n \n ");
		System.out.println("do u want to update profile (y/n)= ");

		String c1=scanner.next();
		if (c1.equals("y")) {
		System.out.println("write new phone number");
		BigDecimal newPhoneNo=scanner.nextBigDecimal();
		UserRegister.phoneno=newPhoneNo;
		System.out.println(" updated sucellfully ");
		System.out.println("your details are  :");
		System.out.println(printDetails.print());
			
		}
		
}
}
