package TicTacTeo;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;


public class TicGame implements ActionListener{
	Random random = new Random();
	JFrame frame = new JFrame();
	
	JPanel tilte = new JPanel();
	JPanel buttongr = new JPanel();
	
	JLabel text = new JLabel("");
	JButton[] button = new JButton[9];
	boolean p1Turn = true;
	
	TicGame(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		
		text.setBackground(Color.WHITE);
		text.setForeground(Color.BLACK);
		text.setFont(new Font("Ink Free",Font.BOLD,75));
		text.setHorizontalAlignment(JLabel.CENTER);
		text.setText("Tic-Tac-Toe");
		text.setOpaque(true);
		
		tilte.setBackground(Color.WHITE);
		tilte.setBounds(0,0,500,100);
		
		buttongr.setLayout(new GridLayout(3,3));
		buttongr.setBackground(Color.WHITE);
		
		for(int i = 0 ;i<9 ;i++) {
			button[i] = new JButton();
			button[i].setBackground(Color.WHITE);
			buttongr.add(button[i]);
			
			button[i].setFont(new Font("MV Boli",Font.BOLD,120));
			button[i].setFocusable(false);
			button[i].addActionListener(this);
			
			
			
		}
		tilte.add(text);
		frame.add(tilte,BorderLayout.NORTH);
		frame.add(buttongr);
		
		
//		firstTurn();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i =0 ; i<9 ;i++) {
		if(e.getSource()==button[i]) {
			if(p1Turn) {
				if(button[i].getText()=="") {
					button[i].setForeground(Color.RED);
					
					button[i].setFont(new Font("MV Boli",Font.BOLD,60));
					button[i].setText("X");
					p1Turn = false;
					text.setForeground(Color.BLUE);
					text.setText("O Turn");
					check();
					
				}
				
			}else {
				if(button[i].getText()=="") {
			
				button[i].setForeground(Color.BLUE);
				
				button[i].setFont(new Font("MV Boli",Font.BOLD,60));
				button[i].setText("O");
				
				p1Turn = true;
				text.setForeground(Color.RED);
				text.setText("X Turn");
				check();
				
				}
			}
			
			
		}
		
		}
		
	}
	
	public void firstTurn() {
		if(p1Turn) {
//			text.setBackground(new Color(25,25,25));
//			text.setForeground(new Color(25,255,0));
//			text.setFont(new Font("Ink Free",Font.BOLD,75));
//			text.setHorizontalAlignment(JLabel.CENTER);
			text.setText("X Turn");
//			text.setOpaque(true);
		}else {
//			text.setBackground(new Color(25,25,25));
//			text.setForeground(new Color(25,255,0));
//			text.setFont(new Font("Ink Free",Font.BOLD,75));
//			text.setHorizontalAlignment(JLabel.CENTER);
			text.setText("O Turn");
//			text.setOpaque(true);
		}
		
		
		
	}
public void check() {
//	----------------- X check
	if(button[0].getText()=="X" 
			&& button[1].getText()=="X" 
			&& button[2].getText()=="X"
			) {
		xWin(0,1,2);
		
	}
	if(button[3].getText()=="X" 
			&& button[4].getText()=="X" 
			&& button[5].getText()=="X"
			) {
		xWin(3,4,5);
		
	}
	if(button[6].getText()=="X" 
			&& button[7].getText()=="X" 
			&& button[8].getText()=="X"
			) {
		xWin(6,7,8);
		
	}
	if(button[0].getText()=="X" 
			&& button[3].getText()=="X" 
			&& button[6].getText()=="X"
			) {
		xWin(0,3,6);
		
	}
	if(button[1].getText()=="X" 
			&& button[4].getText()=="X" 
			&& button[7].getText()=="X"
			) {
		xWin(1,4,7);
		
	}
	if(button[2].getText()=="X" 
			&& button[5].getText()=="X" 
			&& button[8].getText()=="X"
			) {
		xWin(2,5,8);
		
	}
	if(button[0].getText()=="X" 
			&& button[4].getText()=="X" 
			&& button[8].getText()=="X"
			) {
		xWin(0,4,8);
		
	}
	if(button[2].getText()=="X" 
			&& button[4].getText()=="X" 
			&& button[6].getText()=="X"
			) {
		xWin(2,4,6);
		
	}
//	------------------------------------ check 0
	if(button[0].getText()=="O" 
			&& button[1].getText()=="O" 
			&& button[2].getText()=="O"
			) {
		oWin(0,1,2);
		
	}
	if(button[3].getText()=="O" 
			&& button[4].getText()=="O" 
			&& button[5].getText()=="O"
			) {
		oWin(3,4,5);
		
	}
	if(button[6].getText()=="O" 
			&& button[7].getText()=="O" 
			&& button[8].getText()=="O"
			) {
		oWin(6,7,8);
		
	}
	if(button[0].getText()=="O" 
			&& button[3].getText()=="O" 
			&& button[6].getText()=="O"
			) {
		oWin(0,3,6);
		
	}
	if(button[1].getText()=="O" 
			&& button[4].getText()=="O" 
			&& button[7].getText()=="O"
			) {
		oWin(1,4,7);
		
	}
	if(button[2].getText()=="O" 
			&& button[5].getText()=="O" 
			&& button[8].getText()=="O"
			) {
		oWin(2,5,8);
		
	}
	if(button[0].getText()=="O" 
			&& button[4].getText()=="O" 
			&& button[8].getText()=="O"
			) {
		oWin(0,4,8);
		
	}
	if(button[2].getText()=="O" 
			&& button[4].getText()=="O" 
			&& button[6].getText()=="O"
			) {
		oWin(2,4,6);
		
	}
	
		
	}
	
	
	public void xWin(int a, int b,int c) {
		button[a].setBackground(Color.RED);
		button[b].setBackground(Color.RED);
		button[c].setBackground(Color.RED);
		for(int i = 0; i<9;i++) {
			button[i].setEnabled(false);
		}
		text.setForeground(Color.RED);
		text.setText("X Win");
		
		
		
		
	}
	public void oWin(int a,int b,int c) {
		button[a].setBackground(Color.BLUE);
		button[b].setBackground(Color.BLUE);
		button[c].setBackground(Color.BLUE);
		for(int i = 0; i<9;i++) {
			button[i].setEnabled(false);
		}
		text.setForeground(Color.BLUE);
		text.setText("O Win");
		
	}

	
	
}
