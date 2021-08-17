import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.regex.*;



class Password_change_admin extends JFrame{

ImageIcon background_image,back_img;
JLabel background,title,uname,pwd,cpwd,backg,email;
JPanel heading,left,right;
JTextField username,emt;
JPasswordField password,cpassword;
JButton lg,back,reg;

	Password_change_admin(String email)
	{
		//font
		Font f = new Font("Algerian",Font.BOLD,40);
		Font f1 = new Font("Serif",Font.BOLD,25);
		//set background to frame


	//login panel
		left =new JPanel();
		left.setLayout(null);
		left.setSize(300,600);
        left.setBackground(new Color(250,250,250));
        left.setBounds(0,0,300,600);
		add(left);



				
		title=new JLabel("Change Password");
		//set bounds left,top,width,height
		title.setBounds(300,0,600,50);		
		title.setFont(f);

		title.setForeground(new Color(77, 0, 77));

	   
		//add header on background
		left.add(title);

		back_img = new ImageIcon("images/bg17.jpg");
		
		//to resize background image
		Image i =back_img.getImage();
		Image temp=i.getScaledInstance(800,500,Image.SCALE_SMOOTH);
		back_img=new ImageIcon(temp);
		backg=new JLabel("",back_img,JLabel.RIGHT);

		// add background image
		backg.setBounds(50,50,800,500);
		left.add(backg);

	

        pwd = new JLabel("Password :");
        pwd.setBounds(150,100,200,50);
        pwd.setFont(f1);
        pwd.setForeground(new Color(255,255,255));
	   	
	   

        password=new JPasswordField();
        password.setBounds(500,100,200,50);
        password.setBackground(new Color(169, 232, 229));
        password.setFont(f1);
       backg.add(pwd);
        backg.add(password);


//confirm password
        cpwd = new JLabel("Confirm Password :");
        cpwd.setBounds(150,250,300,50);
        cpwd.setFont(f1);
        cpwd.setForeground(new Color(255,255,255));
	   	
	   

        cpassword=new JPasswordField();
        cpassword.setBounds(500,250,200,50);
        cpassword.setBackground(new Color(169, 232, 229));
        cpassword.setFont(f1);
        backg.add(cpwd);
        backg.add(cpassword);

        //Buttons


lg = new JButton("Save");
back = new JButton("Back");
lg.setBounds(230,350,150,50);
back.setBounds(410,350,150,50);
lg.setForeground(new Color(77, 0, 77));
back.setForeground(new Color(77, 0, 77));

lg.setBackground(new Color(255,255,255));
back.setBackground(new Color(255,255,255));

lg.setFont(f1);
back.setFont(f1);

backg.add(lg);
backg.add(back);


		


ActionListener a1 = (ae) ->{


new Menu().Menu_all("Admin",email);dispose();


};
back.addActionListener(a1);

ActionListener a2 = (ae) ->{ 
try{

String pwd = password.getText();
String cpwd = cpassword.getText();




if(pwd.length()<6)
	throw new Exception("Password Should be of min 6 characters");

else if (!pwd.equals(cpwd))
	throw new Exception("Password Mismatch");

else
{
	
    Save_profile save_prof = new Save_profile();
    save_prof.save_profile_admin(email,pwd);

	password.setText("");
	cpassword.setText("");


new Menu().Menu_all("Admin",email);
}



}
catch(Exception e)
{
	JOptionPane.showMessageDialog(left,e,"Error",JOptionPane.ERROR_MESSAGE);

}




};
lg.addActionListener(a2);


		// for visibility of GUI
		setSize(900,600);
		setTitle("Blood Bank Management System/Password_change_admin");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}



/*
public static void main(String[] args) {

 	ASignup a = new ASignup();
		
	}
*/

}


