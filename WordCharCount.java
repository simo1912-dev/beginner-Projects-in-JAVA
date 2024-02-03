package Contapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;





public class WordCharCount extends JFrame implements ActionListener{
	
	JLabel lb1, lb2;
	JTextArea ta;
	JButton b;
	JButton pad,text;
	
	WordCharCount(){
		
		super("Char Word Count Tool");
		// Initializing all the previously declared variables 
		// so throught the constructor is mostly formatting and instantiation, no logic and functionalities involved yet
		lb1 = new JLabel();
		lb1.setBounds(50,50,100,20);
		lb2=new JLabel("Words: ");
		lb2.setBounds(50,80,100,20);
		
		ta= new JTextArea();
		// to enable Scrolling if the inputte dText is too large then we should add the JScrollPane function to allow it
		JScrollPane sp=new JScrollPane(ta);
		
		sp.setBounds(50,110,300,200);
		
		b=new JButton("Count");
		b.setBounds(50,320,80,30);
		b.addActionListener(this);
		// through the line statement we are saying that the class will handle the button click events
		
		pad=new JButton("Pad Color");
		pad.setBounds(140,320,80,30);
		pad.addActionListener(this);
		
		text=new JButton("Text Color");
		text.setBounds(260,320,110,30);
		text.addActionListener(this);
		
		add(lb1);add(lb2);add(sp);add(b);add(pad);add(text);
		
		setSize(400,400); // to set the Layout size 
		setLayout(null); // turn off the layout manager to controll manually the positioning of the components
		setVisible(true);
		
		
		
	}
	
	
	
	



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// here starts the logic part of my code and the events handling of the buttons defined previously in the constr
		//Logic: if the button b is  clicked then I will store the ta input in text and count the chars land display them in lb1
		
		if(e.getSource()== b) {
			String text = ta.getText();
			lb1.setText("Characters: "+text.length());
			// then I will define an array to store the words I have split with the delimiter space
			// and afterwards give the count of those words in lb2
			
			String words[] =text.split("\\s");
			lb2.setText("Words: "+words.length);
			
		} else if (e.getSource() == pad ) {
			Color c=JColorChooser.showDialog(this, "Choose Color", Color.BLACK);
			ta.setBackground(c);
		} else if (e.getSource() == text ) {
			Color c=JColorChooser.showDialog(this, "Choose Color", Color.BLACK);
			ta.setForeground(c);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WordCharCount();

	}

}
