package Class_07;

class Customer{
	
	int amount = 10000;
	
	public synchronized void withdraw(int amount) {
		System.out.println("User has come to withdraw amount " + amount);
		
		if(this.amount < amount) {
			System.out.println("Less Balance, waiting to deposite....");
			notify();
			try {
				wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount -= amount;
		System.out.println("Withdraw CXompleted");
	}
		public synchronized void deposit(int amount) {
			System.out.println("User has come to deposite");
			this.amount += amount;
			System.out.println("Deposit complete for amount " + amount);
			notify();
		}
	}
public class BankingApplication {

	public static void main(String[] args) {
		final Customer c1 = new Customer();
		new Thread() {
			public void run() {
				c1.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c1.deposit(10000);
			}
		}.start();
	}
}
