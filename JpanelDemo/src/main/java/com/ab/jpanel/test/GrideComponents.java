package com.ab.jpanel.test;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class GrideComponents{
	  public static void main(String[] args) {
	  JFrame frame = new JFrame("Laying Out Components in a Grid");
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  JPanel panel = new JPanel(new GridLayout(4,4));
	  
	  
	  //JPanel pane = new JPanel();
	  panel.setBorder(BorderFactory.createLineBorder(Color.red));
	  
	  
	  //panel.setBorder(border);
	 JLabel label = new JLabel("3");
	 label.setBorder(BorderFactory.createLineBorder(Color.blue));
	 panel.add(label);
	 
	 JLabel label2 = new JLabel("");
	 label2.setBorder(BorderFactory.createLineBorder(Color.blue));
	 panel.add(label2);
	  
	 
	 JLabel label3 = new JLabel("");
	 label3.setBorder(BorderFactory.createLineBorder(Color.blue));
	 panel.add(label3);
	 
	 
	 label = new JLabel("");
	 label.setBorder(BorderFactory.createLineBorder(Color.blue));
	 panel.add(label);
	
	 label = new JLabel("2");
	 label.setBorder(BorderFactory.createLineBorder(Color.blue));
	 panel.add(label);
	 
	 label = new JLabel("");
	 label.setBorder(BorderFactory.createLineBorder(Color.blue));
	 panel.add(label);
	 
	 label = new JLabel("");
	 label.setBorder(BorderFactory.createLineBorder(Color.blue));
	 panel.add(label);
	 
	 label = new JLabel("");
	 label.setBorder(BorderFactory.createLineBorder(Color.blue));
	 panel.add(label);
	 
	 label = new JLabel("1");
	 label.setBorder(BorderFactory.createLineBorder(Color.blue));
	 panel.add(label);
	 
	 label = new JLabel("");
	 label.setBorder(BorderFactory.createLineBorder(Color.blue));
	 panel.add(label);
	 
	 label = new JLabel("");
	 label.setBorder(BorderFactory.createLineBorder(Color.blue));
	 panel.add(label);
	 
	 label = new JLabel("");
	 label.setBorder(BorderFactory.createLineBorder(Color.blue));
	 panel.add(label);
	 
	 label = new JLabel("");
	 label.setBorder(BorderFactory.createLineBorder(Color.blue));
	 panel.add(label);
	 
	 label = new JLabel("1");
	 label.setBorder(BorderFactory.createLineBorder(Color.blue));
	 panel.add(label);
	 
	 label = new JLabel("2");
	 label.setBorder(BorderFactory.createLineBorder(Color.blue));
	 panel.add(label);
	 
	 label = new JLabel("3");
	 label.setBorder(BorderFactory.createLineBorder(Color.blue));
	 panel.add(label);
	 
	 
	 
	 
//	  panel.add(new JTextField(5));
//	  panel.add(new JLabel("Enter Roll"));
//	  panel.add(new JTextField(3));
//	  panel.add(new JLabel("Enter Class"));
//	  panel.add(new JTextField(3));
//	  panel.add(new JLabel("Enter Total Marks"));
//	  panel.add(new JTextField(3));
//	  panel.add(new JButton("Ok"));
//	  panel.add(new JButton("Cancel"));
	  frame.add(panel);
	  frame.setSize(500,500);
	  frame.setVisible(true);
	  }
	}

//http://www.leepoint.net/notes-java/GUI/layouts/30gridlayout.html