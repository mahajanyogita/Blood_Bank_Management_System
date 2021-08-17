import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



import org.jfree.data.general.*; //DefaultPiedataset
import org.jfree.chart.*;


import org.jfree.chart.plot.*;
import org.jfree.data.category.*;
import org.jfree.chart.renderer.category.BarRenderer;
import java.awt.Color;

class Show_blood_bags extends JFrame{


ImageIcon background_image;
JLabel background,title;
JButton back;
JPanel panel,home,heading;

	Show_blood_bags(String user, String email){


		home =new JPanel();
		home.setLayout(null);		
        home.setBackground(new Color(117, 12, 12));
        home.setBounds(0,0,900,600);      
        add(home);

		//font
		Font f = new Font("Serif",Font.BOLD+Font.ITALIC,30);
		Font f1 = new Font("Algerian",Font.BOLD+Font.ITALIC,35);

	


		title=new JLabel("Blood Bags Analysis",JLabel.CENTER);
		//set bounds left,top,width,height
		title.setBounds(100,20,700,40);		
		title.setFont(f1);
		title.setForeground(new Color(255,255,255));
	   	
		home.add(title);
	

		//adding buttons
		back =new JButton("Back");
		back.setBounds(325,500,300,50);
	

	
	
		back.setFont(f);	
	
		home.add(back);

		DefaultCategoryDataset ds= new Blood_bags().get_data();
		System.out.println(ds);

	
JFreeChart chart = ChartFactory.createBarChart("Blood Bags Available","Blood Groups","Count",ds,PlotOrientation.VERTICAL,true,false,false);

//change color
CategoryPlot plot = chart.getCategoryPlot();

BarRenderer renderer = (BarRenderer) plot.getRenderer();

renderer.setSeriesPaint(0, Color.blue);
//3 chart display

ChartPanel panel = new ChartPanel(chart);

 panel.setDomainZoomable(true);
panel.setBounds(150,70,600,400);

 	
   home.add(panel);




 	
   home.add(panel);
//setContentPane(panel);
//panel.setBounds(300,300,300,300);

ActionListener a1 = (ae) ->{

 		new Show_chart(user,email);
 		dispose();


 		};


			back.addActionListener(a1);	


		setTitle("Blood Bank Management System/Chart Page");
		setSize(900,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}


public static void main(String args[])
{
Show_blood_bags b = new Show_blood_bags("Admin","a@gmail.com");
}



}
