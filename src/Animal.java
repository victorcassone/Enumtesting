
public class Animal implements Life{
	
	private String favFood;
	private boolean isAlive;
	
	protected String getFavFood(){
		return favFood;
		
	}
	
	public Animal(String ff){
		this.favFood = ff;
		this.isAlive = true;
	}

	public Animal() {
	}

	@Override
	public void move() {
		System.out.printf("I moved");
		
	}

	@Override
	public void eat() {
		System.out.printf("I eat");
		
	}

	@Override
	public void sleep() {
		System.out.printf("I sleep");
		
	}
	
}

//When to use polymorphismism? Use it when something is has the same functionalities as something else but can be modiied if need be.
