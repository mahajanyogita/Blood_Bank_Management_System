

import javax.swing.*;
import java.awt.event.*;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;
import java.util.*;
//charts files for piechart


import org.jfree.data.general.*; //DefaultPiedataset
import org.jfree.chart.*;



class  Chart_data{
DefaultPieDataset ds = new DefaultPieDataset();
public DefaultPieDataset get_data() {


Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;

	try{
		s = sf.openSession();
		System.out.println("open");
		List stu = new ArrayList<>();
	stu = s.createQuery("from Buser").list();
		int users=stu.size();
	 stu = new ArrayList<>();
	stu = s.createQuery("from Donor").list();
		int donors=stu.size();
	stu = new ArrayList<>();
	stu = s.createQuery("from Hospital").list();
		int hosps=stu.size();
	stu = new ArrayList<>();
	stu = s.createQuery("from Organization").list();
		int orgs=stu.size();
		
		System.out.println(donors);


ds.setValue("Users",users);
ds.setValue("Donors",donors);
ds.setValue("Hospitals",hosps);
ds.setValue("Organizations",orgs);



	}

	catch(Exception e){
		System.out.println("issue "+e);
		
	}
	finally{
		s.close();
		System.out.println("close");
	}
return ds;
}


/*
public static void main(String args[])
{
Chart_data m = new Chart_data();


}
*/
}
