package User.Register;

import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;


public class DateFormat {
	static public String date(String dob) {
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		String datef=df.format(UserRegister.dob);
		return datef;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	}

}
