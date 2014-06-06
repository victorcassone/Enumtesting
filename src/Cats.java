
public class Cats extends Animal{

	String favFood1;
	String favFood2;
	String favToy;
	
	public Cats(String ff, String ff2, String ft) {
		super(ff);
		this.favFood1 = ff;
		this.favFood2 = ff2;
		this.favToy = ft;
	}

	public Cats() {
	}

	public String getFavFood(){
		return favFood1 + " and " + favFood2;
	}
	
	public String getFavToy(){
		return favToy;
	}
	
	@Override
	public void move(){
		System.out.printf("I dont move");
	}
}
