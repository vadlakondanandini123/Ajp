package Box;

public class Box {
	public int length;
	private int breadth;
	protected int height;
	int weight;
	
	public int volume() {
		return length*breadth*height;
		
	}

	public static void main(String[] args) {
		Box box=new Box();
		box.length=200;
		box.breadth=50;
		box.height=70;
		System.out.println("volume="+box.volume());
		// TODO Auto-generated method stub

	}

}
