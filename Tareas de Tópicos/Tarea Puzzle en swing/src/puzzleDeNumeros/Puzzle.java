package puzzleDeNumeros;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Puzzle extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Puzzle frame = new Puzzle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Puzzle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 283, 278);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
			
		JButton btn9 = new JButton("");
		JButton btn8 = new JButton("8");
		JButton btn7 = new JButton("5");
		JButton btn4 = new JButton("8");
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("3");
		JButton btn3 = new JButton("6");
		JButton btn6 = new JButton("7");
		JButton btn5 = new JButton("4");
	
		//if(btn1.getText()=="1"&& btn2.getText()=="2"&&btn3.getText()=="3"&&btn4.getText()=="4"&&btn5.getText()=="5"&&btn6.getText()=="6"&&btn7.getText()=="7"&&btn8.getText()=="8"&&btn9.isVisible()==false)
		//{
		//JOptionPane.showMessageDialog(this, "Felicidades juego terminado!!");	
		//}
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(btn4.isVisible()==false) {
	            	   btn4.setText(btn1.getText());
	               btn1.setVisible(false);
	               btn4.setVisible(true);
	               }
				
				if(btn2.isVisible()==false) 
				 {
	               btn2.setText(btn1.getText());
	               btn1.setVisible(false);
	               btn2.setVisible(true);
				 }
				 if(btn1.getText()=="1"&& btn2.getText()=="2"&&btn3.getText()=="3"&&btn4.getText()=="4"&&btn5.getText()=="5"&&btn6.getText()=="6"&&btn7.getText()=="7"&&btn8.getText()=="8"&&btn9.isVisible()==false)
					{
				    	int input = JOptionPane.showConfirmDialog(null,
				                "Felicidades Juego terminado", "Puzzle", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
				       
				        System.out.println(input);
					}
			}
		});
		btn1.setBackground(Color.WHITE);
		btn1.setForeground(Color.BLACK);
		btn1.setBounds(26, 11, 56, 52);
		contentPane.add(btn1);
		
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(btn1.isVisible()==false) 
				 {
	            	   btn1.setText(btn2.getText());
	               btn2.setVisible(false);
	               btn1.setVisible(true);
				 }
				if(btn3.isVisible()==false) {
	            	   btn3.setText(btn2.getText());
	               btn2.setVisible(false);
	               btn3.setVisible(true);
	               }
		      
				if(btn5.isVisible()==false) {
	            	   btn5.setText(btn2.getText());
	               btn2.setVisible(false);
	               btn5.setVisible(true);
	               }
				 if(btn1.getText()=="1"&& btn2.getText()=="2"&&btn3.getText()=="3"&&btn4.getText()=="4"&&btn5.getText()=="5"&&btn6.getText()=="6"&&btn7.getText()=="7"&&btn8.getText()=="8"&&btn9.isVisible()==false)
					{
				    	int input = JOptionPane.showConfirmDialog(null,
				                "Felicidades Juego terminado", "Puzzle", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
				       
				        System.out.println(input);
					}
			}
		});
		btn2.setBackground(Color.WHITE);
		btn2.setForeground(Color.BLACK);
		btn2.setBounds(92, 11, 56, 52);
		contentPane.add(btn2);
		
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				 if(btn7.isVisible()==false) 
				 {
	            	   btn7.setText(btn4.getText());
	               btn4.setVisible(false);
	               btn7.setVisible(true);
				 }
				 if(btn1.isVisible()==false) 
				 {
	            	   btn1.setText(btn4.getText());
	               btn4.setVisible(false);
	               btn1.setVisible(true);
				 }
				 if(btn5.isVisible()==false) {
		               btn5.setText(btn4.getText());
		               btn4.setVisible(false);
		               btn5.setVisible(true);
		         
				}	 
				 if(btn1.getText()=="1"&& btn2.getText()=="2"&&btn3.getText()=="3"&&btn4.getText()=="4"&&btn5.getText()=="5"&&btn6.getText()=="6"&&btn7.getText()=="7"&&btn8.getText()=="8"&&btn9.isVisible()==false)
					{
				    	int input = JOptionPane.showConfirmDialog(null,
				                "Felicidades Juego terminado", "Puzzle", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
				       
				        System.out.println(input);
					}
			}
		});
		btn4.setBackground(Color.WHITE);
		btn4.setForeground(Color.BLACK);
		btn4.setBounds(26, 74, 56, 52);
		contentPane.add(btn4);
		
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(btn2.isVisible()==false) {
	            	   btn2.setText(btn3.getText());
	               btn3.setVisible(false);
	               btn2.setVisible(true);
	               }
				
				if(btn6.isVisible()==false) {
		               btn6.setText(btn3.getText());
		               btn3.setVisible(false);
		               btn6.setVisible(true);
		               }
				 if(btn1.getText()=="1"&& btn2.getText()=="2"&&btn3.getText()=="3"&&btn4.getText()=="4"&&btn5.getText()=="5"&&btn6.getText()=="6"&&btn7.getText()=="7"&&btn8.getText()=="8"&&btn9.isVisible()==false)
					{
				    	int input = JOptionPane.showConfirmDialog(null,
				                "Felicidades Juego terminado", "Puzzle", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
				       
				        System.out.println(input);
					}
			
			}
		});
		btn3.setBackground(Color.WHITE);
		btn3.setForeground(Color.BLACK);
		btn3.setBounds(158, 11, 56, 52);
		contentPane.add(btn3);
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
               if(btn8.isVisible()==false) {
            	   btn8.setText(btn7.getText());
               btn7.setVisible(false);
               btn8.setVisible(true);
               }
               
               if(btn4.isVisible()==false) {
            	   btn4.setText(btn7.getText());
               btn7.setVisible(false);
               btn4.setVisible(true);
               }
               if(btn1.getText()=="1"&& btn2.getText()=="2"&&btn3.getText()=="3"&&btn4.getText()=="4"&&btn5.getText()=="5"&&btn6.getText()=="6"&&btn7.getText()=="7"&&btn8.getText()=="8"&&btn9.isVisible()==false)
   			{
   		    	int input = JOptionPane.showConfirmDialog(null,
   		                "Felicidades Juego terminado", "Puzzle", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
   		       
   		        System.out.println(input);
   			}
			}
		});
		btn7.setBackground(Color.WHITE);
		btn7.setForeground(Color.BLACK);
		btn7.setBounds(26, 137, 56, 47);
		contentPane.add(btn7);
		
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
//				btn8.setVisible(false);
	//			btn9.setText(btn8.getText());
		//		btn9.setVisible(true);
				
				if(btn9.isVisible()==false)
				{
					btn9.setText(btn8.getText());
					btn8.setVisible(false);
					btn9.setVisible(true);
				}
				if(btn7.isVisible()==false) 
				{	
				btn7.setText(btn8.getText());
				btn8.setVisible(false);
				btn7.setVisible(true);
				}
			if(btn5.isVisible()==false) 
				{	
				btn5.setText(btn8.getText());
				btn8.setVisible(false);
				btn5.setVisible(true);
				}
			 if(btn1.getText()=="1"&& btn2.getText()=="2"&&btn3.getText()=="3"&&btn4.getText()=="4"&&btn5.getText()=="5"&&btn6.getText()=="6"&&btn7.getText()=="7"&&btn8.getText()=="8"&&btn9.isVisible()==false)
				{
			    	int input = JOptionPane.showConfirmDialog(null,
			                "Felicidades Juego terminado", "Puzzle", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
			       
			        System.out.println(input);
				}
			}
			});
		
		btn8.setBackground(Color.WHITE);
		btn8.setForeground(Color.BLACK);
		btn8.setBounds(92, 137, 56, 47);
		contentPane.add(btn8);
		
		
		
		
	
		btn6.addActionListener(new ActionListener()
		
		{
			
			public void actionPerformed(ActionEvent e) 
			{
				
				if(btn9.isVisible()==false) {
	               btn9.setText(btn6.getText());
	               btn6.setVisible(false);
	               btn9.setVisible(true);
	               }
				if(btn3.isVisible()==false) {
		               btn3.setText(btn6.getText());
		               btn6.setVisible(false);
		               btn3.setVisible(true);
		               }
				
				if(btn5.isVisible()==false) {
		               btn5.setText(btn6.getText());
		               btn6.setVisible(false);
		               btn5.setVisible(true);
		               }
				 if(btn1.getText()=="1"&& btn2.getText()=="2"&&btn3.getText()=="3"&&btn4.getText()=="4"&&btn5.getText()=="5"&&btn6.getText()=="6"&&btn7.getText()=="7"&&btn8.getText()=="8"&&btn9.isVisible()==false)
					{
				    	int input = JOptionPane.showConfirmDialog(null,
				                "Felicidades Juego terminado", "Puzzle", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
				       
				        System.out.println(input);
					}
				
			}
		});
		btn6.setBackground(Color.WHITE);
		btn6.setForeground(Color.BLACK);
		btn6.setBounds(158, 74, 56, 50);
		
		contentPane.add(btn6);
		
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(btn6.isVisible()==false) {
		               btn6.setText(btn5.getText());
		               btn5.setVisible(false);
		               btn6.setVisible(true);
		              }
				if(btn4.isVisible()==false) {
		               btn4.setText(btn5.getText());
		               btn5.setVisible(false);
		               btn4.setVisible(true);
		              }
				if(btn2.isVisible()==false) {
		               btn2.setText(btn5.getText());
		               btn5.setVisible(false);
		               btn2.setVisible(true);
		              }
				if(btn8.isVisible()==false) {
		               btn8.setText(btn5.getText());
		               btn5.setVisible(false);
		               btn8.setVisible(true);
		              }
			}
			
		});
		btn5.setBackground(Color.WHITE);
		btn5.setForeground(Color.BLACK);
		btn5.setBounds(92, 74, 56, 50);
		contentPane.add(btn5);
		
		
		btn9.setVisible(false);
		
		btn9.addActionListener(new ActionListener() 
		
		{
		
			public void actionPerformed(ActionEvent e) 
			{
			if(btn6.isVisible()==false) 
			{	
			btn6.setText(btn9.getText());
			btn9.setVisible(false);
			btn6.setVisible(true);
			}
		    if(btn8.isVisible()==false){
		    	btn8.setText(btn9.getText());
		    	btn9.setVisible(false);
		    	btn8.setVisible(true);
		    }
			
		    if(btn1.getText()=="1"&& btn2.getText()=="2"&&btn3.getText()=="3"&&btn4.getText()=="4"&&btn5.getText()=="5"&&btn6.getText()=="6"&&btn7.getText()=="7"&&btn8.getText()=="8"&&btn9.isVisible()==false)
			{
		    	int input = JOptionPane.showConfirmDialog(null,
		                "Felicidades Juego terminado!!!", "Puzzle", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
		       
		        System.out.println(input);
			}
			}
			
		});
		btn9.setBackground(Color.WHITE);
		btn9.setBounds(158, 137, 56, 47);
		contentPane.add(btn9);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
