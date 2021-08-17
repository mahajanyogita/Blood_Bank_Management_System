
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;

class HbOrg{

HbOrg(String name,String email,Long phone,String password, String state,String city) {

Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;

	try{
		s = sf.openSession();
		System.out.println("open");
		
		t=s.beginTransaction();
		
			int ap=0;
			int an=0;
			int bp=0;
			int bn=0;
			int abp=0;
			int abn=0;
			int op=0;
			int on=0;

	
	
	Organization o = new Organization(name,email,phone,password,state,city,ap,an,bp,bn,abp,abn,op,on);
		s.save(o);
		
		t.commit();
		System.out.println("Record Inserted");
		JOptionPane.showMessageDialog(new JDialog()," Thank You! Registered Successfully");
		new OLogin();
		

	}
	catch(Exception e){
		System.out.println("issue "+e);
		JOptionPane.showMessageDialog(new JDialog(),"Some Error In Registration Try again","Error",JOptionPane.ERROR_MESSAGE);
		t.rollback();
		new OSignup();

	}

	finally{
		s.close();
		System.out.println("close");
	}

}
}
