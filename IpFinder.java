package IPFIND;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;


// !!!!Reminder Mohamed:warum bekomme ich nur die Exception UnkownHost gechatched?? Ich muss es noch recherchieren: 
//konnte bislang nichts dazu finden.(Gruppe Fragen).



public class IpFinder extends JFrame implements ActionListener{
	
	JLabel l;
	JTextField tf;
	JButton b;
	
	IpFinder(){
		super("IP Finder Tool");
		
		l=new JLabel("Enter the Website URL: ");
		l.setBounds(50,70,150,20);
		tf=new JTextField();
		tf.setBounds(50,100,200,20);
		
		b=new JButton("Find the IP");
		b.setBounds(100,150,80,30);
		b.addActionListener(this);
		
		add(l);add(tf);add(b);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
				
	}
	
	
	
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String url=tf.getText();
		
		try {
			// for this task we will use the getByname method from the InetAddress which helps us resolve the IP Address
			InetAddress ia=InetAddress.getByName(url);
			
			String ip=ia.getHostAddress(); // to get the IP address as a string
			JOptionPane.showMessageDialog(this,"IP of"+url+" is: "+ip);
			
		}catch (UnknownHostException e1) {
			JOptionPane.showMessageDialog(this, e1.toString());
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IpFinder();

		
	}


}
