import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;
import java.time.*; 


class MainPage extends JFrame{


ImageIcon background_image;
JLabel background,title;
JButton b1,b2;
JPanel panel,home,heading;
Image img,temp_img;

	MainPage(){


		home =new JPanel();
		home.setLayout(null);		
        home.setBackground(new Color(117, 12, 12));
        home.setBounds(0,0,900,600);      
        add(home);

		//font
		Font f = new Font("Arial",Font.BOLD+Font.ITALIC,25);
		Font f1 = new Font("Algerian",Font.BOLD+Font.ITALIC,35);

	


		title=new JLabel("Blood Bank Management System",JLabel.CENTER);
		JLabel title2=new JLabel("Welcome To",JLabel.CENTER);
		//set bounds left,top,width,height
		title.setBounds(120,100,700,40);		
		title.setFont(f1);
		title.setForeground(new Color(255,255,255));
		title2.setBounds(120,70,700,40);		
		title2.setFont(f1);
		title2.setForeground(new Color(255,255,255));
	   	home.add(title2);
		home.add(title);
	

	
		//set background to frame
		background_image = new ImageIcon("images/bg3.jpg");
		
		//to resize background image
		img =background_image.getImage();
		temp_img=img.getScaledInstance(790,350,Image.SCALE_SMOOTH);
		background_image=new ImageIcon(temp_img);
		background=new JLabel("",background_image,JLabel.LEFT);

		// add background image
		background.setBounds(50,100,790,490);
		home.add(background);


Date d = new Date();

DateFormat df = DateFormat.getDateInstance();
String s1 =df.format(d);



DateFormat tf = DateFormat.getTimeInstance();
String s2 =tf.format(d);



JLabel date=new JLabel(s1,JLabel.LEFT);
		//set bounds left,top,width,height
	date.setBounds(0,20,200,40);		
	date.setFont(f);
	date.setForeground(new Color(66, 245, 224));
	   	
	home.add(date);
	
JLabel time=new JLabel(s2,JLabel.LEFT);
		//set bounds left,top,width,height
	time.setBounds(160,20,200,40);		
	time.setFont(f);
	time.setForeground(new Color(66, 245, 224));
	   	
	home.add(time);
	
		JButton login=new JButton("Explore");
		login.setBounds(700,20,150,40);
		login.setFont(f);
		home.add(login);
	
ActionListener a1 = (ae) ->{Home h = new Home();dispose();};
login.addActionListener(a1);


		setTitle("Blood Bank Management System/Welcome !!!");
		setSize(900,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}



/*

public static void main(String args[])
{

MainPage m = new MainPage();


}

*/


}
