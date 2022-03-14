package chap06.book.exercise.p19;

public class Account {
	private int balance;
	public final static int MIN_BALANCE = 0;
	public final static int MAX_BALANCE = 1000000;
	
	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}
	public int getBalance() {
		return balance;
	}
}
