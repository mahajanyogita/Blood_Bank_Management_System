import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.regex.*;



import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

class Profile_change_hsp extends JFrame{

ImageIcon background_image,back_img;
JLabel background,title,uname,pwd,cpwd,backg,email,phone,state,city,bld_bags,ap,an,bp,bn,op,on,abp,abn;
JPanel heading,left,right;
JTextField username,emt,pht,statet,cityt,apt,ant,bpt,bnt,opt,ont,abpt,abnt;
JPasswordField password,cpassword;
JButton lg,back,reg;


//////////////////////  -------------------- database part ------------------------////////////////////////






	Profile_change_hsp(String user,String emailv)
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

        Hospital hsp = (Hospital)s.get(Hospital.class,emailv);
    
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
        uname=new JLabel("Hospital Name :");
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

        bld_bags = new JLabel("Blood Bags Available");
        bld_bags.setBounds(300,120,500,50);
        bld_bags.setFont(f1);
        bld_bags.setForeground(new Color(255,255,255));
	   	backg.add(bld_bags);
	

//A+
        ap = new JLabel("A +   :");
        ap.setBounds(50,170,80,25);
        ap.setFont(f1);
        ap.setForeground(new Color(255,255,255));
	   	
	   

        apt=new JTextField();
        apt.setBounds(140,170,50,30);
        apt.setBackground(new Color(169, 232, 229));
        apt.setFont(f1);
        backg.add(ap);
        backg.add(apt);


//A-
       an = new JLabel("A -   :");
        an.setBounds(250,170,80,25);
        an.setFont(f1);
        an.setForeground(new Color(255,255,255));
        
       

        ant=new JTextField();
        ant.setBounds(340,170,50,30);
        ant.setBackground(new Color(169, 232, 229));
        ant.setFont(f1);
        backg.add(an);
        backg.add(ant);


//B+
        bp  = new JLabel("B +   :");
        bp.setBounds(430,170,80,25);
        bp.setFont(f1);
        bp.setForeground(new Color(255,255,255));
        
       

        bpt=new JTextField();
        bpt.setBounds(520,170,50,30);
        bpt.setBackground(new Color(169, 232, 229));
        bpt.setFont(f1);
        backg.add(bp);
        backg.add(bpt);

//B-
       bn = new JLabel("B -   :");
        bn.setBounds(620,170,80,25);
        bn.setFont(f1);
        bn.setForeground(new Color(255,255,255));
        
       

        bnt=new JTextField();
        bnt.setBounds(710,170,50,30);
        bnt.setBackground(new Color(169, 232, 229));
        bnt.setFont(f1);
        backg.add(bn);
        backg.add(bnt);



//O+
        op = new JLabel("O +   :");
        op.setBounds(50,220,80,25);
        op.setFont(f1);
        op.setForeground(new Color(255,255,255));
        
       

        opt=new JTextField();
        opt.setBounds(140,220,50,30);
        opt.setBackground(new Color(169, 232, 229));
        opt.setFont(f1);
        backg.add(op);
        backg.add(opt);


//O-
       on = new JLabel("O -   :");
        on.setBounds(250,220,80,25);
        on.setFont(f1);
        on.setForeground(new Color(255,255,255));
        
       

        ont=new JTextField();
        ont.setBounds(340,220,50,30);
        ont.setBackground(new Color(169, 232, 229));
        ont.setFont(f1);
        backg.add(on);
        backg.add(ont);


//AB+
        abp  = new JLabel("AB +  :");
        abp.setBounds(430,220,80,25);
        abp.setFont(f1);
        abp.setForeground(new Color(255,255,255));
        
       

        abpt=new JTextField();
        abpt.setBounds(520,220,50,30);
        abpt.setBackground(new Color(169, 232, 229));
        abpt.setFont(f1);
        backg.add(abp);
        backg.add(abpt);

//AB-
        abn = new JLabel("AB -   :");
        abn.setBounds(620,220,80,25);
        abn.setFont(f1);
        abn.setForeground(new Color(255,255,255));
        
        abnt=new JTextField();
        abnt.setBounds(710,220,50,30);
        abnt.setBackground(new Color(169, 232, 229));
        abnt.setFont(f1);
        backg.add(abn);
        backg.add(abnt);

//phone

        phone = new JLabel("Contact No. :");
        phone.setBounds(50,280,300,25);
        phone.setFont(f1);
        phone.setForeground(new Color(255,255,255));
	   	  backg.add(phone);

	    pht=new JTextField();
        pht.setBounds(300,280,400,30);
        pht.setBackground(new Color(169, 232, 229));
        pht.setFont(f1);
      
        backg.add(pht);

//city
        
        city = new JLabel("City :");
        city.setBounds(50,320,300,25);
        city.setFont(f1);
        city.setForeground(new Color(255,255,255));
	   	
	    cityt=new JTextField();
        cityt.setBounds(300,320,400,30);
        cityt.setBackground(new Color(169, 232, 229));
        cityt.setFont(f1);
        backg.add(city);
        backg.add(cityt);

//state
        state = new JLabel("State :");
        state.setBounds(50,360,300,25);
        state.setFont(f1);
        state.setForeground(new Color(255,255,255));
	   	
	   

        statet=new JTextField();
        statet.setBounds(300,360,400,30);
        statet.setBackground(new Color(169, 232, 229));
        statet.setFont(f1);
        backg.add(state);
        backg.add(statet);

        //Buttons


lg = new JButton("Save");
back = new JButton("Back");
lg.setBounds(230,400,150,50);
back.setBounds(410,400,150,50);
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

apt.setText(String.valueOf(hsp.getAp()));
ant.setText(String.valueOf(hsp.getAn()));
bpt.setText(String.valueOf(hsp.getBp()));
bnt.setText(String.valueOf(hsp.getBn()));
opt.setText(String.valueOf(hsp.getOpb()));
ont.setText(String.valueOf(hsp.getOnb()));
abpt.setText(String.valueOf(hsp.getAbp()));
abnt.setText(String.valueOf(hsp.getAbn()));
















		


ActionListener a1 = (ae) ->{ new Menu().Menu_all(user,emailv);dispose();};
back.addActionListener(a1);

ActionListener a2 = (ae) ->{ 
try{
String name = username.getText();
String email = emt.getText();
Long pn=Long.parseLong(pht.getText());
String st=statet.getText();
String ct=cityt.getText();

int ap =Integer.parseInt(apt.getText());
int an =Integer.parseInt(ant.getText());


int bp =Integer.parseInt(bpt.getText());
int bn =Integer.parseInt(bnt.getText());

int abp =Integer.parseInt(abpt.getText());
int abn =Integer.parseInt(abnt.getText());

int opb =Integer.parseInt(opt.getText());
int onb =Integer.parseInt(ont.getText());



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
   save_prof.save_profile_hsp(name,email,emailv,pn,st,ct,ap,an,bp,bn,opb,onb,abp,abn);


   
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
		setTitle("Blood Bank Management System/Hospital_profile");
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


