import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;
import java.io.*;


class calculator {
	
 	public calculator() {
		JFrame f;
		f = new JFrame("Calculator"); //Creating instance of JFrame, calculator window
		
		JTextField tf;
		tf = new JTextField(); //Creating calculator display
		tf.setBounds(0,0,400,100); // (x, y, width, height)
		f.add(tf); //Adding display
		

		//Creating JButton instances
		JButton zero = new JButton("0");
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton dot = new JButton(".");
		JButton equal = new JButton("=");
		JButton add = new JButton("+");
		JButton sub = new JButton("-");
		JButton multi = new JButton("*");
		JButton div = new JButton("/");
		JButton factorial = new JButton("!");
		JButton power = new JButton("^");
		JButton sqroot = new JButton("√");
		JButton ce = new JButton("CE");
		
		//Creating button size, layout
		zero.setBounds(100,260,100,40);
		one.setBounds(0,220,100,40);
		two.setBounds(100,220,100,40);
		three.setBounds(200,220,100,40);
		four.setBounds(0,180,100,40);
		five.setBounds(100,180,100,40);
		six.setBounds(200,180,100,40);
		seven.setBounds(0,140,100,40);
		eight.setBounds(100,140,100,40);
		nine.setBounds(200,140,100,40);
		dot.setBounds(0,260,100,40);
		equal.setBounds(200,260,100,40);
		add.setBounds(300,220,100,40);
		sub.setBounds(300,260,100,40);
		multi.setBounds(300,140,100,40);
		div.setBounds(300,180,100,40);
		factorial.setBounds(300,100,100,40);
		power.setBounds(200,100,100,40);
		sqroot.setBounds(100,100,100,40);
		ce.setBounds(0,100,100,40);
		
		//Adding button to JFrame
		f.add(zero);
		f.add(one);
		f.add(two);
		f.add(three);
		f.add(four);
		f.add(five);
		f.add(six);
		f.add(seven);
		f.add(eight);
		f.add(nine);
		f.add(dot);
		f.add(equal);
		f.add(add);
		f.add(sub);
		f.add(multi);
		f.add(div);
		f.add(factorial);
		f.add(power);
		f.add(sqroot);
		f.add(ce);
		
		// Has to be down here, otherwise loading is too slow
		f.setSize(400,320); // (width, height)
		f.setLayout(null); //Using no layout managers
		f.setVisible(true); //Making the frame visible
		
		// Textfield not editable 
		tf.setEditable(false);
		
		
		//Adding functions for buttons
		zero.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
			//System.out.print("0");
			tf.setText(tf.getText()+0);
		   }
		});
		
		one.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
			tf.setText(tf.getText()+1);
		   }
		});
		
		two.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
		        tf.setText(tf.getText()+2);
		   }
		});
		
		three.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
		        tf.setText(tf.getText()+3);
		   }
		});
		
		four.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
		        tf.setText(tf.getText()+4);
		   }
		});
		
		five.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
		        tf.setText(tf.getText()+5);
		   }
		});
		
		six.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
		        tf.setText(tf.getText()+6);
		   }
		});
		
		seven.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
		        tf.setText(tf.getText()+7);
		   }
		});
		
		eight.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
		        tf.setText(tf.getText()+8);
		   }
		});
		
		nine.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
		        tf.setText(tf.getText()+9);
		   }
		});
		
		dot.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
		        tf.setText(tf.getText()+".");
		   }
		});
		
		equal.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
		       tf.setText(tf.getText()+"=");
		   }
		});
		
		add.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
		        tf.setText(tf.getText()+"+");
		   }
		});
		
		sub.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
		        tf.setText(tf.getText()+"-");
		   }
		});
		
		multi.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
		        tf.setText(tf.getText()+"*");
		   }
		});
		
		div.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
		        tf.setText(tf.getText()+"/");
		   }
		});
		
		factorial.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
		        tf.setText(tf.getText()+"!");
		   }
		});
		
		power.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
		        tf.setText(tf.getText()+"^");
		   }
		});
		
		sqroot.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
		        tf.setText(tf.getText()+"√");
		   }
		});
		
		ce.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
		        tf.setText("");
		   }
		});
		
		
	} //End of Gui()

public static void main(String[] args) {
	new calculator();	
	}
} //End of program
