package polymorphism;

class Food{
	
	private Integer foodId;
	private String foodName;
	private Double price;
	
	public Food(Integer foodId, String foodName, Double price) {
		
		this.foodId = foodId;
		this.foodName = foodName;
		this.price = price;
	}

	public Integer getFoodId() {
		return foodId;
	}

	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "[Name: "+foodName+" Id: "+foodId+" Price:"+price+"]";
	}
}
public class ToStringDemo {

	public static void main(String[] args) {
		/*
		 * toString method is the String representation of our object.
		 * We override toString in our class so that when we print the reference variable
		 * of our class we do not see the hashcod, but we see the values stored in the
		 * instance variables
		 */
		Food f1=new Food(100, "Kadhi Chawal", 250.0);
		System.out.println(f1);

	}

}
