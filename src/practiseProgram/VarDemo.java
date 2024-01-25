package practiseProgram;
/*
 * var was introduced in jdk10
 * It can only be used in local scope.
 * We cannot make it instance.
 */
public class VarDemo {

	public int display(String i, String j) {
		var a=10;
		var b=20;
		var c=a+b;
		
		return 80;
	}
	
	public static void main(String[] args) {

		var name="Sujina";
		var grade='A';
		var marks=89.63;
		var institute="Anudip";

	}

}
