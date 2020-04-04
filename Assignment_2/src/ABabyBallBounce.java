import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ABabyBallBounce extends JFrame implements ActionListener{

	private JPanel playPitch;
	private JPanel bottomArea;
	private JPanel asideArea;
	private static int frameX = 825;
	private static int frameY = 585;
	
	
	

	
	public static void main(String[] args) {
		
		ABabyBallBounce frame = new ABabyBallBounce();
		frame.setSize(frameX, frameY);
		frame.setMinimumSize(new Dimension(frameX, frameY));
		frame.setLocationRelativeTo(null);
//		frame.setResizable(true);  makes the frame resizable.
		frame.setTitle("CBabyBallBounce – Baby Ball Bounce Application"); // Gives title to the frame/game.
		frame.setVisible(true);
		frame.createGUI();	    

		
	}
	
	

	private void createGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new BorderLayout());
		
		
//------ PLAYPITCH -----------------------------------------------------
		
		playPitch = new JPanel();
		playPitch.setBackground(Color.white);
		playPitch.setPreferredSize(new Dimension(665,450));
		
		
		window.add(playPitch, BorderLayout.CENTER); // last line 
		
//------ BOTTOM AREA----------------------------------------------------
		
		bottomArea = new JPanel(); //creates JPanel south
		
//		Adds ACTS button on south JPanel
		Icon act = new ImageIcon("images\\step.png");
		JButton stepbutton = new JButton("Act",act);
		bottomArea.add(stepbutton);
		window.add(bottomArea, BorderLayout.SOUTH); // last line 
		
//		Adds RUN button on south JPanel
		Icon run = new ImageIcon("images\\run.png");
		JButton runbutton = new JButton("Run",run);
		bottomArea.add(runbutton);
		window.add(bottomArea, BorderLayout.SOUTH); // last line 
		
//		Adds RESET button on south JPanel
		Icon reset = new ImageIcon("images\\reset.png");
		JButton resetbutton = new JButton("Reset",reset);
		bottomArea.add(resetbutton);
		window.add(bottomArea, BorderLayout.SOUTH); // last line 
		
		
//------ ASIDE -----------------------------------------------------
		
		asideArea = new JPanel();
		window.add(asideArea, BorderLayout.EAST); // last line 
		
		
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
