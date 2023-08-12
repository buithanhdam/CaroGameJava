package Caro;

import javax.swing.*;
import javax.swing.border.Border;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener{

	JButton playButton = new JButton();
	JButton ruleButton = new JButton();
	JButton exitButton = new JButton();
	
	JLabel logoLabel = new JLabel();
	JPanel panel = new JPanel();
	JPanel bpanel = new JPanel();
	
	Main(){
		this.setSize(600,400);
		this.setLayout(new FlowLayout());
		
		
		
		playButton.setFont(new Font("MV Boli",Font.BOLD,30));
		playButton.setForeground(Color.RED);
		playButton.setBackground(Color.WHITE);
		playButton.setPreferredSize(new Dimension(50,50));
		playButton.setText("Play 2 player");
		playButton.addActionListener(this);
		
		//
		ruleButton.setFont(new Font("MV Boli",Font.BOLD,30));
		ruleButton.setForeground(Color.RED);
		ruleButton.setBackground(Color.WHITE);
		ruleButton.setPreferredSize(new Dimension(50,50));
		ruleButton.setText("Rule");
		ruleButton.addActionListener(this);
		//
		exitButton.setFont(new Font("MV Boli",Font.BOLD,30));
		exitButton.setForeground(Color.RED);
		exitButton.setBackground(Color.WHITE);
		exitButton.setPreferredSize(new Dimension(50,50));
		exitButton.setText("Exit");
		exitButton.addActionListener(this);
		
		
		logoLabel.setFont(new Font("MV Boli",Font.BOLD,60));
		logoLabel.setText("Caro Game");
		
		bpanel.setLayout(new GridLayout(3,1,10,10));
		bpanel.add(playButton);
		bpanel.add(ruleButton);
		bpanel.add(exitButton);
		
		
		panel.setLayout(new BorderLayout());
		panel.add(logoLabel,BorderLayout.NORTH);
		panel.add(bpanel,BorderLayout.CENTER);
		
		getContentPane().add(panel);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		
		Main frame = new Main();
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==playButton) {
			   CaroGamePanel c = new CaroGamePanel();
		        c.add();
		}
		if(e.getSource()==ruleButton) {
			JOptionPane.showMessageDialog(null, "The Caro game have 2 characters for 2 players play the game "+"\n"
                    + "Player 1 is X character."+"\n"
                    + "Player 2 is O character. "+"\n"
                    + "Player who win the game When one of them have a vertical,Horizontal or diagonal line of 5 their characters  "
                    , "Rule", JOptionPane.INFORMATION_MESSAGE);
		}
		if(e.getSource()==exitButton) {
			   
		}
		
	}

	
	
}
