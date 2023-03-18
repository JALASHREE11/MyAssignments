package week3.day1;

public class AxisBank extends BankInfo { 
	public void deposit() 
	{
		System.out.println("Deposit:100%");
	}
public static void main(String[] args) {
	AxisBank bank=new AxisBank(); 
	bank.deposit();  
	bank.fixed();
	bank.saving();
	BankInfo b=new BankInfo(); 
	b.deposit();
	
}

}
