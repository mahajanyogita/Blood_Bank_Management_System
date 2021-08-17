import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



class Menu extends JFrame{


ImageIcon background_image;
JLabel background,title;
JButton ddetail,hdetail,odetail,udetail;
JPanel panel,home,heading;


	public void Menu_all(String user,String email){


		home =new JPanel();
		home.setLayout(null);		
        home.setBackground(new Color(117, 12, 12));
        home.setBounds(0,0,900,600);      
        add(home);

		//font
		Font f = new Font("Serif",Font.BOLD+Font.ITALIC,30);
		Font f1 = new Font("Algerian",Font.BOLD+Font.ITALIC,35);

	
	
      



		title=new JLabel("View Details");
		//set bounds left,top,width,height
		title.setBounds(50,30,500,40);		
		title.setFont(f1);
		title.setForeground(new Color(255,255,255));
	   	
		home.add(title);


if(user.equals("Admin"))
{
JButton pass = new JButton("Change Password");
      	pass.setBounds(350,10,320,50);
      	pass.setFont(f);
      	home.add(pass);


      ActionListener a7 = (ae) ->{

Password_change_admin a = new Password_change_admin(email);dispose();


      };
      pass.addActionListener(a7);


}
else{
	JButton profile = new JButton("profile");
      	profile.setBounds(500,10,150,50);
      	profile.setFont(f);
      	home.add(profile);



      	ActionListener a6 = (ae) ->{

if(user.equals("Hospital"))
{
	
	Profile_change_hsp a = new Profile_change_hsp(user,email);dispose();

}
if(user.equals("Organization"))
{
	Profile_change_org a = new Profile_change_org(user,email);dispose();
}
if(user.equals("User"))
{
	Profile_change_user a = new Profile_change_user(user,email);dispose();
}
if(user.equals("Donor"))
{
	Profile_change_donor a = new Profile_change_donor(user,email);dispose();
}


};
	
profile.addActionListener(a6);


}

	
		JButton logout = new JButton("Logout");
      	logout.setBounds(700,10,150,50);
      	logout.setFont(f);
      	home.add(logout);
	
		//set background to frame
		background_image = new ImageIcon("images/s1.png");
		
		//to resize background image
		Image img =background_image.getImage();
		Image temp_img=img.getScaledInstance(520,450,Image.SCALE_SMOOTH);
		background_image=new ImageIcon(temp_img);
		background=new JLabel("",background_image,JLabel.LEFT);

		background.setBounds(350,27,600,590);
		home.add(background);



		//adding buttons
		ddetail=new JButton("Donors");
		ddetail.setBounds(25,400,300,50);

			
		if(! user.equals("User"))
		{

		udetail=new JButton("Users");
		udetail.setBounds(25,500,300,50);
		udetail.setFont(f);
		home.add(udetail);


String see ="UserV";
ActionListener a3 = (ae) ->{Details_view a = new Details_view(user,see,email);dispose();};
udetail.addActionListener(a3);

		}
		

		odetail=new JButton("Organizations");
		odetail.setBounds(25,300,300,50);


		hdetail=new JButton("Hospitals");
		hdetail.setBounds(25,200,300,50);


		JButton analysis = new JButton("Analysis");
		analysis.setBounds(25,100,300,50);
		
		ddetail.setFont(f);
		odetail.setFont(f);	
		hdetail.setFont(f);
		analysis.setFont(f);
	
		home.add(ddetail);	
		home.add(odetail);		
		home.add(hdetail);	
		home.add(analysis);	



ActionListener a8 = (ae) ->{

	new Show_chart(user,email);dispose();

};


analysis.addActionListener(a8);


ActionListener a4 = (ae) ->{

String see ="OrgV";
	Details_view a = new Details_view(user,see,email);dispose();};
odetail.addActionListener(a4);


ActionListener a5 = (ae) ->{
	String see ="HospV";
	Details_view a = new Details_view(user,see,email);dispose();};

hdetail.addActionListener(a5);


ActionListener a1 = (ae) ->{

	String see ="DonorV";
	Details_view d = new Details_view(user,see,email);dispose();};



ddetail.addActionListener(a1);




ActionListener a2 = (ae) ->{

	if(user.equals("User"))
	{

		ULogin a = new ULogin();
		dispose();
	}

	else if(user.equals("Admin"))
	{
		ALogin a = new ALogin();
		dispose();
	}
	else if(user.equals("Donor"))
	{
		DLogin a = new DLogin();
		dispose();
	}
	else if(user.equals("Hospital"))
	{
		HLogin a = new HLogin();
		dispose();
	}
	else if(user.equals("Organization"))
	{
		OLogin a = new OLogin();
		dispose();
	}
	else{
		Home a = new Home();
		dispose();	
	}

};


logout.addActionListener(a2);




		setTitle("Blood Bank Management System/Menu Page");
		setSize(900,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	/*

 public static void main(String[] args) {

 	Menu a = new Menu();
		
	}

	*/

	
}
