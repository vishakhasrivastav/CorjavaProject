package polymorphism;
/*
 * While overriding a method in child class we can change the access specifier of the 
 * inherited method but only if it increases the accessibility of the overridden method.
 * We cannot make it restrictive in overridden method.
 * 
 * 1) public		-------------------------------
 * 2) protected		------------------------
 * 3) default		-------------
 * 4) private		------
 */
class Animal{
	
	public void moving(String s) {
		System.out.println("Animal is moving...");
	}
	
	protected void eating() {
		System.out.println("Animal is eating....");
	}
	
	void breathing() {
		System.out.println("Animal is breathing...");
	}
	
	private void swimming() {
		
		System.out.println("Animal is swimming....");
	}
}

class Bird extends Animal{
	
	public void moving(String s) {
		System.out.println("Bird is flying....");
	}
	/*
	 * Animal class eating method was protected so we can change it to public
	 * while overriding in Bird class.
	 */
	public void eating() {
		System.out.println("Bird is gathering food in its beak....");
	}
	
	/*
	 * Animal class breathing method was default so while overriding we can increase its
	 * accessibility by making it protected or public.
	 */
	public void breathing() {
		System.out.println("Animal is breathing...");
		swimming();
	}
	
	/*
	 * Animal class swimming method was private so it will never be inherited by Bird class
	 * Since method overriding works on inheritance hence swimming method cannot be overriden
	 * in Bird class.
	 * If we make same method in child class then also it will not be considered as
	 * overridden method; instead it will be considered as Bird class method only.
	 */
	private void swimming() {
		
		System.out.println("Bird is swimming....");
	}
}
public class AccessSpecifierInOverriding {

	public static void main(String[] args) {
		
		Bird b=new Bird();
		//b.swimming();

	}

}
