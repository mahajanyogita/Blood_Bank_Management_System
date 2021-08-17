
//import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

class HbOrgL{

HbOrgL(String email, String password) {
	
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;


	try{
		s = sf.openSession();
		System.out.println("open");
		
		t=s.beginTransaction();		

		Organization o = (Organization)s.get(Organization.class,email);


		if(o !=null){
		
		String password1=o.getPassword();
		System.out.println(password);
		if(password.equals(password1))
		{
			JOptionPane.showMessageDialog(new JDialog(),"Logged In Successfully");
			new Menu().Menu_all("Organization",email);

			

		}
		else{
			JOptionPane.showMessageDialog(new JDialog(),"Incorrect Password","Alert",JOptionPane.WARNING_MESSAGE);
			new OLogin();

		}

		
	}
	
		
		else{
			
			System.out.println(email +" does not exists");
			JOptionPane.showMessageDialog(new JDialog(),"Invalid Email","Alert",JOptionPane.WARNING_MESSAGE);
			new OLogin();
		}


		t.commit();
	//	System.out.println("Record Inserted");
		
	}
	catch(Exception e){
		System.out.println("issue "+e);
		JOptionPane.showMessageDialog(new JDialog(),e,"Errorr",JOptionPane.ERROR_MESSAGE);
		new OLogin();
		t.rollback();
	}
	finally{
		s.close();
		System.out.println("close");
	}
}
}

