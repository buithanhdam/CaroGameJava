package Caro;


import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class CaroGamePanel extends JPanel implements ActionListener{
	
	 int Width_Screen = 600;
	 int Heigh_Screen = 600;
	 int unit_size = 30;
	 int unit = Width_Screen/unit_size , point = 0 , num = 0;
	
	 JPanel panelCenter = new JPanel();
	 public JFrame frame = new JFrame();
	 
	
	boolean pTurn = true;
	
	public JButton buttonGr[][] = new JButton[unit][unit];
	int pos[][] = new int[unit][unit]; 
	
	public void add() {
		

		frame.setLayout(new BorderLayout());
		frame.add(panelCenter);

		
		
		panelCenter.setLayout(new GridLayout(unit, unit,1,1));
		
		for (int i = 0; i < unit; i++) {
            for (int j = 0; j < unit ; j++) {
                
                pos[i][j] = num;
                num++;
            }
        }
        for (int i = 0; i < unit; i++) {
            for (int j = 0; j < unit; j++) {
                buttonGr[i][j] = new JButton();//tao nut
                buttonGr[i][j].addActionListener(this);//add action
                panelCenter.add(buttonGr[i][j]);//add 
        }
            }
        for (int i = 0; i < unit; i++) {
            for (int j = 0; j < unit; j++) {
            	buttonGr[i][j].setBackground(Color.WHITE);
            }
        }

	

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panelCenter.setSize(Width_Screen, Heigh_Screen);
		frame.setSize(1000,850);
		frame.setResizable(false);
		frame.setVisible(true);
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0 ; i< unit;i++) {
			for(int j = 0 ; j < unit ; j++) {
				if(e.getSource()==buttonGr[i][j] ) {
					if(pTurn ) {
						if(buttonGr[i][j].getText()=="") {

							
							buttonGr[i][j].setText("X");
							buttonGr[i][j].setFont(new Font("MV Boli",Font.BOLD,15));
							buttonGr[i][j].setForeground(Color.RED);

							pTurn = false;
							Winner(check(i,j,buttonGr[i][j].getText()),"X WIN!!");
							
						}
					
					
					}else {
						if(buttonGr[i][j].getText()=="") {
							buttonGr[i][j].setFont(new Font("MV Boli",Font.BOLD,15));
							buttonGr[i][j].setForeground(Color.BLUE);
							buttonGr[i][j].setText("O");
							
							
							pTurn = true;
							Winner(check(i,j,buttonGr[i][j].getText()),"O WIN!!");
						
						}
					
					}
				}
				}
				
				
				
				
			}
			
			
		}
	
	


	
	
	
	public boolean check(int a , int b , String st) {
		int k ,j ;
		int count = 0;
		//xet theo chieu doc , thay doi row , giu nguyen col
		for(k= -4; k<=4 ; ++k) {
			if(a+k>=0 && a+ k < unit) {
				if(buttonGr[a+k][b].getText()==st) {
					count++;
				}else if (count < 5){
					count = 0;
				}
				
			}
			
		}
		if(count >= 5) {
			return true;
		}else {
			count = 0;
		}
		//xet theo chieu ngang , thay doi col , giu nguyen row
		for(j= -4; j<=4 ; ++j) {
			if(b+j>=0 && b+ j < unit) {
				if(buttonGr[a][b+j].getText()==st) {
					count++;
				}else if (count < 5){
					count = 0;
				}
				
			}
			
		}
		if(count >= 5) {
			return true;
		}else {
			count = 0;
		}
		// xet theo duong cheo 1
		for(j= -4, k =-4; k<=4&&j<=4 ; ++k,++j) {
			if(a+k>=0 && a+ k < unit && b+j>=0 && b+ j < unit) {
				if(buttonGr[a+k][b+j].getText()==st) {
					count++;
				}else if (count < 5){
					count = 0;
				}
				
			}
			
		}
		if(count >= 5) {
			return true;
		}else {
			count = 0;
		}
		for (k = -4; k <= 4; k++) {
            if (b + k >= 0 && b + k < unit && a + k >= 0 && a + k < unit) {
                if (buttonGr[a + k][b + k].getText() == st) {
                    count++;
                } else if (count < 5) {
                    count = 0;
                }
            }
        }
        if (count >= 5) {
            return true;
        }
//        duong vheo 2
        for(j= 4, k =-4; k<=4&&j >= -4 ; ++k,--j) {
			if(a+k>=0 && a+ k < unit && b+j>=0 && b+ j < unit) {
				if(buttonGr[a+k][b+j].getText()==st) {
					count++;
				}else if (count < 5){
					count = 0;
				}
				
			}
			
		}
		if(count >= 5) {
			return true;
		}else {
			count = 0;
		}
		return false;
		
			
	}




	public void Winner(boolean boo , String s) {
		if(boo) {
			JOptionPane.showMessageDialog(null, s, "Game Over!", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "Do you want to rematch ?", "Start Again!", JOptionPane.INFORMATION_MESSAGE);
			
			for(int i = 0 ; i< unit;i++) {
				for(int j = 0 ; j < unit ; j++) {
					buttonGr[i][j].setText("");
					
					
				}
			}
		}
			
			
		
		
	}
	
	
	
	
	

}
