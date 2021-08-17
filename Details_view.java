import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import org.hibernate.*;
import org.hibernate.cfg.*;

class Details_view extends JFrame{


ImageIcon background_image;
JLabel background,title,em;
JTextField emt;
JButton ddetail,hdetail,odetail,udetail;
JPanel panel,home,heading;


	Details_view(String user,String see,String email){


		home =new JPanel();
		home.setLayout(null);		
        home.setBackground(new Color(117, 12, 12));
        home.setBounds(0,0,900,600);      
        add(home);

		//font
		Font f = new Font("Serif",Font.BOLD+Font.ITALIC,30);
		Font f1 = new Font("Algerian",Font.BOLD+Font.ITALIC,35);
		Font f2 = new Font("Arial",Font.BOLD,22);
	
	
    
      	JButton logout = new JButton("Logout");
      	logout.setBounds(5,5,150,40);
      	logout.setFont(f);
      	home.add(logout);

      	JButton back = new JButton("Back");
      	back.setBounds(170,5,100,40);
      	back.setFont(f);
      	home.add(back);


		title=new JLabel("Donor Details",JLabel.CENTER);
		//set bounds left,top,width,height
		title.setBounds(150,20,700,40);		
		title.setFont(f1);
		title.setForeground(new Color(255,255,255));
	   	
		home.add(title);

		JTextArea textArea = new JTextArea(20, 20);  
		textArea.setFont(f2);

//if user is admin the search by email

if(user.equals("Admin"))
{


		em=new JLabel("Email :");
        em.setBounds(50,70,150,25);
        em.setFont(f2);
        em.setForeground(new Color(255,255,255));
	   	
	   

        emt=new JTextField();
        emt.setBounds(200,70,200,40);
        emt.setBackground(new Color(169, 232, 229));
        emt.setFont(f2);		
        home.add(em);
        home.add(emt);
 
 		JButton search = new JButton("Search");
      	search.setBounds(420,70,150,40);
      	search.setFont(f);
      	home.add(search);


      	JButton deleteuser = new JButton("Delete");
      	deleteuser.setBounds(580,70,130,40);
      	deleteuser.setFont(f);
      	home.add(deleteuser);

      	JButton refresh2 = new JButton("Refresh");
      	refresh2.setBounds(720,70,150,40);
      	refresh2.setFont(f);
      	home.add(refresh2);

		ActionListener a5 = (ae) ->{

			
			View v = new View();
			String data=v.Search(emt.getText(),see);

			if(data != "")
			{
				
				textArea.setText("");
			textArea.append(data);
		}

		};

		search.addActionListener(a5);

		ActionListener a6 = (ae) ->{

			int a=JOptionPane.showConfirmDialog(home,"Are you sure?");  
			if(a==JOptionPane.YES_OPTION)
			{
			View v = new View();
			v.Delete(emt.getText(),see);
		}

		};

		deleteuser.addActionListener(a6);

	ActionListener a9 = (ae) ->{

			Details_view d = new Details_view(user,see,email);dispose();

		};

		refresh2.addActionListener(a9);

      }
//else seach by location
      
else{



		JLabel loc=new JLabel("Location :");
        loc.setBounds(50,70,200,25);
        loc.setFont(f2);
        loc.setForeground(new Color(255,255,255));
	   	
	   

        JTextField loct=new JTextField();
        loct.setBounds(250,70,200,40);
        loct.setBackground(new Color(169, 232, 229));
        loct.setFont(f2);		
        home.add(loc);
        home.add(loct);
 
 		JButton search2 = new JButton("Search");
      	search2.setBounds(500,70,150,40);
      	search2.setFont(f);
      	home.add(search2);


      	JButton refresh = new JButton("Refresh");
      	refresh.setBounds(680,70,150,40);
      	refresh.setFont(f);
      	home.add(refresh);

		ActionListener a7 = (ae) ->{

			ArrayList<String> data = View.Search_by_loc(loct.getText(),see);

		if(data.isEmpty()==false)
		{

			textArea.setText("");
			String tableheading="";

		if(see == "UserV")
		{

		tableheading ="\nSr.No\tName\tEmail Id\tPhone\tCity\tState\n\n";


		}
		else if(see == "OrgV")
		{
	tableheading ="\nSr.No\tName\tEmail Id\tPhone\tCity\tState\tA +ve\tA -ve\tB +ve\tB -ve\tAB +ve\tAB -ve\tO +ve\tO -ve\n\n";


		}
		else if (see == "HospV")
		{
	tableheading ="\nSr.No\tName\tEmail Id\tPhone\tCity\tState\tA +ve\tA -ve\tB +ve\tB -ve\tAB +ve\tAB -ve\tO +ve\tO -ve\n\n";


		}
		else if(see == "DonorV")
		{
		tableheading ="\nSr.No\tFirst Name\tLast Name\tEmail Id\tContact No\tState\tCity\tBlood Group\tGender\tAge\n\n";

		}
		else
		{
	tableheading ="\nSr.No\tName\tEmail Id\tPhone\tCity\tState\n\n";
		}
		
			textArea.append(tableheading);
		int i=0;
		for(String a : data){
				i=i+1;
 			  textArea.append(i + "\t"  +  a + "\n\n");
			}
		}

		else{
	JOptionPane.showMessageDialog(new JDialog(),"No Records Found For Entered Location","Alert",JOptionPane.WARNING_MESSAGE);
		}


};



		search2.addActionListener(a7);

		ActionListener a8 = (ae) ->{

			Details_view d = new Details_view(user,see,email);dispose();

		};

		refresh.addActionListener(a8);


    

}



	
	
		if(see.equals("DonorV"))
		{
			title.setText("Donors Details");

		String	tableheading ="\nSr.No\tFirst Name\tLast Name\tEmail Id\tContact No\tState\tCity\tBlood Group\tGender\tAge\n\n";

		ArrayList<String> data = View.ViewD();

		int i=0;
		textArea.append(tableheading);
		for(String a : data){
				i=i+1;
 			  textArea.append(i + "\t"  +  a + "\n\n");
			}

		}


		else if(see.equals("OrgV"))
		{
				title.setText("Organizations Details");
	String	tableheading ="\nSr.No\tName\tEmail Id\tContact No\tCity\tState\tA +ve\tA -ve\tB +ve\tB -ve\tAB +ve\tAB -ve\tO +ve\tO -ve\n\n";

		ArrayList<String> data = View.ViewO();

		int i=0;
		textArea.append(tableheading);
		for(String a : data){
				i=i+1;
 			  textArea.append(i + "\t"  +  a + "\n\n");
			}
		}
		else if(see.equals("HospV"))
		{

				title.setText("Hospitals Details");
	String	tableheading ="\nSr.No\tName\tEmail Id\tContact No\tCity\tState\tA +ve\tA -ve\tB +ve\tB -ve\tAB +ve\tAB -ve\tO +ve\tO -ve\n\n";

		ArrayList<String> data = View.ViewH();

		int i=0;
		textArea.append(tableheading);
		for(String a : data){
				i=i+1;
 			  textArea.append(i + "\t"  +  a + "\n\n");
			}

		}
		else if(see.equals("UserV"))
		{
				title.setText("Users Details");	
			String	tableheading ="\nSr.No\tName\tEmail Id\tPhone\tCity\tState\n\n";
			textArea.append(tableheading);

			ArrayList<String> data = View.ViewU();

		int i=0;
		
		for(String a : data){
				i=i+1;
 			  textArea.append(i + "\t"  +  a + "\n\n");
			}
		}
		else{

			JOptionPane.showMessageDialog(home,see);

		}



        JScrollPane scrollableTextArea = new JScrollPane(textArea);  
  
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 

        scrollableTextArea.setBounds(45,130,800,400);
        home.add(scrollableTextArea);
	
		ActionListener a1 = (ae) ->{new Menu().Menu_all(user,email);dispose();};
		back.addActionListener(a1);


		ActionListener a2 = (ae) ->{

if(user.equals("User"))
	{
		ULogin a = new ULogin();
		dispose();
	}

	else if(user.equals("Admin"))
	{
		ALogin a = new ALogin();
		dispose();
	}
	else if(user.equals("Donor"))
	{
		DLogin a = new DLogin();
		dispose();
	}
	else if(user.equals("Hospital"))
	{
		HLogin a = new HLogin();
		dispose();
	}
	else if(user.equals("Organization"))
	{
		OLogin a = new OLogin();
		dispose();
	}
	else{
		Home a = new Home();
		dispose();	
	}
};
		logout.addActionListener(a2);

		

		setTitle("Blood Bank Management System/Details Page");
		setSize(900,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
/*

 public static void main(String[] args) {

 	Donor_detail a = new Donor_detail();
		
	}
	*/
}
