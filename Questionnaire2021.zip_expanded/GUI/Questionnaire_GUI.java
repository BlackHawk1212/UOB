package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Questionnaire_GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4804698217967843090L;
	private JFrame frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	
	/*Connection mycon = null;
	  Statement mystat = null;
	  ResultSet myres = null;
	  
	public void selectionAll(){
		
		mycon = DriveManager.getConnection("","Nimesh","12345");
	}
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questionnaire_GUI frame = new Questionnaire_GUI();
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
	public Questionnaire_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1226, 807);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 149, 237));
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 139)));
		panel.setBounds(10, 11, 1190, 746);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 139)));
		panel_1.setBackground(new Color(100, 149, 237));
		panel_1.setBounds(25, 160, 554, 477);
		panel.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Question Number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(24, 21, 220, 31);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(272, 19, 251, 33);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Question");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(24, 78, 112, 32);
		panel_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(24, 121, 501, 55);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Options");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(24, 250, 112, 32);
		panel_1.add(lblNewLabel_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select an option", "Poor", "Below Average", "Average", "Above Average", "Outstanding"}));
		comboBox.setBounds(241, 253, 282, 31);
		panel_1.add(comboBox);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 139)));
		panel_1_1.setBackground(new Color(100, 149, 237));
		panel_1_1.setBounds(25, 648, 1138, 76);
		panel.add(panel_1_1);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
					textField.getText(),
					textField_1.getText(),
					comboBox.getSelectedItem(),
				});
				
				if(table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Answer update confirmed", "Questionnaire Managing System", 
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(46, 19, 104, 39);
		panel_1_1.add(btnNewButton);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnUpdate.setBounds(331, 19, 104, 39);
		panel_1_1.add(btnUpdate);
		
		JButton btnNewButton_1_1 = new JButton("Remove");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DefaultTableModel mode = (DefaultTableModel) table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						
						JOptionPane.showMessageDialog(null, "No Data to delete", 
								"Questionnaire Managing System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null, "Select a row to delete", 
								"Questionnaire Managing System", JOptionPane.OK_OPTION);
					}
				}
			}
		});
		
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_1.setBounds(186, 19, 104, 39);
		panel_1_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Reset");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				comboBox.setSelectedItem("Select an option");
			}
		});
		
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_2.setBounds(474, 19, 104, 39);
		panel_1_1.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("Exit");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Questionnaire Managing System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_2_1.setBounds(1027, 23, 89, 31);
		panel_1_1.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_2 = new JButton("Print");
		btnNewButton_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					table.print();
				}
				catch(java.awt.print.PrinterException e) {
					System.err.format("No Printer found", e.getMessage());
				}
			}
		});
		
		btnNewButton_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_2_2.setBounds(613, 19, 104, 39);
		panel_1_1.add(btnNewButton_1_2_2);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 139)));
		panel_1_1_1.setBackground(new Color(100, 149, 237));
		panel_1_1_1.setBounds(589, 160, 574, 478);
		panel.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 554, 456);
		panel_1_1_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Question ID", "Question"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(0);
		table.getColumnModel().getColumn(0).setMinWidth(0);
		scrollPane.setViewportView(table);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 139)));
		panel_1_1_2.setBackground(new Color(100, 149, 237));
		panel_1_1_2.setBounds(25, 24, 1138, 82);
		panel.add(panel_1_1_2);
		
		JLabel lblNewLabel = new JLabel("Questionnaire Managing System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel.setBounds(202, 11, 736, 54);
		panel_1_1_2.add(lblNewLabel);
	}
}
