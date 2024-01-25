package classAndObject;

public class Trainer {
	
	int trainerId;
	String trainerName;
	String trainerBranch;
	
	public Trainer() {
		System.out.println("This is empty constructor...");
	}
	
	public Trainer(int i, String s) {
		
		trainerId=i;
		trainerName=s;
	}
	
	
	public Trainer(int trainerId, String trainerName, String trainerBranch) {
		
		this.trainerId=trainerId;
		this.trainerName=trainerName;
		this.trainerBranch=trainerBranch;
	}

	public void show(String s) {
		
		System.out.println("s= "+s);
	}
	public void display() {
		
		System.out.println("Id: "+trainerId);
		System.out.println("Name: "+trainerName);
		System.out.println("Branch: "+trainerBranch);
	}

}
