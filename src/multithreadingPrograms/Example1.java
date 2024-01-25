package multithreadingPrograms;
/*
 * Multithreading is a type of multitasking.
 * In multithreading we can execute two or more threads simultaneously.
 * Thread is the smallest unit of code that can be run separately.
 * 
 * To make a thread we can use Runnable interface or Thread class.
 * Runnable interface: It is a functional interface and it has only one abstract method
 * 						i.e. public void run(){} method
 * 
 * Thread class: Thread class implements Runnable interface, hence run method is inherited
 * by Thread class from Runnable interface. Apart from this Thread class has many other
 * predefined methods such as start(), setPriority(), getPriority() etc
 */
class Animation{
	
	public void visuals() {
		for(int i=1; i<=10; i++) {
			
			System.out.println("The boy is singing......");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void music() {
		for(int i=1; i<=10; i++) {
			
			System.out.println("The music is playing in the background......");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThread1 extends Thread{
	
	@Override
	public void run() {
		Animation a=new Animation();
		a.visuals();
	}
}

class MyThread2 extends Thread{
	
	@Override
	public void run() {
		Animation a=new Animation();
		a.music();
	}
}

public class Example1 {

	public static void main(String[] args) {
		
		MyThread1 t1=new MyThread1();
		MyThread2 t2=new MyThread2();
		
		t1.start();
		t2.start();
	}

}
