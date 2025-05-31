public class bankApp {

	private String name;
	private String password;
	private Int accountNumber;
	private double balance;

	public bankApp (String name, String password, int accountNumber, double balance){
		this.name = name;
		this.password = password;
		this.accountNumber = accountNumber;
		this.balance = balance;
}
	public void deposit_money(double amount){
	if (amount > 0)balance += amount;
}
	public void withdraw_money(double amount){
	if(amount > 0) balance -= amount;
}
	public double getBalance(){
	return balance;
}
	public void transfer_money(double amount){
	if(amount <= balance && amount > 0) balance -= amount;
}







}