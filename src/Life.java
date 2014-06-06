
public interface Life {

	public void move();
	public void eat();
	public void sleep();
}

//When to use interface? When you want to provide a shell for a class to perform... Required fields or methods that
//will be different for each instance.