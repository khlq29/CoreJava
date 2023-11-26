package bank;

public class Account {
	public String name;
	protected String email;
	private String password;
	
	//getters and setters are used to access private class
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String pass){
		this.password = pass;
	}

}
class Bank1  {
	public static void main(String[] args) {
		Account account1 = new Account();
		account1.name = "shabana";
		account1.email = "apna@gmail.com";
		account1.setPassword("abcd");
		System.out.println(account1.getPassword());
		
	}
}