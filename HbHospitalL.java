
//import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

class HbHospitalL{

HbHospitalL(String email, String password) {
	
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;


	try{
		s = sf.openSession();
		System.out.println("open");
		
		t=s.beginTransaction();		

		Hospital h = (Hospital)s.get(Hospital.class,email);


		if(h !=null){
		
		String password1=h.getPassword();
		System.out.println(password);
		if(password.equals(password1))
		{
			JOptionPane.showMessageDialog(new JDialog(),"Logged In Successfully");
			new Menu().Menu_all("Hospital",email);
			

		}
		else{
			JOptionPane.showMessageDialog(new JDialog(),"Incorrect Password","Alert",JOptionPane.WARNING_MESSAGE);
		new HLogin();
		}

		
	}
	
		
		else{
			
			System.out.println(email +" does not exists");
			JOptionPane.showMessageDialog(new JDialog(),"Invalid Email","Alert",JOptionPane.WARNING_MESSAGE);
			new HLogin();
		}


		t.commit();
	//	System.out.println("Record Inserted");
		
	}
	catch(Exception e){
		System.out.println("issue "+e);
		JOptionPane.showMessageDialog(new JDialog(),"Invalid Email","Error",JOptionPane.ERROR_MESSAGE);
		t.rollback();
		new HLogin();
	}
	finally{
		s.close();
		System.out.println("close");
	}
}
}

