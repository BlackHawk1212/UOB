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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dialog.ModalExclusionType;

public class Main_GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2787715264581114470L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_GUI frame = new Main_GUI();
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
	public Main_GUI() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setTitle("MainUI");
		setBounds(100, 100, 842, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(8, 9, 808, 381);
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 139)));
		panel.setBackground(new Color(100, 149, 237));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBounds(21, 20, 766, 107);
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 139)));
		panel_1_1_2.setBackground(new Color(100, 149, 237));
		panel.add(panel_1_1_2);
		
		JLabel lblFeedback = new JLabel("Sri Lanka Telecom");
		lblFeedback.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblFeedback.setBounds(193, 11, 416, 54);
		panel_1_1_2.add(lblFeedback);
		
		JLabel lblNewLabel = new JLabel("Feel free to fill this questionnaire to improve our employee satisfaction");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(155, 65, 507, 21);
		panel_1_1_2.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Feedback");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Feedback fdb = new Feedback();
				fdb.setVisible(true);
				fdb.setLocationRelativeTo(null);
				fdb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(149, 299, 181, 45);
		panel.add(btnNewButton);
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Admin_Login_GUI adminlog = new Admin_Login_GUI();
				adminlog.setVisible(true);
				adminlog.setLocationRelativeTo(null);
				adminlog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnAdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnAdminLogin.setBounds(445, 299, 221, 45);
		panel.add(btnAdminLogin);
	}

}
