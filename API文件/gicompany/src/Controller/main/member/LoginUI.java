package Controller.main.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.member.implMember;
import Model.member;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
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
	public LoginUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(32, 42, 372, 192);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("帳號");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel.setBounds(44, 38, 40, 29);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("密碼");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(44, 90, 40, 29);
		panel.add(lblNewLabel_1);
		
		JTextArea txtUsername = new JTextArea();
		txtUsername.setBounds(115, 40, 185, 29);
		panel.add(txtUsername);
		
		JTextArea txtPassword = new JTextArea();
		txtPassword.setBounds(115, 92, 185, 29);
		panel.add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = txtUsername.getText();
				String password = txtPassword.getText();
				
				member m=new implMember().queryMember(username,password);
				
				if (m!=null)
				{
					LoginSuccess l=new LoginSuccess();
					l.show();
					dispose();
				}
				else 
				{
					LoginError l=new LoginError();
					l.show();
					dispose();
				}
			}
		});
		btnLogin.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnLogin.setBounds(31, 146, 85, 23);
		panel.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnReset.setBounds(138, 146, 85, 23);
		panel.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnExit.setBounds(245, 146, 85, 23);
		panel.add(btnExit);
	}
}
