import java.util.Scanner;
class Signin
{
	String username ="";
	int  password=0 ;
	static String status = "enabled";
	
	Login(String s,int pass ){
		this String username= "s";
		this password = pass;
		
	}
	
	void login(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name====");
		String name = sc.next();
		System.out.print("Enter the password====");
		int pass1 = sc.nextInt();
		
		if(username.equals(name) && password==pass1)
		{
			System.out.print("Welcome sir");
			
		}
		else
		{
			System.out.print("error");
		}
			
		

		
		
		
	}
	
	public Static void main(String args[])
	{
		Signin lg = new Signin("RAHUL" , 9422);
		lg.login();
	}
	
}