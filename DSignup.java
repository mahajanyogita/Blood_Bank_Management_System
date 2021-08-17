import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.regex.*;

/*
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;
*/

class DSignup extends JFrame{

ImageIcon background_image;
JLabel background,title,fname,lname,email,contact,gender,bld_grp,password,cpassword,state,city,age;
JPanel heading,register;
JTextField fnamet,phone_no,lnamet,emailt,statet,cityt,aget;
JPasswordField passwordt,cpasswordt;
JRadioButton male,female,other;
JComboBox bld;
JButton save,back;

	DSignup()
	{
		//font
		Font f = new Font("Algerian",Font.BOLD+Font.ITALIC,40);
		Font form = new Font("Serif",Font.BOLD,17);
		//set background to frame
		background_image = new ImageIcon("images/bg5.jpg");
		
		//to resize background image
		Image img =background_image.getImage();
		Image temp_img=img.getScaledInstance(900,600,Image.SCALE_SMOOTH);
		background_image=new ImageIcon(temp_img);
		background=new JLabel("",background_image,JLabel.CENTER);

		// add background image
		background.setBounds(0,0,900,600);
		add(background);


		//set header  color(rgb,transparancy)
		heading = new JPanel();
		heading.setBackground(new Color(0,0,0,50));
		heading.setBounds(0,0,900,70);

		title=new JLabel("Donor Registrtion");
		//set bounds left,top,width,height
		title.setLayout(null);
		//title.setBounds(600,50,400,90);		
		title.setForeground(new Color(255,255,255));	
		title.setFont(f);		
		heading.add(title);
		


		//add header on background
		background.add(heading);


		//register panel
		register =new JPanel();
		register.setLayout(null);
		register.setSize(400,350);
        register.setBackground(new Color(0,0,0,80));
        register.setBounds(300,80,575,470);      
        background.add(register);


//first name
fname=new JLabel("First Name ");
fname.setForeground(new Color(255,255,255));
fname.setBounds(20,20,100,25);

fnamet = new JTextField(15);  //15 no of columns
fnamet.setBounds(170,20,120,25);


//last name
lname=new JLabel("Last Name ");
lname.setForeground(new Color(255,255,255));
lname.setBounds(320,20,90,25);

lnamet = new JTextField(15);  //15 no. of columns in one row
lnamet.setBounds(440,20,120,25);

//mobile no
contact=new JLabel("Mobile No      ");
contact.setForeground(new Color(255,255,255));
contact.setBounds(20,50,100,25);

phone_no = new JTextField(15);  //15 no. of columns in one row
phone_no.setBounds(170,50,150,25);


//Gender
gender=new JLabel("Gender         ");
male=new JRadioButton("Male");
female=new JRadioButton("Female");
other=new JRadioButton("Other");
gender.setForeground(new Color(255,255,255));
ButtonGroup bg=new ButtonGroup();   
bg.add(male);
bg.add(female); 

gender.setBounds(20,80,100,25);
male.setBounds(170,80,70,25);
female.setBounds(250,80,70,25);
other.setBounds(330,80,70,25);



//Blood Group

bld_grp = new JLabel("Blood Group       ");
bld_grp.setForeground(new Color(255,255,255));
bld_grp.setBounds(20,110,140,25);

String s1[] = { "select","A+", "A-", "B+", "B-", "AB+","AB-","O+","O-" };
// create checkbox
bld = new JComboBox(s1);
bld.setBounds(170,110,140,25);

//Email



email=new JLabel("Email            ");
email.setForeground(new Color(255,255,255));
email.setBounds(20,140,100,25);
emailt = new JTextField(35);  //15 no. of columns in one row
emailt.setBounds(170,140,220,25);


//password

password=new JLabel("Password   ");
password.setForeground(new Color(255,255,255));
password.setBounds(20,170,100,25);
passwordt=new JPasswordField(30);
passwordt.setBounds(170,170,220,25);


//confirm password

cpassword=new JLabel("Confirm Password ");
cpassword.setForeground(new Color(255,255,255));
cpassword.setBounds(20,200,150,25);
cpasswordt=new JPasswordField(30);
cpasswordt.setBounds(170,200,220,25);


//state


state=new JLabel("State          ");
state.setForeground(new Color(255,255,255));
state.setBounds(20,230,100,25);
statet = new JTextField(35);  //15 no. of columns in one row
statet.setBounds(170,230,220,25);

//city


city=new JLabel("City            ");
city.setForeground(new Color(255,255,255));
city.setBounds(20,260,100,25);
cityt = new JTextField(35);  //15 no. of columns in one row
cityt.setBounds(170,260,220,25);

//city


age=new JLabel("Age            ");
age.setForeground(new Color(255,255,255));
age.setBounds(20,290,100,25);
aget = new JTextField(35);  //15 no. of columns in one row
aget.setBounds(170,290,220,25);


//set font

fname.setFont(form);
fnamet.setFont(form);
lname.setFont(form);
lnamet.setFont(form);
contact.setFont(form);
phone_no.setFont(form);
gender.setFont(form);
bld_grp.setFont(form);
bld.setFont(form);
email.setFont(form);
emailt.setFont(form);
password.setFont(form);
cpassword.setFont(form);
state.setFont(form);
statet.setFont(form);
city.setFont(form);
cityt.setFont(form);
age.setFont(form);
aget.setFont(form);

//add all to register panel
register.add(fname);
register.add(fnamet);
register.add(lname);
register.add(lnamet);
register.add(contact);
register.add(phone_no);
register.add(gender);
register.add(bld_grp);
register.add(bld);
register.add(male);
register.add(female);
register.add(other);
register.add(email);
register.add(emailt);
register.add(password);
register.add(passwordt);
register.add(cpassword);
register.add(cpasswordt);
register.add(state);
register.add(statet);
register.add(city);
register.add(cityt);
register.add(age);
register.add(aget);



//Save and Back Buttons


save = new JButton("Save");
back = new JButton("Back");
save.setBounds(40,350,200,50);
back.setBounds(340,350,200,50);
save.setBackground(new Color(255,255,255));
back.setBackground(new Color(255,255,255));

save.setFont(f);
back.setFont(f);

register.add(save);
register.add(back);





ActionListener a1 = (ae) ->{DLogin dl = new DLogin();dispose();};
back.addActionListener(a1);

ActionListener a2 = (ae) ->{

try{
String fn = fnamet.getText();
String ln = lnamet.getText();
Long pn=Long.parseLong(phone_no.getText());

String pawd=passwordt.getText();
String cpawd=cpasswordt.getText();
String em= emailt.getText();
validEmail();
String st=statet.getText();
String ct=cityt.getText();
Integer ag = Integer.parseInt(aget.getText());
String bgs = bld.getSelectedItem().toString();

String gn="";


if (fn.length()<2)
	throw new Exception("First Name Length should be min 2");

else if (ln.length()<2)
	throw new Exception("Last Name Length should be min 2");

else if(pn.toString().length()>10 | pn.toString().length()<0)
	throw new Exception("Enter Valid Phone No ");


else if(pawd.length()<6)
	throw new Exception("Password Should be of min 6 characters");

else if (!pawd.equals(cpawd))
	throw new Exception("Password Mismatch");

else if (st.length()<2)
	throw new Exception("Enter Correct State");

else if (ct.length()<2)
	throw new Exception("Enter Correct city");


else if (ag < 18 | ag > 65)
	throw new Exception("You can't Donate Blood");

else if(bgs.equals("select"))
	throw new Exception("Select blood group");

else{

if(male.isSelected())
	gn="male";
else if(female.isSelected())
	gn="female";
else if(other.isSelected())
	gn="other";
else
	throw new Exception("Please Select Gender ");
}

	new HbDonor(fn,ln,em,pn,pawd,st,ct,ag,bgs,gn);
	fnamet.setText("");
	lnamet.setText("");
	passwordt.setText("");
	cpasswordt.setText("");
	emailt.setText("");
	cityt.setText("");
	statet.setText("");
	phone_no.setText("");
	aget.setText("");
	dispose();	



}
catch(NumberFormatException e)
{
	JOptionPane.showMessageDialog(register,"Enter Only Integers","Alert",JOptionPane.WARNING_MESSAGE);
}
catch(Exception e)
{
	JOptionPane.showMessageDialog(register,e,"Error",JOptionPane.ERROR_MESSAGE);

}

};

save.addActionListener(a2);



		// for visibility of GUI
		setSize(900,600);
		setTitle("Blood Bank Management System/Donor_register");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

}

  public void validEmail() throws Exception
    {
         String email=emailt.getText();

         Pattern pattern = Pattern.compile (

        "([a-zA-Z0-9_\\-\\.]+)@((\\[a-z]{1,3}\\.[a-z]"

       + "{1,3}\\.[a-z]{1,3}\\.)|(([a-zA-Z\\-]+\\.)+))"

       + "([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)",

         Pattern.MULTILINE);

      Matcher m=pattern.matcher(email);

     boolean b=m.matches();

     

      if(emailt.getText().length()>0)

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
public static void main(String args[])
	{
		DSignup l = new DSignup();
	}

*/
}




