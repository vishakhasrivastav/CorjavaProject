package fundamentals;

import java.util.Scanner;

public class SwitchStatement1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any one day of the week: ");
		String day=sc.next();//Wednesday
		
		switch(day) {
		
		case "Monday":System.out.println("How boring!! Weekend is over....");
		
		
		case "Tuesday":System.out.println("Its the second day of working..We can survive!!");
		
		
		case "Wednesday":System.out.println("This is the day and not the character Wednesday from Adam's Family");
		
		
		case "Thursday":System.out.println("Almost there...Keep faith");
		
		
		case "Friday":System.out.println("Thank God It's Friday!!!");
		
		
		case "Saturday":System.out.println("Will sleep all day!!!");
		
		
		case "Sunday":System.out.println("Will party all day!!!");
		
		
		default:System.out.println("Please give one of the day in english week only!!");
		
		}
		
System.out.println();
	}

}
