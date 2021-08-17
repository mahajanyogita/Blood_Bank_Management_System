

import javax.swing.*;
import java.awt.event.*;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;
import java.util.*;
//charts files for piechart


import org.jfree.data.general.*; //DefaultPiedataset
import org.jfree.chart.*;

import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*;
import org.jfree.chart.renderer.category.BarRenderer;
import java.awt.Color;

class Blood_bags 
{

DefaultCategoryDataset ds = new DefaultCategoryDataset();



public DefaultCategoryDataset get_data() {


DefaultCategoryDataset ds = new DefaultCategoryDataset();


Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory sf = cfg.buildSessionFactory();
Session s = null;

	try{
		  int apc,anc,bpc,bnc,abpc,abnc,opc,onc;
    apc=anc=bpc=bnc=abpc=abnc=opc=onc=0;

		s = sf.openSession();
		System.out.println("open");
	List<Donor> donor = new ArrayList<>();
    donor  = s.createQuery("from Donor").list();
    String bg="";
  
	for(Donor d: donor)
		bg = d.getBlood_grp();
		if(bg == "A+")
			apc++;
		else if(bg == "A-")
			anc++;
		else if(bg == "A-")
			anc++;
		else if(bg == "B+")
			bpc++;
		else if(bg == "B-")
			bnc++;
		else if(bg == "AB+")
			abpc++;
		else if(bg == "AB-")
			abnc++;
		else if(bg == "O+")
			opc++;
		else
			onc++;

List<Hospital> hosp = new ArrayList<>();
    hosp  = s.createQuery("from Hospital").list();
   
	for(Hospital d: hosp)
	{
		apc = apc + d.getAp();
		anc = anc + d.getAn();
		bpc = bpc + d.getBp();
		bnc = bnc + d.getBn();
		abpc = abpc + d.getAbp();
		abnc = abnc + d.getAbn();
		opc = opc + d.getOpb();
		onc = onc + d.getOnb();	
	}


List<Organization> org = new ArrayList<>();
    org  = s.createQuery("from Organization").list();
   
	for(Organization d : org)
	{
		apc = apc + d.getAp();
		anc = anc + d.getAn();
		bpc = bpc + d.getBp();
		bnc = bnc + d.getBn();
		abpc = abpc + d.getAbp();
		abnc = abnc + d.getAbn();
		opc = opc + d.getOpb();
		onc = onc + d.getOnb();	
	}
ds.addValue(apc,"Blood Bags Count","A +ve");
ds.addValue(anc,"Blood Bags Count","A -ve");
ds.addValue(bpc,"Blood Bags Count","B +ve");
ds.addValue(bnc,"Blood Bags Count","B -ve");
ds.addValue(abpc,"Blood Bags Count","AB +ve");
ds.addValue(abnc,"Blood Bags Count","AB -ve");
ds.addValue(opc,"Blood Bags Count","O +ve");
ds.addValue(onc,"Blood Bags Count","O -ve");




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
Blood_bags b = new Blood_bags();
 DefaultCategoryDataset ds = b.get_data();
 System.out.println(ds);

}

*/


}
