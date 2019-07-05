package User.Register;


public class TitleCase 
{

	private TitleCase()
	{
	}
	public  static String titleCase(String str) {
		String fullName="";
		if(str!=null && str.trim().length()>0) 
		{
			String strArr[]=str.split(" ");
			for(String st:strArr) {
				char ch=st.charAt(0);
				String ch2=String.valueOf(ch);
				ch2=ch2.toUpperCase();
				String ch3=st.substring(1);
				ch3=ch3.toLowerCase();
				fullName += ch2+ch3+" ";
			}
		}
		return fullName;
	}
}
