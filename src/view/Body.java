package view;

import javax.swing.JPanel;

import view.pages.EmployeeManagement;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;

public class Body extends JPanel{
	private CardLayout cardLayout;
	private EmployeeManagement employee;
	
	public Body() {
		setBackground(new Color(0, 0, 0));
		setSize(1240, 840);
		
		cardLayout = new CardLayout(0,0);
		setLayout(cardLayout);
		
		employee = new EmployeeManagement();
		add(employee, "employee");
	}
}
