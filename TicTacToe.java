package TicTacToe;


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TicTacToe  {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int i=0;
	JButton
	 button0,
	 button1,
	 button2,
	 button3,
	 button4,
	 button5,
	 button6,
	 button7,
	 button8,
	 button9;
	//GridLayout g;
	JTextField field;
	int k=0,count=0;

	TicTacToe()
	{
		frame.setSize(400,400);
		frame.setTitle("Rohit Gamer");
		frame.setLocation(300,200);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.add(panel);
		
		panel.setBackground(Color.yellow);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button0 = new JButton("");
		button0.setBounds(13, 13, 90, 90);
		
		button1 = new JButton("");
		button1.setBounds(110,13,90,90);
		button2 = new JButton("");
		button2.setBounds(207,13,90,90);
		button3 = new JButton("");
		button3.setBounds(13,110,90,90);
		button4 = new JButton("");
		button4.setBounds(110,110,90,90);
		button5 = new JButton("");
		button5.setBounds(207,110,90,90); 
		button6 = new JButton("" );
		button6.setBounds(13,207,90,90);
		button7 = new JButton("");
		button7.setBounds(110,207,90,90);
		button8 = new JButton("");
		button8.setBounds(207,207,90,90);
		button9 = new JButton("Start player");
		button9.setBounds(90,320,130,30);
		
		GridLayout g = new GridLayout(4,3,10,10);
		panel.setLayout(g);
		
		


		panel.add(button0);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		
		button0.addActionListener(new A0());
		button1.addActionListener(new A1());
		button2.addActionListener(new A2());
		button3.addActionListener(new A3());
		button4.addActionListener(new A4());
		button5.addActionListener(new A5());
		button6.addActionListener(new A6());
		button7.addActionListener(new A7());
		button8.addActionListener(new A8());
		button9.addActionListener(new A9());
		
		
		
	}
	public int check()
	{
		count++;
		
		if(button0.getText()=="X"&& button1.getText()=="X"&&button2.getText()=="X") {
		return 1;}
		else if(button0.getText()=="X"&& button3.getText()=="X"&& button6.getText()=="X") {
		return 1;}
		else if(button0.getText()=="X" && button4.getText()=="X" && button8.getText()=="X") {
		return 1;}
		else if(button1.getText()=="X" && button4.getText()=="X" && button7.getText()=="X") {
		return 1;}
		else if(button2.getText()=="X" && button5.getText()=="X" && button8.getText()=="X") {
		return 1;}
		else if (button2.getText()=="X" && button4.getText()=="X" && button6.getText()=="X") {
			return 1;}
		else if(button3.getText()=="X" && button4.getText()=="X" && button5.getText()=="X") {
			return 1;}
		else if(button6.getText()=="X" && button7.getText()=="X" && button8.getText()=="X") {
			return 1;}
	 
		else if(button0.getText()=="0"&& button1.getText()=="0"&&button2.getText()=="0") {
			return 2;}
			else if(button0.getText()=="0"&& button3.getText()=="0"&& button6.getText()=="0") {
			return 2;}
			else if(button0.getText()=="0" && button4.getText()=="0" && button8.getText()=="0") {
			return 2;}
			else if(button1.getText()=="0" && button4.getText()=="0" && button7.getText()=="0") {
			return 2;}
			else if(button2.getText()=="0" && button5.getText()=="0" && button8.getText()=="0") {
			return 2;}
			else if (button2.getText()=="0" && button4.getText()=="0" && button6.getText()=="0") {
				return 2;}
			else if(button3.getText()=="0" && button4.getText()=="0" && button5.getText()=="0") {
				return 2;}
			else if(button6.getText()=="0" && button7.getText()=="0" && button8.getText()=="0") {
				return 2;}
			 
		
			else
			{
			
				
		       return 3;
				
			}
		
		
		
		
	}
	class A0 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		if(k==0)
		{
			button0.setText("X");
			button0.setEnabled(false);
			i = check();
			if(i==1)
			{
				
			}
			else if(i==2)
			{
				
			}
			else
			{
				
			}
			k=1;
		}
		else
		{
			if(k==1)
			{
				button0.setText("0");
				button0.setEnabled(false);
				k=0;
				i = check();
				if(i==1)
				{
					enable();
				}
				else if(i==2)
				{
					enable();
				}
				else
				{
					
					
				}
			}
		}
		}
	}class A1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		if(k==0)
		{
			button1.setText("X");
			button1.setEnabled(false);
			i = check();
			if(i==1)
			{
				
			}
			else if(i==2)
			{
				
			}
			else
			{
				
			}
			k=1;
		}
		else
		{
			if(k==1)
			{
				button1.setText("0");
				button1.setEnabled(false);
				k=0;
				i = check();
				if(i==1)
				{
					enable();
				}
				else if(i==2)
				{
					enable();
				}
				else
				{
					
					
				}
			}
		}
		}
	}
	class A2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		if(k==0)
		{
			button2.setText("X");
			button2.setEnabled(false);
			i = check();
			if(i==1)
			{
				
			}
			else if(i==2)
			{
				
			}
			else
			{
				
			}
			k=1;
		}
		else
		{
			if(k==1)
			{
				button2.setText("0");
				button2.setEnabled(false);
				k=0;
				i = check();
				if(i==1)
				{
					enable();
				}
				else if(i==2)
				{
					enable();
				}
				else
				{
					
					
				}
			}
		}
		}
	}
	class A3 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		if(k==0)
		{
			button3.setText("X");
			button3.setEnabled(false);
			i = check();
			if(i==1)
			{
				
			}
			else if(i==2)
			{
				
			}
			else
			{
				
			}
			k=1;
		}
		else
		{
			if(k==1)
			{
				button3.setText("0");
				button3.setEnabled(false);
				k=0;
				i = check();
				if(i==1)
				{
					enable();
				}
				else if(i==2)
				{
					enable();
				}
				else
				{
					
					
				}
			}
		}
		}
	}
	class A4 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		if(k==0)
		{
			button4.setText("X");
			button4.setEnabled(false);
			i = check();
			if(i==1)
			{
				
			}
			else if(i==2)
			{
				
			}
			else
			{
				
			}
			k=1;
		}
		else
		{
			if(k==1)
			{
				button4.setText("0");
				button4.setEnabled(false);
				k=0;
				i = check();
				if(i==1)
				{
					enable();
				}
				else if(i==2)
				{
					enable();
				}
				else
				{
					
				}
			}
		}
		}
	}
	class A5 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		if(k==0)
		{
			button5.setText("X");
			button5.setEnabled(false);
			i = check();
			if(i==1)
			{
				
			}
			else if(i==2)
			{
				
			}
			else
			{
				
			}
			k=1;
		}
		else
		{
			if(k==1)
			{
				button5.setText("0");
				button5.setEnabled(false);
				k=0;
				i = check();
				if(i==1)
				{
					enable();
				}
				else if(i==2)
				{
					enable();
				}
				else
				{
					
					
				}
			}
		}
		}
	}
	class A6 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		if(k==0)
		{
			button6.setText("X");
			button6.setEnabled(false);
			i = check();
			if(i==1)
			{
				
			}
			else if(i==2)
			{
				
			}
			else
			{
				
			}
			k=1;
		}
		else
		{
			if(k==1)
			{
				button6.setText("0");
				button6.setEnabled(false);
				k=0;
				i = check();
				if(i==1)
				{
					enable();
				}
				else if(i==2)
				{
					enable();
				}
				else
				{
					
					
				}
			}
		}
		}
	}
	class A7 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		if(k==0)
		{
			button7.setText("X");
			button7.setEnabled(false);
			i = check();
			if(i==1)
			{
				
			}
			else if(i==2)
			{
				
			}
			else
			{
				
			}
			k=1;
		}
		else
		{
			if(k==1)
			{
				button7.setText("0");
				button7.setEnabled(false);
				k=0;
				i = check();
				if(i==1)
				{
					enable();
				}
				else if(i==2)
				{
					enable();
				}
				else
				{
					
					
				}
			}
		}
		}
	}
	class A8 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		if(k==0)
		{
			button8.setText("X");
			button8.setEnabled(false);
			i = check();
			if(i==1)
			{
				
			}
			else if(i==2)
			{
				
			}
			else
			{
				
			}
			k=1;
		}
		else
		{
			if(k==1)
			{
				button8.setText("0");
				button8.setEnabled(false);
				k=0;
				i = check();
				if(i==1)
				{
					enable();
				}
				else if(i==2)
				{
					enable();
				}
				else
				{
					
					
				}
			}
		}
		}
	}
	class A9 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			count=0;
			k=0;
			button0.setText("");
			button1.setText("");
			button2.setText("");
			button3.setText("");
			button4.setText("");
			button5.setText("");
			button6.setText("");
			button7.setText("");
			button8.setText("");
			
		  
			   button0.setEnabled(true);
				button1.setEnabled(true);
				button2.setEnabled(true);
				button3.setEnabled(true);
				button4.setEnabled(true);
				button5.setEnabled(true);
				button6.setEnabled(true);
				button7.setEnabled(true);
				button8.setEnabled(true);
			  
		  
		}
	}
	public void enable()
	{
		button0.setEnabled(false);
		button1.setEnabled(false);
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);
		button5.setEnabled(false);
		button6.setEnabled(false);
		button7.setEnabled(false);
		button8.setEnabled(false);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToe t = new TicTacToe();

	}

	

}

