import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.regex.*;



import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

class Profile_change_user extends JFrame{

ImageIcon background_image,back_img;
JLabel background,title,uname,pwd,cpwd,backg,email,phone,state,city;
JPanel heading,left,right;
JTextField username,emt,pht,statet,cityt;
JPasswordField password,cpassword;
JButton lg,back,reg;


//////////////////////  -------------------- database part ------------------------////////////////////////






	Profile_change_user(String user,String emailv)
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

      Buser hsp = (Buser)s.get(Buser.class,emailv);
    
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
		title.setBounds(400,10,600,50);		
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
		backg.setBounds(50,50,800,500);
		left.add(backg);



		    //creating username and password input fields
        uname=new JLabel("Name :");
        uname.setBounds(50,30,200,25);
        uname.setFont(f1);
        uname.setForeground(new Color(255,255,255));
	   	
	   

        username=new JTextField();
        username.setBounds(300,30,400,30);
        username.setBackground(new Color(169, 232, 229));
        username.setFont(f1);
        backg.add(uname);
        backg.add(username);

  		email=new JLabel("Email :");
        email.setBounds(50,80,200,25);
        email.setFont(f1);
        email.setForeground(new Color(255,255,255));
	   	
	   

        emt=new JTextField();
        emt.setBounds(300,80,400,30);
        emt.setBackground(new Color(169, 232, 229));
        emt.setFont(f1);		
        backg.add(email);
        backg.add(emt);

      

//phone

        phone = new JLabel("Contact No. :");
        phone.setBounds(50,130,300,25);
        phone.setFont(f1);
        phone.setForeground(new Color(255,255,255));
	   	  backg.add(phone);

	    pht=new JTextField();
        pht.setBounds(300,130,400,30);
        pht.setBackground(new Color(169, 232, 229));
        pht.setFont(f1);
      
        backg.add(pht);

//city
        
        city = new JLabel("City :");
        city.setBounds(50,180,300,25);
        city.setFont(f1);
        city.setForeground(new Color(255,255,255));
	   	
	    cityt=new JTextField();
        cityt.setBounds(300,180,400,30);
        cityt.setBackground(new Color(169, 232, 229));
        cityt.setFont(f1);
        backg.add(city);
        backg.add(cityt);

//state
        state = new JLabel("State :");
        state.setBounds(50,230,300,25);
        state.setFont(f1);
        state.setForeground(new Color(255,255,255));
	   	
	   

        statet=new JTextField();
        statet.setBounds(300,230,400,30);
        statet.setBackground(new Color(169, 232, 229));
        statet.setFont(f1);
        backg.add(state);
        backg.add(statet);

        //Buttons


lg = new JButton("Save");
back = new JButton("Back");
lg.setBounds(230,300,150,50);
back.setBounds(410,300,150,50);
lg.setForeground(new Color(128, 0, 0));
back.setForeground(new Color(128, 0, 0));

lg.setBackground(new Color(255,255,255));
back.setBackground(new Color(255,255,255));

lg.setFont(f1);
back.setFont(f1);

backg.add(lg);
backg.add(back);


//getting data from database


if(hsp.getName()!=null)
{
    username.setText(hsp.getName());
}

if(hsp.getEmail()!=null)
{
    emt.setText(hsp.getEmail());
}


if(hsp.getPhone()!=null)
{
    pht.setText(String.valueOf(hsp.getPhone()));
}


if(hsp.getCity()!=null)
{
    cityt.setText(hsp.getCity());
}


if(hsp.getState()!=null)
{
   statet.setText(hsp.getState());
}




ActionListener a1 = (ae) ->{ new Menu().Menu_all(user,emailv);dispose();};
back.addActionListener(a1);

ActionListener a2 = (ae) ->{ 
try{
String name = username.getText();
String email = emt.getText();
Long pn=Long.parseLong(pht.getText());
String st=statet.getText();
String ct=cityt.getText();



validEmail();

if (name.length()<2)
	throw new Exception("Enter Valid Name");

else if (email.length()<2)
	throw new Exception("Enter Correct Email");


else if(pn.toString().length()>10 | pn.toString().length()<0)
    throw new Exception("Enter Valid Phone No ");

else if (st.length()<2)
    throw new Exception("Enter Correct State");

else if (ct.length()<2)
    throw new Exception("Enter Correct city");



else
{

    Save_profile save_prof = new Save_profile();
   save_prof.save_profile_user(name,email,emailv,pn,st,ct);


   
}



}

catch(Exception e)
{
	JOptionPane.showMessageDialog(left,e);

}




};
lg.addActionListener(a2);


		// for visibility of GUI
		setSize(900,600);
		setTitle("Blood Bank Management System/user profile");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);


}



 catch(Exception e){
        System.out.println("issue "+e);
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


