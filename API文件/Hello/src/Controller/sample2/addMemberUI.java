package Controller.sample2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.implMember;
import Model.member;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class addMemberUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addMemberUI frame = new addMemberUI();
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
	public addMemberUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 780, 437);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("姓名");
		lblNewLabel.setBounds(38, 71, 87, 37);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 30));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("帳號");
		lblNewLabel_1.setBounds(38, 125, 80, 45);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 30));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("密碼");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(38, 180, 80, 37);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("地址");
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblNewLabel_1_2.setBounds(38, 227, 87, 38);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("行動");
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblNewLabel_1_3.setBounds(38, 275, 87, 41);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("電話");
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblNewLabel_1_4.setBounds(38, 326, 87, 44);
		panel.add(lblNewLabel_1_4);
		
		JTextArea name = new JTextArea();
		name.setBounds(168, 76, 267, 31);
		panel.add(name);
		
		JTextArea username = new JTextArea();
		username.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		username.setBounds(168, 131, 267, 31);
		panel.add(username);
		
		JTextArea password = new JTextArea();
		password.setBounds(168, 181, 267, 31);
		panel.add(password);
		
		JTextArea address = new JTextArea();
		address.setBounds(168, 229, 267, 31);
		panel.add(address);
		
		JTextArea mobile = new JTextArea();
		mobile.setBounds(168, 275, 267, 31);
		panel.add(mobile);
		
		JTextArea phone = new JTextArea();
		phone.setBounds(168, 326, 267, 31);
		panel.add(phone);
		
		JButton add = new JButton("確定");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Username=username.getText();
				if(new implMember().queryUser(Username))
				{
					addError error=new addError();
					error.show();
					dispose();
				}
				else
				{
					String Name=name.getText();
					String Password=password.getText();
					String Address=address.getText();
					String Mobile=mobile.getText();
					String Phone=phone.getText();
					
					member m=new member(Name,Username,Password,Address,Mobile,Phone);
					
					new implMember().add(m);
					
					addSuccess success=new addSuccess();
					
					success.show();
					dispose();
					
					
				}
			}
		});
		add.setFont(new Font("新細明體", Font.PLAIN, 35));
		add.setBounds(490, 156, 242, 88);
		panel.add(add);
	}

}
