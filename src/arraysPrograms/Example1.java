package arraysPrograms;
/*
 *Array is an object used to store a group of data of the same type. 
 *
 *1) Size of an array is fixed. We cannot add more than the given size of the array.
 *2) All members of the array should be of the same type. 
 *3) We can know the size of the array by using its length.
 *4) Arrays can be of two dimensional or more also
 */
public class Example1 {

	public static void main(String[] args) {
		
		int a=10;
		
		int [] rollNums=new int[5];
		rollNums[0]=100;
		rollNums[1]=8;
		rollNums[2]=40;
		rollNums[3]=7;
		rollNums[4]=81;
		
		
		System.out.println("Fetching single data from array: ");
		System.out.println(rollNums[3]);
		
		System.out.println("\nFetching all members by for loop:");
		for(int i=0; i<rollNums.length; i++) {
			
			System.out.println(rollNums[i]);
		}
		
		/*
		 * There are two more ways of creating array objects as seen below:-v
		 */
		char [] symbols= {'@', '&', '#'};
		int [] arr= new int[]{6, 2, 9, 12};
	}

}
