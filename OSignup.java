import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.regex.*;



class OSignup extends JFrame{

ImageIcon background_image,back_img;
JLabel background,title,uname,pwd,cpwd,backg,email,phone,state,city;
JPanel heading,left,right;
JTextField username,emt,pht,statet,cityt;
JPasswordField password,cpassword;
JButton lg,back,reg;

	OSignup()
	{
		//font
		Font f = new Font("Algerian",Font.BOLD,40);
		Font f1 = new Font("Serif",Font.BOLD,22);
		//set background to frame


			//login panel
		left =new JPanel();
		left.setLayout(null);
		left.setSize(300,600);
        left.setBackground(new Color(250,250,250));
        left.setBounds(0,0,300,600);
		add(left);



		background_image = new ImageIcon("images/bg22.png");
		
		//to resize background image
		Image img =background_image.getImage();
		Image temp_img=img.getScaledInstance(250,250,Image.SCALE_SMOOTH);
		background_image=new ImageIcon(temp_img);
		background=new JLabel("",background_image,JLabel.LEFT);

		// add background image
		background.setBounds(0,0,250,600);
		left.add(background);


		
		title=new JLabel("Organization Registration",JLabel.CENTER);
		//set bounds left,top,width,height
		title.setBounds(250,0,600,50);		
		title.setFont(f);

		title.setForeground(new Color(255,0,0));

	   
		//add header on background
		left.add(title);

		back_img = new ImageIcon("images/bg17.jpg");
		
		//to resize background image
		Image i =back_img.getImage();
		Image temp=i.getScaledInstance(600,500,Image.SCALE_SMOOTH);
		back_img=new ImageIcon(temp);
		backg=new JLabel("",back_img,JLabel.RIGHT);

		// add background image
		backg.setBounds(150,50,700,450);
		left.add(backg);



		    //creating username and password input fields
        uname=new JLabel("Organization Name :");
        uname.setBounds(150,30,200,25);
        uname.setFont(f1);
        uname.setForeground(new Color(255,255,255));
	   	
	   

        username=new JTextField();
        username.setBounds(400,30,200,30);
        username.setBackground(new Color(169, 232, 229));
        username.setFont(f1);
        backg.add(uname);
        backg.add(username);

  		email=new JLabel("Email :");
        email.setBounds(150,70,200,25);
        email.setFont(f1);
        email.setForeground(new Color(255,255,255));
	   	
	   

        emt=new JTextField();
        emt.setBounds(550,120,200,30);
        emt.setBackground(new Color(169, 232, 229));
        emt.setFont(f1);		
        backg.add(email);
        left.add(emt);

        pwd = new JLabel("Password :");
        pwd.setBounds(150,110,200,25);
        pwd.setFont(f1);
        pwd.setForeground(new Color(255,255,255));
	   	
	   

        password=new JPasswordField();
        password.setBounds(550,160,200,30);
        password.setBackground(new Color(169, 232, 229));
        password.setFont(f1);
        backg.add(pwd);
        left.add(password);


//confirm password
        cpwd = new JLabel("Confirm Password :");
        cpwd.setBounds(150,150,300,25);
        cpwd.setFont(f1);
        cpwd.setForeground(new Color(255,255,255));
	   	
	   

        cpassword=new JPasswordField();
        cpassword.setBounds(550,200,200,30);
        cpassword.setBackground(new Color(169, 232, 229));
        cpassword.setFont(f1);
        backg.add(cpwd);
        left.add(cpassword);


//phone
        phone = new JLabel("Contact No. :");
        phone.setBounds(150,190,300,25);
        phone.setFont(f1);
        phone.setForeground(new Color(255,255,255));
	   	
	   

        pht=new JTextField();
        pht.setBounds(550,240,200,30);
        pht.setBackground(new Color(169, 232, 229));
        pht.setFont(f1);
        backg.add(phone);
        left.add(pht);


//city
        city = new JLabel("City :");
        city.setBounds(150,230,300,25);
        city.setFont(f1);
        city.setForeground(new Color(255,255,255));
	   	
	   

        cityt=new JTextField();
        cityt.setBounds(550,280,200,30);
        cityt.setBackground(new Color(169, 232, 229));
        cityt.setFont(f1);
        backg.add(city);
        left.add(cityt);



//city
        state = new JLabel("State :");
        state.setBounds(150,270,300,25);
        state.setFont(f1);
        state.setForeground(new Color(255,255,255));
	   	
	   

        statet=new JTextField();
        statet.setBounds(550,320,200,30);
        statet.setBackground(new Color(169, 232, 229));
        statet.setFont(f1);
        backg.add(state);
        left.add(statet);

        //Buttons


lg = new JButton("Register");
back = new JButton("Back");
lg.setBounds(230,350,150,50);
back.setBounds(410,350,150,50);
lg.setForeground(new Color(128, 0, 0));
back.setForeground(new Color(128, 0, 0));

lg.setBackground(new Color(255,255,255));
back.setBackground(new Color(255,255,255));

lg.setFont(f1);
back.setFont(f1);

backg.add(lg);
backg.add(back);


		


ActionListener a1 = (ae) ->{ALogin a = new ALogin();dispose();};
back.addActionListener(a1);

ActionListener a2 = (ae) ->{ 
try{
String name = username.getText();
String email = emt.getText();
String pwd = password.getText();
String cpwd = cpassword.getText();
Long pn=Long.parseLong(pht.getText());
String st=statet.getText();
String ct=cityt.getText();

validEmail();

if (name.length()<2)
	throw new Exception("Enter Valid Name");

else if (email.length()<2)
	throw new Exception("Enter Correct Email");

else if(pwd.length()<6)
	throw new Exception("Password Should be of min 6 characters");


else if (!pwd.equals(cpwd))
	throw new Exception("Password Mismatch");


else if(pn.toString().length()>10 | pn.toString().length()<0)
    throw new Exception("Enter Valid Phone No ");

else if (st.length()<2)
    throw new Exception("Enter Correct State");

else if (ct.length()<2)
    throw new Exception("Enter Correct city");



else
{
	new HbOrg(name,email,pn,pwd,st,ct);
    username.setText("");
    password.setText("");  
    emt.setText("");
    cityt.setText("");
    statet.setText("");
    pht.setText("");
   dispose(); 
}



}

catch(Exception e)
{
	JOptionPane.showMessageDialog(left,e,"Alert",JOptionPane.WARNING_MESSAGE);

}




};
lg.addActionListener(a2);


		// for visibility of GUI
		setSize(900,600);
		setTitle("Blood Bank Management System/Organization_Signup");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}


  public void validEmail() throws Exception
    {
         String email=emt.getText();

         Pattern pattern = Pattern.compile (

        "([a-zA-Z0-9_\\-\\.]+)@((\\[a-z]{1,3}\\.[a-z]"

       + "{1,3}\\.[a-z]{1,3}\\.)|(([a-zA-Z\\-]+\\.)+))"

       + "([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)",

         Pattern.MULTILINE);

      Matcher m=pattern.matcher(email);

     boolean b=m.matches();

     

      if(emt.getText().length()>0)

     {

       if(b==true)

           {

       System.out.println("Valid Email ID");
          }

       else

        {
			throw new Exception("Invalid Email");
        }

		}
      
    }
      




/*
public static void main(String[] args) {

 	OSignup a = new OSignup();
		
	}
*/

}


