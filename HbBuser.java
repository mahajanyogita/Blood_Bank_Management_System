
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;

class HbBuser{

HbBuser(String name, String email, String password,String city,String state) {
	
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;


	try{
		s = sf.openSession();
		System.out.println("open");
		
		t=s.beginTransaction();
		Long phone = null;

	
		Buser bu = new Buser(name,email,password,city,state,phone);
		s.save(bu);
		
		t.commit();
		System.out.println("Record Inserted");
		JOptionPane.showMessageDialog(new JDialog(),"Registration  Successful");
		new ULogin();


	}
	catch(Exception e){
		System.out.println("issue "+e);
		JOptionPane.showMessageDialog(new JDialog(),"Sorry!Error Occured","Error",JOptionPane.ERROR_MESSAGE);
		new USignup();
		t.rollback();
	}
}
}
