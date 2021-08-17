import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



import org.jfree.data.general.*; //DefaultPiedataset
import org.jfree.chart.*;


class Show_chart extends JFrame{


ImageIcon background_image;
JLabel background,title;
JButton back;
JPanel panel,home,heading;

	Show_chart(String user, String email){


		home =new JPanel();
		home.setLayout(null);		
        home.setBackground(new Color(117, 12, 12));
        home.setBounds(0,0,900,600);      
        add(home);

		//font
		Font f = new Font("Serif",Font.BOLD+Font.ITALIC,30);
		Font f1 = new Font("Algerian",Font.BOLD+Font.ITALIC,35);

	


		title=new JLabel("Users Analysis",JLabel.CENTER);
		//set bounds left,top,width,height
		title.setBounds(100,20,700,40);		
		title.setFont(f1);
		title.setForeground(new Color(255,255,255));
	   	
		home.add(title);
	

		//adding buttons
		back =new JButton("Back");
		back.setBounds(150,500,250,50);	
		back.setFont(f);	
		home.add(back);

		JButton bld_bags =new JButton("Blood Bags Analysis");
		bld_bags.setBounds(500,500,300,50);	
		bld_bags.setFont(f);	
		home.add(bld_bags);




ActionListener a1 = (ae) ->{

 		new Menu().Menu_all(user,email);
 		dispose();


 		};


			back.addActionListener(a1);


ActionListener a2 = (ae) ->{

 		new Show_blood_bags(user,email);
 		dispose();


 		};


			bld_bags.addActionListener(a2);







		DefaultPieDataset ds= new Chart_data().get_data();
		System.out.println(ds);


//s2: Design chart
JFreeChart chart = ChartFactory.createPieChart("Users Analysis",ds,true,true,true);

//s3: Display chart
ChartPanel panel = new ChartPanel(chart);
 panel.setDomainZoomable(true);
panel.setBounds(150,70,600,400);

 	
   home.add(panel);
//setContentPane(panel);
//panel.setBounds(300,300,300,300);

		


		setTitle("Blood Bank Management System/Chart Page");
		setSize(900,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
