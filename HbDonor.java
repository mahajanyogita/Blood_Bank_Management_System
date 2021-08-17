
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;

class HbDonor{

HbDonor(String fname, String lname,String email,Long phone,String password, String state,String city,int age ,String blood_grp,String gender) {

Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;

	try{
		s = sf.openSession();
		System.out.println("open");
		
		t=s.beginTransaction();
		

		Donor d = new Donor(fname,lname,email,phone,password,state,city,age,blood_grp,gender);
		s.save(d);
		
		t.commit();
		System.out.println("Record Inserted");
		JOptionPane.showMessageDialog(new JDialog()," Thank You! Registered Successfully");
		DLogin dl = new DLogin();
		

	}
	catch(Exception e){
		System.out.println("issue "+e);
		JOptionPane.showMessageDialog(new JDialog(),"Some Error In Registration Try again","Error",JOptionPane.ERROR_MESSAGE);

		t.rollback();
		new DSignup();

	}

	finally{
		s.close();
		System.out.println("close");
	}

}
}
