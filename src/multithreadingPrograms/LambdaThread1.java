package multithreadingPrograms;

public class LambdaThread1  {

	public static void main(String[] args) {
		
		Runnable r1=()->{
			
			for(int i=0; i<10; i++) {
				System.out.println("Lambda Thread1: "+i);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
Runnable r2=()->{
			
			for(int i=100; i<110; i++) {
				System.out.println("Lambda Thread2: "+i);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
	}

	

	
}
