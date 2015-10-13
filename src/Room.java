
public class Room {
	
	private int xPos, yPos;
	private String name;
	
	public Room(int x, int y, String n) {
		xPos = x;
		yPos = y;
		name = n;
	}
	
	public String toString() {
		//return xPos + " " + yPos + " " + name.toString();
		return name.toString();
	}
	
	public int getX() {
		return xPos;
	}
	
	public void setX(int x) {
		xPos = x;
	}
	
	public int getY() {
		return yPos;
	}
	
	public void setY(int y) {
		yPos = y;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
}
