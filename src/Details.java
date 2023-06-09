import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import java.util.*;
import java.lang.*;
import java.text.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Details extends JFrame {
	private JTextField txName;
	private JTextField txEmail;
	private JTextField txDay;
	private JTextField txMonth;
	private JTextField txYear;
	private JLabel lblGender;
	private JLabel lblLeavingFrom;
	private JComboBox cbLeaving;
	private JLabel lblDestination;
	private JComboBox cbDestination;
	private JLabel lblFlightClass;
	private JComboBox cbClass;
	private JLabel lblTimeOfDeparture;
	private JComboBox cbTime;
	private JLabel lblSelectMeal;
	private JComboBox cbMeal;
	private JButton btnSubmitForm;

	/**
	 * Launch the application.
	 */
	
	String code = "";
	String gender = "";
	String meal = "";
	String destination = "";
	String fClass = "";
	String leaving = "";
	int leavingtime;
	boolean empty = true;
	int day,month,year;
	
	public class OptionPaneExample {  
		JFrame f;  
		OptionPaneExample(){  
		    f=new JFrame();  
		    JOptionPane.showMessageDialog(f,"Error."); 
		}
		
	
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Details frame = new Details();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Details() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 11, 46, 14);
		getContentPane().add(lblName);
		
		txName = new JTextField();
		txName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nameString = txName.getText();
			}
		});
		txName.setBounds(52, 8, 86, 20);
		getContentPane().add(txName);
		txName.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 34, 46, 14);
		getContentPane().add(lblEmail);
		
		txEmail = new JTextField();
		txEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String emailString = txEmail.getText();
			}
		});
		txEmail.setBounds(52, 31, 106, 20);
		getContentPane().add(txEmail);
		txEmail.setColumns(10);
		
		JLabel lblBirthDate = new JLabel("Birth date:");
		lblBirthDate.setBounds(10, 59, 61, 14);
		getContentPane().add(lblBirthDate);
		
		txDay = new JTextField();
		txDay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dayString = txDay.getText();
				day = Integer.parseInt(dayString);
			}
		});
		txDay.setBounds(72, 56, 28, 20);
		getContentPane().add(txDay);
		txDay.setColumns(10);
		
		txMonth = new JTextField();
		txMonth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String monthString = txMonth.getText();
				month = Integer.parseInt(monthString);
			}
		});
		txMonth.setBounds(103, 56, 28, 20);
		getContentPane().add(txMonth);
		txMonth.setColumns(10);
		
		txYear = new JTextField();
		txYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String yearString = txYear.getText();
				year = Integer.parseInt(yearString);
			}
		});
		txYear.setBounds(133, 56, 46, 20);
		getContentPane().add(txYear);
		txYear.setColumns(10);
		
		lblGender = new JLabel("Gender:");
		lblGender.setBounds(10, 81, 46, 14);
		getContentPane().add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnMale.isSelected())
				{
					gender = "X";
				} 
			}
		});
		rdbtnMale.setSelected(true);
		rdbtnMale.setBounds(60, 77, 53, 23);
		getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnFemale.isSelected())
				{
					gender = "Y";
				}
			}
		});
		rdbtnFemale.setBounds(118, 77, 61, 23);
		getContentPane().add(rdbtnFemale);
	    ButtonGroup group = new ButtonGroup();
	    group.add(rdbtnFemale);
	    group.add(rdbtnMale);
	    
	    lblLeavingFrom = new JLabel("Leaving from:");
	    lblLeavingFrom.setBounds(10, 104, 78, 14);
	    getContentPane().add(lblLeavingFrom);
	    
	    String Countries[] = {"Europe","Asia","Americas","UK"};
	    cbLeaving = new JComboBox(Countries);
	    cbLeaving.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if (cbLeaving.getSelectedItem().equals("Europe"))
	    		{
	    			leaving = "-EU";
	    		}
	    		else 
	    		{
	    			leaving = "-ZZ";
	    		}
	    	}
	    });
	    cbLeaving.setBounds(85, 101, 106, 20);
	    getContentPane().add(cbLeaving);
	    
	    lblDestination = new JLabel("Destination:");
	    lblDestination.setBounds(10, 129, 71, 14);
	    getContentPane().add(lblDestination);
	    
	    
	    cbDestination = new JComboBox(Countries);
	    cbDestination.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		if (cbDestination.getSelectedItem().equals("Europe"))
	    		{
	    			destination = "B";
	    		}
	    		else if (cbDestination.getSelectedItem().equals("Asia"))
	    		{
	    			destination = "C";
	    		} else if (cbDestination.getSelectedItem().equals("UK"))
	    		{
	    			destination = "A";
	    		} else
	    		{
	    			destination = "D";
	    		}
	    		
	    	}
	    });
	    cbDestination.setBounds(85, 126, 106, 20);
	    getContentPane().add(cbDestination);
	    
	    lblFlightClass = new JLabel("Flight class:");
	    lblFlightClass.setBounds(10, 154, 78, 14);
	    getContentPane().add(lblFlightClass);
	    
	    String Classes[] = {"Economy","First class","Business class"};
	    cbClass = new JComboBox(Classes);
	    cbClass.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(cbClass.getSelectedItem().equals("Economy"))
	    		{
	    			fClass = "R";
	    			
	    		} else if (cbClass.getSelectedItem().equals("First class"))
	    		{
	    			fClass = "P";
	    		} else 
	    		{
	    			fClass = "Q";
	    		}
	    				
	    	}
	    });
	    cbClass.setBounds(85, 151, 94, 20);
	    getContentPane().add(cbClass);
	    
	    lblTimeOfDeparture = new JLabel("Time of departure:");
	    lblTimeOfDeparture.setBounds(10, 179, 100, 14);
	    getContentPane().add(lblTimeOfDeparture);
	    
	    String Time[] = {"1","2","3","4","5","6","7","8","9","10","11","12"};
	    cbTime = new JComboBox(Time);
	    cbTime.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    	}
	    });
	    cbTime.setBounds(118, 176, 61, 20);
	    getContentPane().add(cbTime);
	    
	    JRadioButton rdbtnAm = new JRadioButton("AM");
	    rdbtnAm.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    rdbtnAm.setSelected(true);
	    rdbtnAm.setBounds(183, 175, 46, 23);
	    getContentPane().add(rdbtnAm);
	    
	    JRadioButton rdbtnPm = new JRadioButton("PM");
	    rdbtnPm.setBounds(225, 175, 46, 23);
	    getContentPane().add(rdbtnPm);
	    ButtonGroup group1 = new ButtonGroup();
	    group1.add(rdbtnPm);
	    group1.add(rdbtnAm);
	    
	    lblSelectMeal = new JLabel("Select meal:");
	    lblSelectMeal.setBounds(10, 204, 78, 14);
	    getContentPane().add(lblSelectMeal);
	    
	    
	    String Meals[] = {"European","Asian","Vegetarian"};
	    cbMeal = new JComboBox(Meals);
	    cbMeal.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if (cbMeal.getSelectedItem().equals("European"))
	    		{
	    			meal = "G";
	    		}
	    		else if (cbMeal.getSelectedItem().equals("Asian"))
	    		{
	    			meal = "H";
	    		} else 
	    		{
	    			meal = "K";
	    		}
	    	}
	    });
	    cbMeal.setBounds(103, 201, 88, 20);
	    getContentPane().add(cbMeal);
	    
	    btnSubmitForm = new JButton("Submit form");
	    btnSubmitForm.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		code = code.concat(destination);
	    		if (year >= 2013)
	    		{
	    			gender = gender.toLowerCase();
	    		}
	    		code = code.concat(gender);
	    		if (year >= 2013)
	    		{
	    			meal = meal.toLowerCase();
	    		}
	    		code = code.concat(meal);
	    		code = code.concat(fClass);
	    		code = code.concat(leaving);
	    	    System.out.println("Your code is " + code);
	    	}
	    });
	    btnSubmitForm.setBounds(292, 227, 106, 23);
	    getContentPane().add(btnSubmitForm);
	    
	    
	    
	    
		
	}
}
