package User.Register;
import User.Welcome.UserWelcome;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import User.login.UserLogin;
public class printDetails {
	public  static String print() {
		
		return 
		"  \n \n \n \n  Congrats user Registered sucessfully"+
				"\n user id    = "+UserRegister.userid+
				"\n password is  = ********"+
				"\n name       = "+TitleCase.titleCase(UserRegister.userArray[0].getName())+
				"\n email is   = "+UserRegister.userArray[0].getEmail()+
				"\n dateOfBirth = "+UserRegister.userArray[0].getDob()+
				"\n phone no. = "+UserRegister.userArray[0].phoneno+
				"\n income    = "+incomeFormat.currencyFormat(UserRegister.userArray[0].getIncome());
	}
	
}
