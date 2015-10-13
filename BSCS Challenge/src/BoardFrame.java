import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.plaf.LayerUI;


public class BoardFrame extends JFrame implements ActionListener, MouseMotionListener, MouseListener, Runnable {
	private JPanel bottomPanel, buttonsPanel, cardPanel, pointsPanel;
	private JSplitPane divider = new JSplitPane();
	private JScrollPane topPanel;
	private ScrollablePicture picture; 
	private JButton moveButton;
	
	// Temporary.
	static int mouseX, mouseY;
	Thread t;

	public BoardFrame() {
		// Get size of screen for splitpane
		Toolkit tk = Toolkit.getDefaultToolkit();
		int screenHeight = tk.getScreenSize().height;	
		t = new Thread(this);

		// Top panel for map
		picture = new ScrollablePicture(new ImageIcon("CSULBMap3.png"), 1);
	
		 LayerUI<JComponent> layerUI = new View();
		 JLayer<JComponent> jlayer = new JLayer<JComponent>(picture, layerUI);
		 
		 topPanel = new JScrollPane(jlayer);
		
		// Bottom panel for controls
		bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(1,3));
		bottomPanel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		
		// Add buttons to button panel
		buttonsPanel = new JPanel(new GridLayout(4,1));
		JButton drawCardButton = new JButton("Draw Card");
		moveButton = new JButton("Move");
		JButton playCardButton = new JButton("Play Card");
		JList locations = new JList();
		buttonsPanel.add(drawCardButton);
		buttonsPanel.add(moveButton);
		buttonsPanel.add(playCardButton);
		buttonsPanel.add(locations);
		
		// Add card face(s) to card panel.
		cardPanel = new JPanel();
		cardPanel.setBackground(Color.cyan);
		JLabel cardTitle = new JLabel("Card Face go here.");
		cardPanel.add(cardTitle);
		
		// Add viewer for points to points panel.
		pointsPanel = new JPanel();
		pointsPanel.setBackground(Color.PINK);
		JLabel pointTitle = new JLabel("Points menu goes here.");
		pointsPanel.add(pointTitle);
		
		// Add buttons panel, card panel, and point panel to bottom panel.
		bottomPanel.add(buttonsPanel);
		bottomPanel.add(cardPanel);
		bottomPanel.add(pointsPanel);
		
		// Splitpane to combine both top and bottom panel.
		 divider = new JSplitPane(JSplitPane.VERTICAL_SPLIT, topPanel, bottomPanel);
		 divider.setDividerLocation(screenHeight - (screenHeight/3));
		 divider.enable(false); 
		 
		// Add splitpane to frame.
		add(divider);
		
		picture.addMouseListener(this);
		t.start(); // Start thread.
	}
	
	

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
	}


	@Override
	public void mouseMoved(MouseEvent e) {
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == moveButton) {
			
		}
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		
		System.out.println("X: " + mouseX + ", Y: " + mouseY);
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
	public void run() {
		while (true) {
			repaint();
			try {
				Thread.sleep(16); // ~60 fps
			} catch (InterruptedException e) {
			}
		}
	}
}