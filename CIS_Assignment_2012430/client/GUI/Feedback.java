package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;

public class Feedback extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8428590640233967435L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Feedback frame = new Feedback();
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
	public Feedback() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1228, 904);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 139)));
		panel.setBackground(new Color(100, 149, 237));
		panel.setBounds(10, 11, 1190, 843);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 139)));
		panel_1.setBackground(new Color(100, 149, 237));
		panel_1.setBounds(25, 179, 1138, 287);
		panel.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(24, 21, 88, 31);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(269, 21, 401, 33);
		panel_1.add(textField);
		
		JLabel lblNewLabel_2 = new JLabel("Employee Status:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(24, 78, 222, 32);
		panel_1.add(lblNewLabel_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select an option", "Permanant Employee", "Trainee Employee"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_1.setBounds(269, 78, 282, 31);
		panel_1.add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(269, 142, 401, 33);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Email:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_2.setBounds(24, 142, 222, 32);
		panel_1.add(lblNewLabel_2_2);
		
		JButton btnNewButton_1_2_3_1 = new JButton("Answer Questions");
		btnNewButton_1_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_2_3_1.setBounds(925, 233, 189, 31);
		panel_1.add(btnNewButton_1_2_3_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 139)));
		panel_1_1.setBackground(new Color(100, 149, 237));
		panel_1_1.setBounds(25, 744, 1138, 76);
		panel.add(panel_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Finished");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_2.setBounds(370, 25, 363, 29);
		panel_1_1.add(btnNewButton_1_2);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 139)));
		panel_1_1_2.setBackground(new Color(100, 149, 237));
		panel_1_1_2.setBounds(25, 24, 1138, 107);
		panel.add(panel_1_1_2);
		
		JLabel lblFeedback = new JLabel("Sri Lanka Telecom");
		lblFeedback.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblFeedback.setBounds(351, 11, 416, 54);
		panel_1_1_2.add(lblFeedback);
		
		JLabel lblNewLabel = new JLabel("Feel free to fill this questionnaire to improve our employee satisfaction");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(306, 69, 507, 21);
		panel_1_1_2.add(lblNewLabel);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(25, 477, 1138, 256);
		panel.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 139)));
		panel_1_1_1.setBackground(new Color(100, 149, 237));
		
		JButton btnNewButton_1_2_1 = new JButton("Last Question");
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_2_1.setBounds(27, 197, 136, 29);
		panel_1_1_1.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_2 = new JButton("Next Question");
		btnNewButton_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_2_2.setBounds(977, 197, 136, 29);
		panel_1_1_1.add(btnNewButton_1_2_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select an option", "Poor", "Below Average", "Average", "Above Average", "Outstanding"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setBounds(27, 109, 1086, 31);
		panel_1_1_1.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(28, 25, 1085, 51);
		panel_1_1_1.add(lblNewLabel_3);
	}
}
