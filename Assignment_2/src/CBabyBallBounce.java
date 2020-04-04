import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CBabyBallBounce extends JFrame implements ActionListener {
	private JPanel world;
//	private JPanel game;  review this afterwards 
	private JPanel controls;
	private JPanel actions;
	private JSlider slide;
	private JTextField time1;
	private JTextField time2;
	private JTextField time3;
	private JTextField score1;
	private JTextField score2;
	private JTextField option_field;
	private JTextField square_field;
	private JTextField direction_field;
	
	private JButton ControlUp;
	private JButton ControlDown;
	private JButton ControlLeft;
	private JButton ControlRight;
	private JButton Control1;
	private JButton Control2;
	private JButton Control3;
	private JButton Control4;
	private JButton Control5;
	private JButton Control6;
	

	
	
//	JPanels
	JPanel controlsContent;
	JPanel directionButtons;
	JPanel functions;
	//south
	JButton resetbutton;
	JButton runbutton;
	JButton stepbutton;
	JButton twoPlayers;
	JButton fourPlayers;
	JButton multi;
	JButton Exit;
	
	
	
	
	
	JLabel timer_text;
	JLabel timer1_dot;
	JLabel timer2_dot;
	JLabel timer3_dot;
	
	JLabel score_text;
	JLabel scoreMiddleText;
	JLabel option_text;
	JLabel square_text;
	JLabel direction_text;
	
	JLabel map;
	
	
	
	public static void main(String[] args) {
		CBabyBallBounce frame = new CBabyBallBounce();
		frame.setSize(825, 585);
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
		
//		world where game is played.------------------------------
		
		world = new JPanel();	
		world.setPreferredSize(new Dimension (665,450));
		world.setBackground(Color.white);
		window.add(world, BorderLayout.CENTER);
		
//		controls: right to my world.------------------------------
		
		controls = new JPanel();
		controls.setLayout(new FlowLayout());
		
		controlsContent = new JPanel();
		controlsContent.setPreferredSize(new Dimension(140,490));
//		controlsContent.setBackground(Color.green);
		
		timer_text = new JLabel("      DIGITAL TIMER      ");
		controlsContent.add(timer_text);
		
		time1 = new JTextField("00",2);
		time1.setForeground(Color.WHITE);
		time1.setBackground(Color.BLACK);
		controlsContent.add(time1);
		
		timer1_dot = new JLabel(":");
		controlsContent.add(timer1_dot);
		
		time2 = new JTextField("00",2);
		time2.setForeground(Color.WHITE);
		time2.setBackground(Color.BLACK);
		controlsContent.add(time2);
		
		timer2_dot = new JLabel(":");
		controlsContent.add(timer2_dot);
		
		time3 = new JTextField("00",2);
		time3.setForeground(Color.WHITE);
		time3.setBackground(Color.BLACK);
		controlsContent.add(time3);
		
		score_text = new JLabel("             SCORE             ");
		controlsContent.add(score_text);
		
		score1 = new JTextField("00",2);
		score1.setForeground(Color.WHITE);
		score1.setBackground(Color.BLACK);
		controlsContent.add(score1);
		
		scoreMiddleText = new JLabel("< L : R >");
		controlsContent.add(scoreMiddleText);
		
		score2 = new JTextField("00",2);
		score2.setForeground(Color.WHITE);
		score2.setBackground(Color.BLACK);
		controlsContent.add(score2);
		
		option_text = new JLabel("Options:");
		option_text.setPreferredSize(new Dimension(55, 15));
		controlsContent.add(option_text);
		
		option_field= new JTextField("2 Players", 5);
		controlsContent.add(option_field);
		
		square_text = new JLabel("Square:");
		square_text.setPreferredSize(new Dimension(55, 15));
		controlsContent.add(square_text);
		
		square_field= new JTextField("101", 5);
		controlsContent.add(square_field);
		
		direction_text = new JLabel("Direction:");
		direction_text.setPreferredSize(new Dimension(55, 15));
		controlsContent.add(direction_text);
		
		direction_field= new JTextField("SE", 5);
		controlsContent.add(direction_field);
		
		directionButtons = new JPanel();
		directionButtons.setLayout(new GridLayout (3,3,3,3));
		
		Control1 = new JButton(" "); 
		directionButtons.add(Control1);
		
		ControlUp = new JButton(" ^ "); // ask cosmin
		directionButtons.add(ControlUp);
		
		Control3 = new JButton(" "); 
		directionButtons.add(Control3);
		
		ControlLeft = new JButton(" < "); // ask cosmin
		directionButtons.add(ControlLeft);
		
		Icon middleball = new ImageIcon("images\\ball.png");
		Control5 = new JButton(middleball);
		directionButtons.add(Control5);
		
//		Control4 = new JButton(" "); 
//		directionButtons.add(Control4);
		
		ControlRight = new JButton(" > "); // ask cosmin
		directionButtons.add(ControlRight);
		
		Control2 = new JButton(" "); 
		directionButtons.add(Control2);
		
		ControlDown = new JButton(" v "); // ask cosmin
		directionButtons.add(ControlDown);
		
		Control6 = new JButton(" "); 
		directionButtons.add(Control6);
		
		controlsContent.add(directionButtons);
		
		Icon compass = new ImageIcon("images\\north.jpg");
		map = new JLabel(compass);
		controlsContent.add(map);
		
		functions = new JPanel();
		functions.setLayout(new GridLayout(2,2,3,3));
		
		twoPlayers = new JButton("2 Player");
		functions.add(twoPlayers);
		
		fourPlayers = new JButton("4 Player");
		functions.add(fourPlayers);
		
		multi = new JButton("multi");
		functions.add(multi);
		
		Exit = new JButton("Exit");
		functions.add(Exit);
		
		controlsContent.add(functions);
		
		
		
		
		controls.add(controlsContent);
		window.add(controls, BorderLayout.EAST);
		
//		actions: south to my world.------------------------------
		
		actions = new JPanel(); //creates JPanel south
		actions.setPreferredSize(new Dimension(650,100));
		actions.setLayout(new FlowLayout());
		
//		Adds ACTS button on south JPanel
		Icon act = new ImageIcon("images\\step.png");
		JButton stepbutton = new JButton("Act",act);
		actions.add(stepbutton);
//		window.add(actions, BorderLayout.SOUTH);
		
//		Adds RUN button on south JPanel
		Icon run = new ImageIcon("images\\run.png");
		JButton runbutton = new JButton("Run",run);
		actions.add(runbutton);
//		window.add(actions, BorderLayout.SOUTH); 
		
//		Adds RESET button on south JPanel
		Icon reset = new ImageIcon("images\\reset.png");
		JButton resetbutton = new JButton("Reset",reset);
		actions.add(resetbutton);
//		window.add(actions, BorderLayout.SOUTH); 
		
//		Adds slider on south JPanel
		JLabel slide_text = new JLabel ("                     speed: ");
		actions.add(slide_text);
		slide = new JSlider();
		actions.add(slide);
		window.add(actions, BorderLayout.SOUTH);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
