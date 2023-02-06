package Controller.main.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class addError extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addError frame = new addError();
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
	public addError() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(62, 28, 329, 207);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("輸入錯誤");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 20));
		lblNewLabel.setBounds(109, 40, 88, 31);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("帳號重覆");
		btnNewButton.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnNewButton.setBounds(87, 81, 134, 39);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("重新註冊");
		btnNewButton_1.setFont(new Font("新細明體", Font.PLAIN, 20));
		btnNewButton_1.setBounds(87, 130, 134, 39);
		panel.add(btnNewButton_1);
	}

}
