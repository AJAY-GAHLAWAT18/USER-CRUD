package User.Register;
//import User.Register.incomeFormat;
import User.Welcome.UserWelcome;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;
import User.login.UserLogin;


public class UserRegister {

	 public static String userid;
	 public static String password;
	 public static String name;
	 public static String email;
	 public static String dob;
	 public static BigDecimal phoneno;
	 public static BigDecimal income;
	 
	 
	public static void userDetails() {

		Scanner scanner=new Scanner(System.in);
		System.out.println("enter user id : ");
		 userid=scanner.next();


		System.out.println("enter password : ");
		password=scanner.next();
	
		System.out.println("enter name : ");
		name=scanner.next();
		
		System.out.println("enter email : ");
		 email=scanner.next();
		
		System.out.println("enter phone number : ");
		phoneno=scanner.nextBigDecimal();
		
		System.out.println("enter d.o.b. : ");
		dob=scanner.next();

		System.out.println("enter income : ");
		income=scanner.nextBigDecimal();
		System.out.println(printDetails.print());
		UserLogin.login();	 
	}
		
	
	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		UserRegister.name = name;
	}

	public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		UserRegister.email = email;
	}

	public static String getDob() {
		return dob;
	}

	public static void setDob(String dob) {
		UserRegister.dob = dob;
	}

	public static BigDecimal getPhoneno() {
		return phoneno;
	}

	public static void setPhoneno(BigDecimal phoneno) {
		UserRegister.phoneno = phoneno;
	}

	public static BigDecimal getIncome() {
		return income;
	}

	public static void setIncome(BigDecimal income) {
		UserRegister.income = income;
	}

	
		 public static UserRegister[] userArray = new UserRegister[50];{
			 int inc=0;
		 userArray[inc] = new UserRegister();
		 userArray[inc].userid=userid;
		 userArray[inc].password=password;
		 userArray[inc].name=name;
		 userArray[inc].email=email;
		 userArray[inc].phoneno=phoneno;
		 userArray[inc].dob=dob;
		 userArray[inc].income=income;
		 inc++;
		 }
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userDetails();
		
		//System.out.println(printDetails.print());
	

		 
		 
		 
	} 
		 

}
