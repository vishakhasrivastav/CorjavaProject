package multithreadingPrograms;
/*
 * When we use synchronization many threads are locked out of the object and they continuously
 * are running to check if the object is available or not. This is called thread polling.
 * Such type of polling causes unnecessary burden on the machine hence we use wait and 
 * notify method so that thread can communicate with each other and polling is avoided.
 * 
 * wait(): it is an Object class method. When wait method is called on any thread then that
 * thread will leave the resource and wait outside the object until it receives the notify
 * method from other thread.
 * 
 * notify(): it is an Object class method. When a thread calls notify method all the threads
 * that were waiting will become active again and will get ready to enter the object.
 * 
 * 
 */
class Warehouse{
	
	int furnitureStock=100;
	
	public synchronized void addFurniture(int add) {
		
		if(furnitureStock>=50) {
			
			try {
				System.out.println("\nManufacturer is waiting.....");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			furnitureStock+=add;
			System.out.println("Manufacturer is adding more furniture.."
					+ "\nCurrent no. of furniture= "+furnitureStock);
			notify();
		}
		
		
	}
	
public synchronized void subFurniture(int sub) {
		
		if(furnitureStock<50) {
			
			try {
				System.out.println("\nBuyer is waiting.....");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			
			if(sub<furnitureStock && furnitureStock>50) {
			furnitureStock-=sub;
			System.out.println("Buyer is buying more furniture.."
					+ "\nCurrent no. of furniture= "+furnitureStock);
			}
							
			notify();
		}
		
		
	}
	
	
}

class Manufacturer extends Thread{
	
	Warehouse w;
	int add;
	public Manufacturer(Warehouse w, int add) {
		super();
		this.w = w;
		this.add = add;
	}
	
	@Override
	public void run() {
		
		while(true) {
			
			w.addFurniture(add);
		}
	}
}

class Buyer extends Thread{
	Warehouse w;
	int sub;
	public Buyer(Warehouse w, int sub) {
		super();
		this.w = w;
		this.sub = sub;
	}
	
	@Override
	public void run() {
		
		while(true) {
			
			w.subFurniture(sub);
		}
	}
}
public class WaitNotifyDemo {

	public static void main(String[] args) {
		Warehouse w=new Warehouse();
		System.out.println("Initial number of funiture: "+w.furnitureStock);
		
		Manufacturer m=new Manufacturer(w, 60);
		Buyer b=new Buyer(w, 60);
		
		m.start();
		b.start();

	}

}
