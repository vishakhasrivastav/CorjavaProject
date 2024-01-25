package multithreadingPrograms;
/*
 * When we implement Runnable interface then we will inherit only the run method.
 * Since start method is a Thread class method our class will not inherit this method.
 * So we make Thread class object and pass our class reference in its constructor
 * Hence the start method of Thread class will call the run method of our class.
 * 
 * While making thread it is said that implementing Runnable interface is much
 * better than extending thread class
 * Reasons:-
 * 1) We do not make our class unnecessarily bulky when we implement Runnable
 * 2) Since multiple inheritance is not allowed in java in case we extend Thread
 * class then we will not be able to extend any other class. Hence implementing
 * Runnable would be better.
 */
class RDemo1 extends Person implements Runnable{

	@Override
	public void run() {
		
		for(int i=1; i<=10; i++) {
			
			System.out.println("My thread1 i= "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	}

class RDemo2 implements Runnable{

	@Override
	public void run() {
		
		for(int i=100; i<=110; i++) {
			
			System.out.println("My thread2 i= "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	}
public class RunnableDemo1 {

	public static void main(String[] args) {
		
	
		RDemo1 r1=new RDemo1();
		RDemo2 r2=new RDemo2();
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
	}

}
