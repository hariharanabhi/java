package Account_data;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Registration_data {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_data window = new Registration_data();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration_data() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 634, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setBounds(177, 29, 224, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 118, 126, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 214, 136, 36);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Branch");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(10, 317, 85, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Programming lang");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(10, 385, 185, 31);
		frame.getContentPane().add(lblNewLabel_4);
		
		t1 = new JTextField();
		t1.setBounds(195, 118, 272, 31);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		r1.setBounds(181, 204, 155, 31);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		r2.setBounds(358, 204, 136, 31);
		frame.getContentPane().add(r2);
		
		JCheckBox cb1 = new JCheckBox("c++");
		cb1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cb1.setBounds(211, 387, 106, 31);
		frame.getContentPane().add(cb1);
		
		JCheckBox cb2 = new JCheckBox("JAVA");
		cb2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cb2.setBounds(332, 387, 97, 31);
		frame.getContentPane().add(cb2);
		
		JCheckBox cb3 = new JCheckBox("PYTHON");
		cb3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cb3.setBounds(440, 387, 126, 31);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("Sumbit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb.getText();
				String g;
				if(r1.isSelected())
				{
					g="Female";
				}
				else if(r2.isSelected())
				{ 
					g="Male";
				}
				else
				{
					g="Invalid";
				}
				String b=(String) co.getSelectedItem();
				String p1;
				if(cb1.isSelected())
				{
					p1="C++";
				}
				else if(cb2.isSelected())
				{
					p1="JAVA";
				}
				else
				{
					p1="PYTHON";
				}
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aiml","root","mrec");
					String q="insert into registration values()";
					Statement sta=con.createStatement();
					sta.execute(q);
					con.close();
					JOptionPane.showMessageDialog(btnNewButton,"Done");
				}
				catch(SQLException e1) {
					e1.printStackTrace();
				
				}	
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(247, 425, 154, 28);
		frame.getContentPane().add(btnNewButton);
		
		JComboBox co = new JComboBox();
		co.setFont(new Font("Tahoma", Font.PLAIN, 15));
		co.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "AIML ", "ECE"}));
		co.setBounds(195, 300, 307, 48);
		frame.getContentPane().add(co);
	}
}
