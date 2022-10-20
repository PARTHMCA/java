package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class insert {

	private JFrame frmRegisterFrom;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					insert window = new insert();
					window.frmRegisterFrom.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public insert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegisterFrom = new JFrame();
		frmRegisterFrom.setForeground(new Color(255, 255, 255));
		frmRegisterFrom.setBackground(new Color(255, 255, 255));
		frmRegisterFrom.setFont(new Font("Arial", Font.BOLD, 13));
		frmRegisterFrom.setTitle("Register From");
		frmRegisterFrom.setAlwaysOnTop(true);
		frmRegisterFrom.setBounds(800, 700, 400, 600);
		frmRegisterFrom.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegisterFrom.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Register Data");
		lblNewLabel_1.setBounds(140, 10, 181, 26);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		frmRegisterFrom.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(42, 51, 51, 22);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		frmRegisterFrom.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(108, 55, 206, 19);
		frmRegisterFrom.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DOB");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_2.setBounds(42, 91, 45, 13);
		frmRegisterFrom.getContentPane().add(lblNewLabel_2);
		

		
		JComboBox days1 = new JComboBox();
		days1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		days1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		days1.setToolTipText("Day");
		days1.setBackground(SystemColor.menu);
		days1.setBounds(108, 89, 45, 21);
		frmRegisterFrom.getContentPane().add(days1);
		
		JComboBox months = new JComboBox();
		months.setFont(new Font("Arial", Font.PLAIN, 14));
		months.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		months.setToolTipText("");
		months.setBounds(163, 88, 86, 22);
		frmRegisterFrom.getContentPane().add(months);
		
		JComboBox years = new JComboBox();
		years.setFont(new Font("Arial", Font.PLAIN, 11));
		years.setModel(new DefaultComboBoxModel(new String[] {"2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950"}));
		years.setBounds(259, 88, 53, 22);
		frmRegisterFrom.getContentPane().add(years);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setBounds(42, 127, 64, 26);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 15));
		frmRegisterFrom.getContentPane().add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.BOLD, 13));
		rdbtnNewRadioButton.setBounds(123, 132, 64, 21);
		frmRegisterFrom.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setFont(new Font("Arial", Font.BOLD, 13));
		rdbtnNewRadioButton_1.setBounds(189, 132, 103, 21);
		frmRegisterFrom.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Email ID");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_4.setBounds(42, 163, 86, 26);
		frmRegisterFrom.getContentPane().add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 167, 172, 19);
		frmRegisterFrom.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Mobile No");
		lblNewLabel_5.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_5.setBounds(42, 206, 111, 26);
		frmRegisterFrom.getContentPane().add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(140, 212, 174, 19);
		frmRegisterFrom.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("PassWord");
		lblNewLabel_6.setBounds(42, 252, 93, 27);
		lblNewLabel_6.setFont(new Font("Arial Black", Font.BOLD, 15));
		frmRegisterFrom.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("RePassword");
		lblNewLabel_7.setBounds(42, 289, 111, 26);
		lblNewLabel_7.setFont(new Font("Arial Black", Font.BOLD, 15));
		frmRegisterFrom.getContentPane().add(lblNewLabel_7);
		
		textField_3 = new JTextField();
		textField_3.setBounds(140, 258, 172, 19);
		frmRegisterFrom.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(163, 294, 151, 19);
		frmRegisterFrom.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Course");
		lblNewLabel_8.setBounds(42, 345, 77, 22);
		lblNewLabel_8.setFont(new Font("Arial Black", Font.BOLD, 15));
		frmRegisterFrom.getContentPane().add(lblNewLabel_8);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Java", "Python", "C++", "C", "Laravel", "View.js", "Android", "Aws", "Asp.Net", "php"}));
		comboBox.setBounds(163, 346, 149, 21);
		frmRegisterFrom.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_9 = new JLabel("Branch");
		lblNewLabel_9.setBounds(42, 386, 77, 22);
		lblNewLabel_9.setFont(new Font("Arial Black", Font.BOLD, 15));
		frmRegisterFrom.getContentPane().add(lblNewLabel_9);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"MCA", "BCA", "BSC IT", "Computer It"}));
		comboBox_1.setBounds(163, 389, 151, 21);
		frmRegisterFrom.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_10 = new JLabel("Semester");
		lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_10.setBounds(42, 429, 80, 22);
		frmRegisterFrom.getContentPane().add(lblNewLabel_10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_2.setBounds(163, 431, 93, 21);
		frmRegisterFrom.getContentPane().add(comboBox_2);
		
		JButton btnNewButton = new JButton("Submit Data");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(140, 494, 129, 21);
		frmRegisterFrom.getContentPane().add(btnNewButton);
	}
}
