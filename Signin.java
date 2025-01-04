import java.util.Scanner;
class Signin
{
	String username;
	int  password=0 ;
    String status = "enabled";
	
	Signin(String s,int pass ){
		 username = s;
		 password = pass;
		
	}
	
	void login(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name====");
		String name = sc.next();
		System.out.print("Enter the password====");
		int pass1 = sc.nextInt();
		
		if(username.equals(name) && password==pass1)
		{
			this.status = "enabled";
			System.out.println("Welcome sir");
			
		 display();
			
		}
		else
		{
			this.status = "disabled";
			System.out.print("error");
		}
			
		

		
		
		
	}
	
	 void display(){
				System.out.println("username is -----"+username);
				System.out.println("status  is -----"+status);
				
			}
	
	public static void main(String args[])
	{
		Signin lg = new Signin("RAHUL" , 9422);
		lg.login();
	}
	
}