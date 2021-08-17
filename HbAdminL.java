
//import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

class HbAdminL{

HbAdminL(String email, String password) {
	
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;


	try{
		s = sf.openSession();
		System.out.println("open");
		
		t=s.beginTransaction();		

		Admin ad = (Admin)s.get(Admin.class,email);


		if(ad !=null){
		
		String password1=ad.getPassword();
		System.out.println(password);
		if(password.equals(password1))
		{
			JOptionPane.showMessageDialog(new JDialog(),"Logged In Successfully");
			new Menu().Menu_all("Admin",email);
			

		}
		else{
			JOptionPane.showMessageDialog(new JDialog(),"Incorrect Password","Error",JOptionPane.ERROR_MESSAGE);
			new ALogin();

		}

		
	}
	
		
		else{
			
			System.out.println(email +" does not exists");
			JOptionPane.showMessageDialog(new JDialog(),"Invalid Email","Error",JOptionPane.ERROR_MESSAGE);
			ALogin a = new ALogin();
		}


		t.commit();
	//	System.out.println("Record Inserted");
		
	}
	catch(Exception e){
		System.out.println("issue "+e);
		JOptionPane.showMessageDialog(new JDialog(),"Sorry! Error in Login","Error",JOptionPane.ERROR_MESSAGE);
		ALogin a = new ALogin();
		t.rollback();
	}
	finally{
		s.close();
		System.out.println("close");
	}
}
}

