import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.regex.*;



import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

class Profile_change_donor extends JFrame{

ImageIcon background_image,back_img;
JLabel background,title,fname,lname,pwd,cpwd,backg,email,phone,state,city,bld_grp,gender,age;
JPanel heading,left,right;
JTextField fnamet,lnamet,emt,pht,statet,cityt,apt,ant,bpt,bnt,opt,ont,abpt,abnt,aget;
JPasswordField password,cpassword;
JButton lg,back,reg;
JRadioButton male,female,other;

//////////////////////  -------------------- database part ------------------------////////////////////////






	Profile_change_donor(String user,String emailv)
	{
		//font


Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;


    try{
        s = sf.openSession();
        System.out.println("open");
        
        t=s.beginTransaction();     

        Donor dp = (Donor)s.get(Donor.class,emailv);
    
        t.commit();
    
        
    
  

           

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



				
		title=new JLabel("Profile");
		//set bounds left,top,width,height
		title.setBounds(350,0,600,50);		
		title.setFont(f);

		title.setForeground(new Color(77,0,77));

	   
		//add header on background
		left.add(title);

		back_img = new ImageIcon("images/bg17.jpg");
		
		//to resize background image
		Image i =back_img.getImage();
		Image temp=i.getScaledInstance(800,500,Image.SCALE_SMOOTH);
		back_img=new ImageIcon(temp);
		backg=new JLabel("",back_img,JLabel.RIGHT);

		// add background image
		backg.setBounds(50,25,800,540);
		left.add(backg);



		    //creating username and password input fields
        fname=new JLabel("First Name :");
        fname.setBounds(50,30,200,25);
        fname.setFont(f1);
        fname.setForeground(new Color(255,255,255));
	   	
	   

        fnamet=new JTextField();
       fnamet.setBounds(300,30,400,30);
       fnamet.setBackground(new Color(169, 232, 229));
       fnamet.setFont(f1);
        backg.add(fname);
        backg.add(fnamet);

        lname=new JLabel("Last Name :");
        lname.setBounds(50,80,200,25);
        lname.setFont(f1);
        lname.setForeground(new Color(255,255,255));
        
       

        lnamet=new JTextField();
        lnamet.setBounds(300,80,400,30);
        lnamet.setBackground(new Color(169, 232, 229));
        lnamet.setFont(f1);
        backg.add(lname);
        backg.add(lnamet);


  		email=new JLabel("Email :");
        email.setBounds(50,130,200,25);
        email.setFont(f1);
        email.setForeground(new Color(255,255,255));
	   	
	   

        emt=new JTextField();
        emt.setBounds(300,130,400,30);
        emt.setBackground(new Color(169, 232, 229));
        emt.setFont(f1);		
        backg.add(email);
        backg.add(emt);

  //age   

age=new JLabel("Age :   ");
age.setForeground(new Color(255,255,255));
age.setBounds(50,180,200,25);
aget = new JTextField(35);  //15 no. of columns in one row
aget.setBounds(300,180,220,30);
aget.setFont(f1);
age.setFont(f1);
backg.add(age);
backg.add(aget);


//Gender
gender=new JLabel("Gender : ");
male=new JRadioButton("Male");
female=new JRadioButton("Female");
other=new JRadioButton("Other");
gender.setForeground(new Color(255,255,255));
ButtonGroup bg=new ButtonGroup();   
bg.add(male);
bg.add(female); 
bg.add(other);

gender.setBounds(50,230,200,25);
male.setBounds(300,230,100,25);
female.setBounds(450,230,100,25);
other.setBounds(600,230,100,25);
gender.setFont(f1);
male.setFont(f1);
female.setFont(f1);  
other.setFont(f1);

backg.add(gender);
backg.add(male);
backg.add(female);
backg.add(other);


//Blood Group

bld_grp = new JLabel("Blood Group       ");
bld_grp.setForeground(new Color(255,255,255));
bld_grp.setBounds(50,280,200,25);

String s1[] = { "select","A+", "A-", "B+", "B-", "AB+","AB-","O+","O-" };
// create checkbox
JComboBox bld = new JComboBox(s1);
bld.setBounds(300,280,140,25);
bld.setFont(f1);
bld_grp.setFont(f1);
backg.add(bld_grp);
backg.add(bld);
//phone

        phone = new JLabel("Contact No. :");
        phone.setBounds(50,330,300,25);
        phone.setFont(f1);
        phone.setForeground(new Color(255,255,255));
	   	backg.add(phone);

	    pht=new JTextField();
        pht.setBounds(300,330,400,30);
        pht.setBackground(new Color(169, 232, 229));
        pht.setFont(f1);
      
        backg.add(pht);

//city
        
        city = new JLabel("City :");
        city.setBounds(50,380,300,25);
        city.setFont(f1);
        city.setForeground(new Color(255,255,255));
	   	
	    cityt=new JTextField();
        cityt.setBounds(300,380,400,30);
        cityt.setBackground(new Color(169, 232, 229));
        cityt.setFont(f1);
        backg.add(city);
        backg.add(cityt);

//state
        state = new JLabel("State :");
        state.setBounds(50,430,300,25);
        state.setFont(f1);
        state.setForeground(new Color(255,255,255));
	   	
	   

        statet=new JTextField();
        statet.setBounds(300,430,400,30);
        statet.setBackground(new Color(169, 232, 229));
        statet.setFont(f1);
        backg.add(state);
        backg.add(statet);

        //Buttons


lg = new JButton("Save");
back = new JButton("Back");
lg.setBounds(230,480,150,40);
back.setBounds(410,480,150,40);
lg.setForeground(new Color(128, 0, 0));
back.setForeground(new Color(128, 0, 0));

lg.setBackground(new Color(255,255,255));
back.setBackground(new Color(255,255,255));

lg.setFont(f1);
back.setFont(f1);

backg.add(lg);
backg.add(back);


//getting data from database


if(dp.getFname()!=null)
{
    fnamet.setText(dp.getFname());
}
if(dp.getLname()!=null)
{
    lnamet.setText(dp.getLname());
}


if(dp.getEmail()!=null)
{
    emt.setText(dp.getEmail());
}


if(dp.getPhone()!=null)
{
    pht.setText(String.valueOf(dp.getPhone()));
}


if(dp.getCity()!=null)
{
    cityt.setText(dp.getCity());
}


if(dp.getState()!=null)
{
   statet.setText(dp.getState());
}




if(dp.getAge()!=0)
{
  aget.setText(String.valueOf(dp.getAge()));
}


if(dp.getGender()!=null)
{
 String gn=dp.getGender();

System.out.println(gn);

  if(gn.equals("male"))
  {
      male.setSelected(true);
  }
  else if(gn.equals("female"))
  {
 female.setSelected(true);
  }
  else{
 other.setSelected(true);
  }

}


		


ActionListener a1 = (ae) ->{ new Menu().Menu_all(user,emailv);dispose();};
back.addActionListener(a1);

ActionListener a2 = (ae) ->{ 
try{
String fname = fnamet.getText();
String lname = lnamet.getText();
String email = emt.getText();
Long pn=Long.parseLong(pht.getText());
String st=statet.getText();
String ct=cityt.getText();


Integer ag = Integer.parseInt(aget.getText());
String bgs = bld.getSelectedItem().toString();

String gn="";



 if(male.isSelected())
    gn="male";
else if(female.isSelected())
    gn="female";
else if(other.isSelected())
    gn="other";
else
    throw new Exception("Please Select Gender ");

validEmail();

if (fname.length()<2 | lname.length()<2)
	throw new Exception("Enter Valid Name");

else if (email.length()<2)
	throw new Exception("Enter Correct Email");


else if(pn.toString().length()>10 | pn.toString().length()<0)
    throw new Exception("Enter Valid Phone No ");

else if (st.length()<2)
    throw new Exception("Enter Correct State");

else if (ct.length()<2)
    throw new Exception("Enter Correct city");



else if (ag < 18 | ag > 65)
    throw new Exception("You can't Donate Blood");

else if(bgs.equals("select"))
    throw new Exception("Select blood group");


else
{

    Save_profile save_prof = new Save_profile();
   save_prof.save_profile_donor(fname,lname,email,emailv,pn,st,ct,ag,bgs,gn);


   
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
		setTitle("Blood Bank Management System/Donor_profile");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);


}



 catch(Exception e){
        System.out.println("issue "+e);
        JOptionPane.showMessageDialog(left,e,"Error",JOptionPane.ERROR_MESSAGE);

        t.rollback();
    }
    finally{

     
        s.close();
        System.out.println("close");
    
    }


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

 	Profile_change a = new Profile_change("Hospital");
		
	}

*/
}


