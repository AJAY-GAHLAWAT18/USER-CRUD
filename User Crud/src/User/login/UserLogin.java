package User.login;

import java.util.Scanner;

import User.Register.UserRegister;
import User.Welcome.UserWelcome;

public class UserLogin {
	public static void login(){
	 System.out.println("\n \n \n \n \n \n \n  enter user id to login = ");
		Scanner scanner=new Scanner(System.in);

	 String UseridEntered=scanner.next();
	 System.out.println(" enter password ");
	 String passwordEntered=scanner.next();
	 //System.out.println(userid);
	 //System.out.println(password);
	 //System.out.println(UseridEntered);
	 //System.out.println(passwordEntered);
	 if(UserRegister.userid.equals(UseridEntered) && UserRegister.password.equals(passwordEntered )){
		 System.out.println("you login sucessfully");
		 UserWelcome.welcome();
		 
	 }
	 else 
	 {
		 System.out.println("invalid login");
	 }
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


}
}