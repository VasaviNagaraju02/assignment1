package assignment1;
class Bank{
	int getBalance() {
		return 0;
	}
	}
	class BankA extends Bank{
		int getBalance(int balance) {
			return balance;
		}}
	class BankB extends Bank{
		int getBalance(int balance) {
			return balance;
		
		}}
		class BankC extends Bank{
			int getBalance(int balance) {
				return balance;
			}
		
		}	


public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankA a=new BankA();
BankB b=new BankB();
BankC c= new BankC();
System.out.println("$"+a.getBalance(1000));
System.out.println("$"+b.getBalance(1000));
System.out.println("$"+c.getBalance(1000));

	}
}
		
