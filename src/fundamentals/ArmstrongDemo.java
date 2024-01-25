package fundamentals;

public class ArmstrongDemo {

	public static void main(String[] args) {
		/*
		 * digits=4
		 * (8*8*8*8)+(2*2*2*2)+(0*0*0*0)+(8*8*8*8)
		 * 4096+16+0+4096
		 * 8208
		 * 
		 * digits=3
		 * (4*4*4)+(0*0*0)+(7*7*7)
		 * 64+0+343
		 * 407
		 */
		int num=1234;
		int temp=num;
		
		int count=0;
		while(temp>0) {
			
			temp/=10;
			count++;
		}
		System.out.println("Count= "+count);
		temp=num;
		
		int total=0;
		
		for(int j=1; j<=count; j++) {
			int mul=1;
			
		for(int i=1; i<=count; i++) {
			
			int rem=temp%10;
			mul*=rem;
			
		}
		total+=mul;
		temp/=10;
		
		}
		if(num==total)
			System.out.println(num+" is armstrong");
		else
			System.out.println(num+"is not armstrong");
	}

}
