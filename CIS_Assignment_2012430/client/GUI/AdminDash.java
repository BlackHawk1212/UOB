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
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminDash extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1130033892317089076L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDash frame = new AdminDash();
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
	public AdminDash() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1056, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 149, 237));
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 139)));
		panel.setForeground(new Color(0, 0, 139));
		panel.setBounds(10, 11, 1020, 589);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(0, 0, 139));
		panel_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 139)));
		panel_1.setBackground(new Color(100, 149, 237));
		panel_1.setBounds(21, 21, 976, 105);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hello Admin, Welcome back!");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(207, 23, 560, 58);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setForeground(new Color(0, 0, 139));
		panel_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 139)));
		panel_1_1.setBackground(new Color(100, 149, 237));
		panel_1_1.setBounds(21, 137, 348, 429);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JButton btnStopServer = new JButton("Stop Server");
		btnStopServer.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnStopServer.setBounds(75, 138, 203, 45);
		panel_1_1.add(btnStopServer);
		
		JButton btnQuestionnaire = new JButton("Questionnaire");
		btnQuestionnaire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnQuestionnaire.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EditQuestion q = new EditQuestion();
				q.setVisible(true);
				q.setLocationRelativeTo(null);
				q.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnQuestionnaire.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnQuestionnaire.setBounds(64, 274, 231, 45);
		panel_1_1.add(btnQuestionnaire);
		
		JLabel lblNewLabel_1 = new JLabel("SERVER");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(32, 32, 78, 26);
		panel_1_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("DATABASE");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(30, 233, 102, 26);
		panel_1_1.add(lblNewLabel_1_1);
		
		JButton btnViewFeedback = new JButton("View Feedback");
		btnViewFeedback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ViewFeedback fdb = new ViewFeedback();
				fdb.setVisible(true);
				fdb.setLocationRelativeTo(null);
				fdb.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnViewFeedback.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnViewFeedback.setBounds(51, 346, 258, 45);
		panel_1_1.add(btnViewFeedback);
		
		JButton btnStartServer = new JButton("Start Server");
		btnStartServer.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnStartServer.setBounds(75, 69, 203, 45);
		panel_1_1.add(btnStartServer);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setForeground(new Color(0, 0, 139));
		panel_1_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 139)));
		panel_1_1_1.setBackground(new Color(100, 149, 237));
		panel_1_1_1.setBounds(379, 137, 618, 429);
		panel.add(panel_1_1_1);
	}
}
