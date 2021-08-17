 
//import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

class Save_profile{

public void save_profile_hsp(String name,String email,String emailv,Long pn,String st,String ct,int ap,int an,int bp,int bn,int opb,int onb,int abp,int abn) {
    
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;


    try{
        s = sf.openSession();
        System.out.println("open");
        
        t=s.beginTransaction();     

          Hospital hsp = (Hospital)s.get(Hospital.class,emailv);

 hsp.setName(name);
    hsp.setEmail(email);
    hsp.setPhone(pn);
    hsp.setState(st);
    hsp.setCity(ct);
    hsp.setAp(ap);
    hsp.setAn(an);
    hsp.setBp(bp);
    hsp.setBn(bn);
    hsp.setAbp(abp);
    hsp.setAbn(abn);
    hsp.setOpb(opb);
    hsp.setOnb(onb);
    JOptionPane.showMessageDialog(new JDialog(),"Profile Saved Successfully");


  
        t.commit();
    //  System.out.println("Record Inserted");
        
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





public void save_profile_user(String name,String email,String emailv,Long pn,String st,String ct) {
    
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;


    try{
        s = sf.openSession();
        System.out.println("open");
        
        t=s.beginTransaction();     

          Buser hsp = (Buser)s.get(Buser.class,emailv);

 hsp.setName(name);
    hsp.setEmail(email);
    hsp.setPhone(pn);
    hsp.setState(st);
    hsp.setCity(ct);

    JOptionPane.showMessageDialog(new JDialog(),"Profile Saved Successfully");


  
        t.commit();
    //  System.out.println("Record Inserted");
        
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





public void save_profile_org(String name,String email,String emailv,Long pn,String st,String ct,int ap,int an,int bp,int bn,int opb,int onb,int abp,int abn) {
    
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;


    try{
        s = sf.openSession();
        System.out.println("open");
        
        t=s.beginTransaction();     

   Organization hsp = (Organization)s.get(Organization.class,emailv);

 hsp.setName(name);
    hsp.setEmail(email);
    hsp.setPhone(pn);
    hsp.setState(st);
    hsp.setCity(ct);
    hsp.setAp(ap);
    hsp.setAn(an);
    hsp.setBp(bp);
    hsp.setBn(bn);
    hsp.setAbp(abp);
    hsp.setAbn(abn);
    hsp.setOpb(opb);
    hsp.setOnb(onb);
    JOptionPane.showMessageDialog(new JDialog(),"Profile Saved Successfully");


  
        t.commit();
    //  System.out.println("Record Inserted");
        
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



public void save_profile_donor(String fname,String lname,String email,String emailv,Long pn,String st,String ct,int age,String bld_grp,String gender) {
    
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;


    try{
        s = sf.openSession();
        System.out.println("open");
        
        t=s.beginTransaction();     

   Donor dp = (Donor)s.get(Donor.class,emailv);

    dp.setFname(fname);
    dp.setLname(lname);
    dp.setEmail(email);
    dp.setPhone(pn);
    dp.setState(st);
    dp.setCity(ct);
    dp.setGender(gender);
    dp.setAge(age);
    dp.setBlood_grp(bld_grp);
   
    JOptionPane.showMessageDialog(new JDialog(),"Profile Saved Successfully");


  
        t.commit();
    //  System.out.println("Record Inserted");
        
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



public void save_profile_admin(String email,String password) {
    
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;
Transaction t = null;


    try{
        s = sf.openSession();
        System.out.println("open");
        
        t=s.beginTransaction();     

   Admin a = (Admin)s.get(Admin.class,email);

    a.setPassword(password);
   
    JOptionPane.showMessageDialog(new JDialog(),"password Changed Successfully");

    t.commit();
    //  System.out.println("Record Inserted");
        
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


}








