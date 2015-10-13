import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.plaf.LayerUI;


public class View extends LayerUI<JComponent>{
	private int xPos, yPos;
	
	public void paintToken(int x, int y, String name, Graphics g) {
		g.setColor(Color.RED);
		g.setFont(new Font(g.getFont().getFontName(), Font.PLAIN, 20)); 
		
		g.drawString(name, xPos, yPos);
		g.drawString(name, xPos, yPos + 30);
		g.drawString(name, xPos, yPos + 60);
	}
	
	public void setToken(Room r) {
		xPos = r.getX();
		yPos = r.getY();
	}
	
	@Override
	public void paint(Graphics g, JComponent c) {
		super.paint(g, c);
		paintToken(xPos, yPos, "James", g);
		//moveToken(xPos, yPos);
		
	}
}
