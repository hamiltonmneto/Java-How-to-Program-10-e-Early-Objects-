public class Account02{

	private String name;
	private double balance;

	public Account02(String name, double balance){
		this.name = name;

		if(balance > 0.0){
			this.balance = balance;
		}
	}
	
	public void withdraw(double withdrawAmount){
		this.balance -= withdrawAmount;
	}

	public void deposit(double depositAmount){
		this.balance += depositAmount;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

	public double getBalance(){
		return this.balance;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
}