
//import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

class HbBuserL{

HbBuserL(String email, String password) {
	
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;


	try{
		s = sf.openSession();
		System.out.println("open");
		
		t=s.beginTransaction();		

		Buser ad = (Buser)s.get(Buser.class,email);


		if(ad !=null){
		
		String password1=ad.getPassword();
		System.out.println(password);
		if(password.equals(password1))
		{
			JOptionPane.showMessageDialog(new JDialog(),"Logged In Successfully");
			String user ="User";
			new Menu().Menu_all(user,email);
			

		}
		else{
			JOptionPane.showMessageDialog(new JDialog(),"Incorrect Password","Alert",JOptionPane.WARNING_MESSAGE);
			new ULogin();
		}

		
	}
	
		
		else{
			
			System.out.println(email +" does not exists");
			JOptionPane.showMessageDialog(new JDialog(),"Invalid Email","Alert",JOptionPane.WARNING_MESSAGE);
			new ULogin();
		}


		t.commit();
	//	System.out.println("Record Inserted");
		
	}
	catch(Exception e){
		System.out.println("issue "+e);
			JOptionPane.showMessageDialog(new JDialog(),"Sorry!Error in Login","Alert",JOptionPane.WARNING_MESSAGE);

		t.rollback();
		new ULogin();
	}
}
}

