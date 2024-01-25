package multithreadingPrograms;
/*
 * Synchronization is the process of allowing only one thread to access our resource at a time.
 * This is done with the help of synchronized keyword.
 * As soon as a thread calls a synchronized method a lock is put on our object and no other
 * thread will be able to access our resource.
 * Due to this there is no mismatch in data and one thread is able to do the manipulations
 * properly.
 * Once the thread has finished its task the lock will be released and our resource will
 * be open to other threads.
 */
class Account{
	
	int balance=10000;
	
	synchronized public void widthdraw(int wAmount) {
		
		if(balance<=wAmount) {
			
			System.out.println("\nInsufficient balance!!");
		}
		else {
			
			balance-=wAmount;
			System.out.println(wAmount+" amount widthdrawn successfully!!\nCurrent balance: "+balance);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	synchronized public void deposit(int dAmount) {
		
			balance+=dAmount;
			System.out.println("\n"+dAmount+" amount deposited successfully!!\nCurrent balance: "+balance);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}

class SincereStudent extends Thread{
	
	Account a;
	int dAmount;
	
	public SincereStudent(Account a, int dAmount) {
		super();
		this.a = a;
		this.dAmount = dAmount;
	}
	
	@Override
	public void run() {
		
		a.deposit(dAmount);
	}
}

class LazyStudent extends Thread{
	
	Account a;
	int wAmount;
	
	public LazyStudent(Account a, int wAmount) {
		super();
		this.a = a;
		this.wAmount = wAmount;
	}
	
	@Override
	public void run() {
		
		a.widthdraw(wAmount);
	}
}
public class Synchronization1 {

	public static void main(String[] args) {
		
		Account a=new Account();
		System.out.println("Initial balance: "+a.balance+"\n");
		SincereStudent s=new SincereStudent(a, 7000);
		LazyStudent l=new LazyStudent(a, 7000);
		
		s.start();
		l.start();

	}

}
