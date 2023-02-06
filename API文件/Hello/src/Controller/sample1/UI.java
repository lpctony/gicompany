package Controller.sample1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.implMember;
import Model.member;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class UI extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField username;
	private JTextField password;
	private JTextField address;
	private JTextField mobile;
	private JTextField phone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
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
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1002, 729);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(50, 31, 263, 474);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("名稱");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 60, 83, 29);
		panel.add(lblNewLabel);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(103, 69, 139, 21);
		panel.add(name);
		
		JLabel lblNewLabel_1 = new JLabel("帳號");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(10, 99, 83, 29);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("密碼");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(10, 138, 83, 29);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("地址");
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.PLAIN, 25));
		lblNewLabel_2_1.setBounds(10, 177, 83, 29);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("行動");
		lblNewLabel_2_2.setFont(new Font("Dialog", Font.PLAIN, 25));
		lblNewLabel_2_2.setBounds(10, 216, 83, 29);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("電話");
		lblNewLabel_2_3.setFont(new Font("Dialog", Font.PLAIN, 25));
		lblNewLabel_2_3.setBounds(10, 255, 83, 29);
		panel.add(lblNewLabel_2_3);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(103, 108, 139, 21);
		panel.add(username);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(103, 147, 139, 21);
		panel.add(password);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(103, 186, 139, 21);
		panel.add(address);
		
		mobile = new JTextField();
		mobile.setColumns(10);
		mobile.setBounds(103, 225, 139, 21);
		panel.add(mobile);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(103, 264, 139, 21);
		panel.add(phone);
		
		JButton btnAdd = new JButton("新增");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* 
				* 1.UI接收 getText 
				* 2.new member() 
				* 3.add(m) 
				*/ 
				String Name=name.getText(); 
				String Username=username.getText(); 
				String Password=password.getText(); 
				String Address=address.getText(); 
				String Mobile=mobile.getText(); 
				String Phone=phone.getText(); 
				member m=new member(Name,Username,Password,Address,Mobile,Phone); 
				 
				new implMember().add(m); 
			}
		});
		btnAdd.setFont(new Font("新細明體", Font.PLAIN, 25));
		btnAdd.setBounds(46, 370, 173, 63);
		panel.add(btnAdd);
		
		JLabel lblNewLabel_4 = new JLabel("會員資料");
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(61, 10, 158, 29);
		panel.add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(341, 31, 607, 474);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea show = new JTextArea();
		show.setBounds(42, 171, 527, 246);
		panel_1.add(show);
		
		JButton queryAll = new JButton("查詢全部");
		queryAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				show.setText(new implMember().queryAll1());
				
			}
		});
		queryAll.setFont(new Font("Dialog", Font.PLAIN, 25));
		queryAll.setBounds(32, 32, 164, 35);
		panel_1.add(queryAll);
		
		JTextPane Uname = new JTextPane();
		Uname.setBounds(192, 84, 87, 32);
		panel_1.add(Uname);
		
		JTextPane Uadd = new JTextPane();
		Uadd.setBounds(350, 84, 87, 32);
		panel_1.add(Uadd);
		
		JTextPane UID = new JTextPane();
		UID.setBounds(482, 84, 87, 32);
		panel_1.add(UID);
		
		JButton revise = new JButton("修改");
		revise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=Uname.getText(); 
				String add=Uadd.getText(); 
				 
				
				int ID=Integer.parseInt(UID.getText());  
				member m=new implMember().queryId(ID); 
				m.setName(name);
				m.setAddress(add);
				 
				new implMember().update(m); 
			}
		});
		revise.setFont(new Font("Dialog", Font.PLAIN, 25));
		revise.setBounds(32, 81, 98, 35);
		panel_1.add(revise);
		
		JButton delete = new JButton("刪除");
		delete.setFont(new Font("Dialog", Font.PLAIN, 25));
		delete.setBounds(32, 126, 98, 35);
		panel_1.add(delete);
		
		JLabel lblNewLabel_3 = new JLabel("姓名");
		lblNewLabel_3.setFont(new Font("新細明體", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(140, 86, 51, 30);
		panel_1.add(lblNewLabel_3);
		
		
		
		JLabel lblNewLabel_3_1 = new JLabel("ID");
		lblNewLabel_3_1.setFont(new Font("新細明體", Font.PLAIN, 25));
		lblNewLabel_3_1.setBounds(150, 131, 51, 30);
		panel_1.add(lblNewLabel_3_1);
		
		JTextPane DID = new JTextPane();
		DID.setBounds(192, 126, 87, 32);
		panel_1.add(DID);
		
		JLabel lblNewLabel_3_2 = new JLabel("地址");
		lblNewLabel_3_2.setFont(new Font("新細明體", Font.PLAIN, 25));
		lblNewLabel_3_2.setBounds(289, 86, 51, 30);
		panel_1.add(lblNewLabel_3_2);
		
		
		
		JLabel lblNewLabel_3_2_1 = new JLabel("ID");
		lblNewLabel_3_2_1.setFont(new Font("新細明體", Font.PLAIN, 25));
		lblNewLabel_3_2_1.setBounds(449, 86, 51, 30);
		panel_1.add(lblNewLabel_3_2_1);
		
	
		
		
	}
}
