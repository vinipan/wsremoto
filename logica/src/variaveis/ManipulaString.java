package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		String email = "teste@chuletinhagostosa.com";
		email = email.toUpperCase();
		System.out.println(email);
		int numero = 12345;
		System.out.println(email.contains("@"));
		System.out.println("@ na posi��o: " + email.indexOf(".com"));
		if (email.contains("@")==true) 
		{
			System.out.println(email.substring(0,email.indexOf("@")));
			System.out.println(email.substring(email.indexOf("@") + 1));
		} else {}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
