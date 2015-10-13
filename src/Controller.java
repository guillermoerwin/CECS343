import java.util.ArrayList;
import javax.swing.JFrame;

public class Controller {
	
	public static void main(String[] args) {	
		BoardFrame board = new BoardFrame();
		board.setVisible(false);
		board.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Quit when exited
		board.setExtendedState(JFrame.MAXIMIZED_BOTH); // Full screen
		board.pack(); // Contents fill desired size.
	    board.setVisible(true);
	    
	    ArrayList<Room> rooms = new ArrayList<Room>();
	    rooms.add(new Room(30, 40, "George Allen Field"));
	    rooms.add(new Room(433, 20, "Japanese Garden"));
	    rooms.add(new Room(922, 30, "Student Parking"));
	    rooms.add(new Room(434, 275, "The Pyramid"));
	    rooms.add(new Room(21, 670, "West Walkway"));
	    rooms.add(new Room(438, 540, "REC Center"));
	    rooms.add(new Room(1025, 524, "Forbidden Parking"));
	    rooms.add(new Room(30, 1659, "Library"));
	    rooms.add(new Room(475, 1659, "LA 5"));
	    rooms.add(new Room(1025, 1659, "Bratwurst Hall"));
	    rooms.add(new Room(1464, 944, "East Walkway"));
	    rooms.add(new Room(171, 882, "Computer Lab"));
	    rooms.add(new Room(176, 1149, "North Hallway"));
	    rooms.add(new Room(189, 1347, "Room of Retirement"));
	    rooms.add(new Room(604, 882, "ECS 302"));
	    rooms.add(new Room(827, 1156, "South Hall"));
	    rooms.add(new Room(607, 1346, "Elevators"));	
	    rooms.add(new Room(826, 1346, "ECS 308"));
	    rooms.add(new Room(1037, 897, "Eat Club"));
	    rooms.add(new Room(1247, 881, "CECS Conference Room"));
	    rooms.add(new Room(1216, 1349, "Lactation Club"));
	    
	    //System.out.println(rooms.get(10).toString());
	    //board.paintAll(null);
	    
	    Player player1 = new Human("Player1", rooms.get(17), 3, 3, 3, 3, 3, "Freshman");
	    Player player2 = new AI("Player2", rooms.get(17), 3, 3, 3, 3, 3, "Freshman");
	    Player player3 = new AI("Player3", rooms.get(17), 3, 3, 3, 3, 3, "Freshman");
	    
	    System.out.println(player3.getPlayerLocation());
	    
	    if (player3.getPlayerLocation().equals(rooms.get(17))) {
	    	System.out.println("Move to room:");
	    	System.out.println(rooms.get(15));
	    	
	    }
	    
	}
	
}
