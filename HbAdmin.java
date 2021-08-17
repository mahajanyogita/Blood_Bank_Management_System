
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;

class HbAdmin{

HbAdmin(String name, String email, String password) {
	
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;


	try{
		s = sf.openSession();
		System.out.println("open");
		
		t=s.beginTransaction();
		

	
		Admin a = new Admin(name,email,password);
		s.save(a);
		
		t.commit();
		System.out.println("Record Inserted");
		JOptionPane.showMessageDialog(new JDialog(),"Congrats! Registration  Successful");
		new ALogin();

	}
	catch(Exception e){
		System.out.println("issue "+e);
		JOptionPane.showMessageDialog(new JDialog(),"Sorry! Error in Registration","Error",JOptionPane.ERROR_MESSAGE);
		new ASignup();
		t.rollback();
	}
	finally{
		s.close();
		System.out.println("close");
	}
}
}
