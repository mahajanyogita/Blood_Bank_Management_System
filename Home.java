import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Home extends JFrame{

ImageIcon background_image;
JLabel background,title;
JButton dlogin,ulogin,alogin,org_login,hsp_login;
JPanel panel,home,heading;

	Home(){

		home =new JPanel();
		home.setLayout(null);		
        home.setBackground(new Color(117, 12, 12));
        home.setBounds(0,0,900,600);      
        add(home);

		//font
		Font f = new Font("Serif",Font.BOLD+Font.ITALIC,30);
		Font f1 = new Font("Algerian",Font.BOLD+Font.ITALIC,35);

		title=new JLabel("Blood Bank Management System",JLabel.CENTER);
		//set bounds left,top,width,height
		title.setBounds(100,20,700,40);		
		title.setFont(f1);
		title.setForeground(new Color(255,255,255));
	   	
		home.add(title);
	

	
		//set background to frame
		background_image = new ImageIcon("images/bg18.png");
		
		//to resize background image
		Image img =background_image.getImage();
		Image temp_img=img.getScaledInstance(520,450,Image.SCALE_SMOOTH);
		background_image=new ImageIcon(temp_img);
		background=new JLabel("",background_image,JLabel.LEFT);

		// add background image
		background.setBounds(350,27,600,590);
		home.add(background);



		//adding buttons
		alogin=new JButton("Admin Login");
		alogin.setBounds(25,100,300,50);
	

		dlogin=new JButton("Donor Login");
		dlogin.setBounds(25,200,300,50);
		

		ulogin=new JButton("User Login");
		ulogin.setBounds(25,300,300,50);


		org_login=new JButton("Organization Login");
		org_login.setBounds(25,400,300,50);


		hsp_login=new JButton("Hospital Login");
		hsp_login.setBounds(25,500,300,50);

	
		alogin.setFont(f);
	
		dlogin.setFont(f);
		org_login.setFont(f);
		ulogin.setFont(f);
		hsp_login.setFont(f);


		home.add(alogin);		
		home.add(dlogin);
		home.add(ulogin);
		home.add(org_login);		
		home.add(hsp_login);


ActionListener a1 = (ae) ->{ALogin a = new ALogin();dispose();};
alogin.addActionListener(a1);


ActionListener a2 = (ae) ->{DLogin a = new DLogin();dispose();};
dlogin.addActionListener(a2);


ActionListener a3 = (ae) ->{ULogin a = new ULogin();dispose();};
ulogin.addActionListener(a3);


ActionListener a4 = (ae) ->{OLogin a = new OLogin();dispose();};
org_login.addActionListener(a4);


ActionListener a5 = (ae) ->{HLogin a = new HLogin();dispose();};
hsp_login.addActionListener(a5);


		setTitle("Blood Bank Management System/Home Page");
		setSize(900,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
