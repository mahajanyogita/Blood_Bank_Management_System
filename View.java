
//import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.ArrayList;
class View{

public static ArrayList<String> ViewD() {
	
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;

	ArrayList<String> data = new ArrayList<String>();

	try{
		s = sf.openSession();
		System.out.println("open");
		
		t=s.beginTransaction();		

		String hql = "FROM Donor";
		Query query = s.createQuery(hql);
	
	data.clear();
	 List results = query.list();

	 new ArrayList<String>(results);
		for (int i = 0; i < results.size(); i++) {
  
            // Print all elements of List
            System.out.println(results.get(i));
            data.add(results.get(i).toString());


        }
	

		t.commit();
	
		
	}
	catch(Exception e){
		System.out.println("issue "+e);
		JOptionPane.showMessageDialog(new JDialog(),"Sorry! Error Occured","Error",JOptionPane.ERROR_MESSAGE);
	
		t.rollback();
	}
	finally{
		s.close();
		System.out.println("close");
		
	}
	return data;


}


public static ArrayList<String> ViewO() {
	
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;

	ArrayList<String> data = new ArrayList<String>();

	try{
		s = sf.openSession();
		System.out.println("open");
		
		t=s.beginTransaction();		

		String hql = "FROM Organization";
		Query query = s.createQuery(hql);
	data.clear();
	 List results = query.list();

	 new ArrayList<String>(results);
		for (int i = 0; i < results.size(); i++) {
  
            // Print all elements of List
            System.out.println(results.get(i));
            data.add(results.get(i).toString());


        }
	

		t.commit();
	
		
	}
	catch(Exception e){
		System.out.println("issue "+e);
		JOptionPane.showMessageDialog(new JDialog(),"Sorry! Error Occured","Error",JOptionPane.ERROR_MESSAGE);
	
		t.rollback();
	}
	finally{
		s.close();
		System.out.println("close");
		
	}
	return data;


}


public static ArrayList<String> ViewU() {
	
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;

	ArrayList<String> data = new ArrayList<String>();

	try{
		s = sf.openSession();
		System.out.println("open");
		
		t=s.beginTransaction();		

		String hql = "FROM Buser";
		Query query = s.createQuery(hql);
	data.clear();
	 List results = query.list();

	 new ArrayList<String>(results);
		for (int i = 0; i < results.size(); i++) {
  
            // Print all elements of List
            System.out.println(results.get(i));
            data.add(results.get(i).toString());


        }
	

		t.commit();
	
		
	}
	catch(Exception e){
		System.out.println("issue "+e);
		JOptionPane.showMessageDialog(new JDialog(),"Sorry! Error Occured","Error",JOptionPane.ERROR_MESSAGE);
	
		t.rollback();
	}
	finally{
		s.close();
		System.out.println("close");
		
	}
	return data;


}


public static ArrayList<String> ViewH() {
	
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;

	ArrayList<String> data = new ArrayList<String>();

	try{
		s = sf.openSession();
		System.out.println("open");
		
		t=s.beginTransaction();		

		String hql = "FROM Hospital";
		Query query = s.createQuery(hql);
	data.clear();
	 List results = query.list();

	 new ArrayList<String>(results);
		for (int i = 0; i < results.size(); i++) {
  
            // Print all elements of List
            System.out.println(results.get(i));
            data.add(results.get(i).toString());


        }
	

		t.commit();
	
		
	}
	catch(Exception e){
		System.out.println("issue "+e);
		JOptionPane.showMessageDialog(new JDialog(),"Sorry! Error Occured","Error",JOptionPane.ERROR_MESSAGE);
	
		t.rollback();
	}
	finally{
		s.close();
		System.out.println("close");
		
	}
	return data;


}




public static String Search(String em,String tbl) {
	
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;
String result="";
try{


		s = sf.openSession();
		System.out.println("open");
		
		t=s.beginTransaction();		


if(tbl=="UserV")
{
		Buser us = (Buser)s.get(Buser.class,em);
		if(us !=null){

			result ="Name\tEmail Id\tPhone\tCity\tState\n\n";

					
	 result= result + us.toString();					
					}
		
		else{
			
			System.out.println(em +" does not exists");
			JOptionPane.showMessageDialog(new JDialog(),"Email Does Not Exists","Alert",JOptionPane.WARNING_MESSAGE);
		}

		t.commit();
	}


if(tbl=="HospV")
{
		Hospital us = (Hospital)s.get(Hospital.class,em);
		if(us !=null){

		result ="Name\tEmail Id\tPhone\tCity\tState\tA +ve\tA -ve\tB +ve\tB -ve\tAB +ve\tAB -ve\tO +ve\tO -ve\n\n";

					
	 result= result + us.toString();
						
					}
		
		else{
			
			System.out.println(em +" does not exists");
			JOptionPane.showMessageDialog(new JDialog(),"Email Does Not Exists","Alert",JOptionPane.WARNING_MESSAGE);
			}

		t.commit();
	}




if(tbl=="OrgV")
{
		Organization us = (Organization)s.get(Organization.class,em);
		if(us !=null){

			result ="Name\tEmail Id\tPhone\tCity\tState\tA +ve\tA -ve\tB +ve\tB -ve\tAB +ve\tAB -ve\tO +ve\tO -ve\n\n";

					
	 result= result + us.toString();						
					}
		
		else{
			
			System.out.println(em +" does not exists");
			JOptionPane.showMessageDialog(new JDialog(),"Email Does Not Exists","Alert",JOptionPane.WARNING_MESSAGE);
	
		}

		t.commit();
	}



if(tbl=="DonorV")
{
		Donor us = (Donor)s.get(Donor.class,em);
		if(us !=null){

			result ="First Name\tLast Name\tEmail Id\tPhone\tCity\tState\tGender\tAge\tBlood Group\n\n";

					
 result= result + us.toString();						
					}
		
		else{
			
			System.out.println(em +" does not exists");
		JOptionPane.showMessageDialog(new JDialog(),"Email Does Not Exists","Alert",JOptionPane.WARNING_MESSAGE);
	
		    }

		t.commit();
}


	//	System.out.println("Record Inserted");
		
	}
	catch(Exception e){
		System.out.println("issue "+e);
		t.rollback();
	}
	finally{
		s.close();
		System.out.println("close");
	}
	return result;


}


public static void Delete(String em, String tbl) {


Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;


		
	try{
		s = sf.openSession();
		System.out.println("open");
		
		

  if(tbl == "UserV")
  {
  	t=s.beginTransaction();		
		Buser us = (Buser)s.get(Buser.class,em);
		if(us !=null){

		s.delete(us);
		t.commit();
		System.out.println("Record Deleted");			
		JOptionPane.showMessageDialog(new JDialog(),"Record Deleted");

				}
		
		else{
			
			System.out.println(em+" does not exists");
		JOptionPane.showMessageDialog(new JDialog(),"Email Does Not Exists","Alert",JOptionPane.WARNING_MESSAGE);
	
		}

		t.commit();
	}

	if(tbl == "DonorV")
  {
  	t=s.beginTransaction();		
		Donor us = (Donor)s.get(Donor.class,em);

		if(us !=null){

		s.delete(us);
		t.commit();
		System.out.println("Record Deleted");			
		JOptionPane.showMessageDialog(new JDialog(),"Record Deleted");

				}
		
		else{
			
			System.out.println(em+" does not exists");
			JOptionPane.showMessageDialog(new JDialog(),"Email Does Not Exists","Alert",JOptionPane.WARNING_MESSAGE);
		}

		t.commit();
	}

if(tbl == "OrgV")
  {
  	t=s.beginTransaction();		
		Organization us = (Organization)s.get(Organization.class,em);

		if(us !=null){

		s.delete(us);
	//	t.commit();
		System.out.println("Record Deleted");			
		JOptionPane.showMessageDialog(new JDialog(),"Record Deleted");

				}
		
		else{
			
			System.out.println(em+" does not exists");
			
			JOptionPane.showMessageDialog(new JDialog(),"Email Does Not Exists","Alert",JOptionPane.WARNING_MESSAGE);
	
		}

		t.commit();
	}

if(tbl == "HospV")
  {
  	t=s.beginTransaction();		
		Hospital us = (Hospital)s.get(Hospital.class,em);
	
		if(us !=null){

		s.delete(us);
	//	t.commit();
		System.out.println("Record Deleted");			
		JOptionPane.showMessageDialog(new JDialog(),"Record Deleted");

				}
		
		else{
			
			System.out.println(em+" does not exists");
			JOptionPane.showMessageDialog(new JDialog(),"Email Does Not Exists","Alert",JOptionPane.WARNING_MESSAGE);
	
		}

		t.commit();
	}








	//	System.out.println("Record Inserted");
		
	}
	catch(Exception e){

		System.out.println("issue "+e);
		JOptionPane.showMessageDialog(new JDialog(),"Sorry! Error Occured","Error",JOptionPane.ERROR_MESSAGE);
	
		t.rollback();
	}

	finally{

		s.close();
		System.out.println("close");
	}


}









////search by location////







public static ArrayList<String> Search_by_loc(String loc,String tbl) {
	
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;
ArrayList<String> data = new ArrayList<String>();

try{


		s = sf.openSession();
		System.out.println("open");
		
		t=s.beginTransaction();		


if(tbl=="UserV")
{

String hql = "FROM Buser WHERE city = '"+loc+"'";
Query query = s.createQuery(hql);
List results = query.list();


 new ArrayList<String>(results);
		for (int i = 0; i < results.size(); i++) {
  
            
            System.out.println(results.get(i));
            data.add(results.get(i).toString());


        }
	



	}


if(tbl=="HospV")
{
	String hql = "FROM Hospital WHERE city = '"+loc+"'";
Query query = s.createQuery(hql);
List results = query.list();


 new ArrayList<String>(results);
		for (int i = 0; i < results.size(); i++) {
  
            
            System.out.println(results.get(i));
            data.add(results.get(i).toString());


        }
	
	
	}




if(tbl=="OrgV")
{

	String hql = "FROM Organization WHERE city =  '"+loc+"'";
Query query = s.createQuery(hql);
List results = query.list();


 new ArrayList<String>(results);
		for (int i = 0; i < results.size(); i++) {
  
            
            System.out.println(results.get(i));
            data.add(results.get(i).toString());


        }
	
	
	}



if(tbl=="DonorV")
{
	String hql = "FROM Donor WHERE city =  '"+loc+"'";
	Query query = s.createQuery(hql);
	List results = query.list();


 new ArrayList<String>(results);
		for (int i = 0; i < results.size(); i++) {
  
            
            System.out.println(results.get(i));
            data.add(results.get(i).toString());


        }
	
}


	//	System.out.println("Record Inserted");
		
	}
	catch(Exception e){
		System.out.println("issue "+e);
		JOptionPane.showMessageDialog(new JDialog(),"Sorry! Error Occured","Error",JOptionPane.ERROR_MESSAGE);
	
		t.rollback();
	}
	finally{
		s.close();
		System.out.println("close");
	}
	return data;


}








}

