import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayer;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.plaf.LayerUI;

public class BoardFrame extends JFrame implements ActionListener, KeyListener, MouseListener, MouseMotionListener, Runnable  {
	private JPanel bottomPanel, buttonsPanel;
	private JSplitPane divider = new JSplitPane(); 
	private int x, y;
	private ScrollablePicture picture;
	
	private Graphics graph;
	
	public BoardFrame() {
		// Get size of screen for splitpane
		Toolkit tk = Toolkit.getDefaultToolkit();
		int screenHeight = tk.getScreenSize().height;
		
		//Create a new thread.
		Thread t = new Thread(this);
		
		// Adds image into ScrollablePicture class.
		picture = new ScrollablePicture(new ImageIcon("CSULBMap3.png"), 1);
		JScrollPane pictureScrollPane = new JScrollPane(picture);
		
		// Bottom panel for vewing buttons, current card face, and points
		bottomPanel = new JPanel();
		bottomPanel.setLayout(new FlowLayout(5));
		bottomPanel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		
		// Buttons to add to button panel
		buttonsPanel = new JPanel(new GridLayout(4,1));
		JButton drawCardButton = new JButton("Draw Card");
		JButton moveButton = new JButton("Move");
		JButton playCardButton = new JButton("Play Card");
		JList locations = new JList();
		buttonsPanel.add(drawCardButton);
		buttonsPanel.add(moveButton);
		buttonsPanel.add(playCardButton);
		buttonsPanel.add(locations);
		
		// Add buttons panel, card panel, and point panel to bottom panel.
		bottomPanel.add(buttonsPanel);
		
		//Add scrollable to a layered component.
		LayerUI<JScrollPane> layerUI = new LayerUI<JScrollPane>();
		JLayer<JScrollPane> jlayer = new JLayer<JScrollPane>(pictureScrollPane, layerUI);
		
		
		// Splitpane to combine both top and bottom panel.
		//divider = new JSplitPane(JSplitPane.VERTICAL_SPLIT, pictureScrollPane, bottomPanel);
		divider = new JSplitPane(JSplitPane.VERTICAL_SPLIT, jlayer, bottomPanel);
		
		// Sets the divider to one third of the full screen
		divider.setDividerLocation(screenHeight - (screenHeight/3));
		divider.enable(false); 
		 
		// Add splitpane to frame
		add(divider);
		
		// Starts the thread.
		t.start();
		
		// Adds the mouse listener to the frame.
		picture.addMouseListener(this);
		
		//paintComponent(graph, jlayer);
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		System.out.println(e.getX() + " " + e.getY());
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void run() {
		while(true) {
    		repaint();
    		try {
    			Thread.sleep(16);
    		} 
    		catch(InterruptedException e) {
    			System.out.println("Interrupted!");
    		}
    	}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void paintComponent(Graphics graph) {
		super.paintComponents(graph);
		graph.setColor(Color.RED);
		graph.fillRect(5, 5, 20, 20);
	}
}