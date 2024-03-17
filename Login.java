class Login {
	public static void main(String[] args) {

		String id ="admin";
		int password=123;
		
		if(id=="admin")
		 {
			System.out.println("Id is valid");
		
			if(password == 123) 
		{
			System.out.println("Password is valid");
			System.out.println("Logged in successfull");
		}
		else
		{
			System.out.println("Password is invalid");
			System.out.println("Login unsuccessfull");
		}
	}
		else
		{
			System.out.println("Id is invalid");
			System.out.println("Login unsuccessfull");
		}



	









}








}