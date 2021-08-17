import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class ULogin extends JFrame{

ImageIcon background_image,background_img;
JLabel background,title,uname,pwd,backg;
JPanel heading,login;
JTextField username;
JPasswordField password;
JButton lg,back,reg;

	ULogin()
	{
		//font
		Font f = new Font("Algerian",Font.BOLD,40);
		Font f1 = new Font("Serif",Font.BOLD,25);
		//set background to frame
		background_image = new ImageIcon("images/us1.jpg");
		
		//to resize background image
		Image img =background_image.getImage();
		Image temp_img=img.getScaledInstance(450,600,Image.SCALE_SMOOTH);
		background_image=new ImageIcon(temp_img);
		background=new JLabel("",background_image,JLabel.LEFT);

		// add background image
		background.setBounds(0,0,450,600);
		add(background);


		
		title=new JLabel("User Login",JLabel.CENTER);
		//set bounds left,top,width,height
		title.setBounds(30,10,400,50);		
		title.setFont(f);

		title.setForeground(new Color(0, 0, 102));
	   	
	   
		//add header on background
		background.add(title);


		//login panel
		login =new JPanel();
		login.setLayout(null);
		login.setSize(400,350);
        login.setBackground(new Color(0,0,0,70));
        login.setBounds(25,220,400,330);


      
        background.add(login);


        //creating username and password input fields
        uname=new JLabel("Username :");
        uname.setBounds(10,60,200,25);
        uname.setFont(f1);
        uname.setForeground(new Color(0, 0, 102));
	   	
	   

        username=new JTextField();
        username.setBounds(170,50,200,50);
        username.setBackground(new Color(169, 232, 229));
        username.setFont(f1);
        login.add(uname);
        login.add(username);


        pwd = new JLabel("Password :");
        pwd.setBounds(10,160,200,25);
        pwd.setFont(f1);
        pwd.setForeground(new Color(0, 0, 102));
	   	
	   

        password=new JPasswordField();
        password.setBounds(170,150,200,50);
        password.setBackground(new Color(169, 232, 229));
        password.setFont(f1);
        login.add(pwd);
        login.add(password);

        //Buttons


lg = new JButton("Login");
back = new JButton("Back");
lg.setBounds(40,250,150,50);
back.setBounds(210,250,150,50);
lg.setBackground(new Color(128, 0, 0));
back.setBackground(new Color(128, 0, 0));

lg.setForeground(new Color(255,255,255));
back.setForeground(new Color(255,255,255));

lg.setFont(f1);
back.setFont(f1);

login.add(lg);
login.add(back);


background_img = new ImageIcon("images/bg8.jpg");
		
		//to resize background image
		Image i =background_img.getImage();
		Image temp=i.getScaledInstance(450,600,Image.SCALE_SMOOTH);
		background_img=new ImageIcon(temp);
		backg=new JLabel("",background_img,JLabel.RIGHT);

		// add background image
		backg.setBounds(0,200,400,500);
		add(backg);

reg = new JButton(" Click Here ");
reg.setBounds(600,400,250,50);
reg.setForeground(new Color(255,255,255));
reg.setBackground(new Color(128, 0, 0));
reg.setFont(f1);
backg.add(reg);


ActionListener a1 = (ae) ->{Home a = new Home();dispose();};
back.addActionListener(a1);

ActionListener a2 = (ae) ->{ 



try{
String email = username.getText();

String pwd = password.getText();



if (email.length()<1)
	throw new Exception("Enter Email");

else if(pwd.length()<1)
	throw new Exception("Enter Password");

else
{
	new HbBuserL(email,pwd);

	username.setText("");
	password.setText("");
	dispose();	
}

}
catch(Exception e)
{
	JOptionPane.showMessageDialog(login,e,"Alert",JOptionPane.WARNING_MESSAGE);

}



};
lg.addActionListener(a2);



ActionListener a3 = (ae) ->{ USignup a = new USignup();dispose();};
reg.addActionListener(a3);




		// for visibility of GUI
		setSize(900,600);
		setTitle("Blood Bank Management System/User_Login");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
	/*
 public static void main(String[] args) {

 	ULogin a = new ULogin();
		
	}

*/
}
