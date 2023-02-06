package Controller.Test;

import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.porder.implPorder;
import Model.porder;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;

import javax.crypto.spec.DESKeySpec;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class porderUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					porderUI frame = new porderUI();
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
	public porderUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 676, 499);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("點餐系統");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 36));
		lblNewLabel.setBounds(10, 10, 184, 47);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("桌號");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(10, 106, 56, 40);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("A:");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(30, 156, 56, 40);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("B:");
		lblNewLabel_1_2.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblNewLabel_1_2.setBounds(30, 211, 56, 40);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("C:");
		lblNewLabel_1_3.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblNewLabel_1_3.setBounds(30, 261, 56, 40);
		panel.add(lblNewLabel_1_3);
		
		JTextArea desk = new JTextArea();
		desk.setBounds(76, 115, 56, 25);
		panel.add(desk);
		
		JButton add = new JButton("新增");
		
		
		
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add.setFont(new Font("新細明體", Font.PLAIN, 36));
		add.setBounds(10, 312, 129, 57);
		panel.add(add);
		
		JTextArea A = new JTextArea();
		A.setBounds(76, 165, 56, 25);
		panel.add(A);
		
		JTextArea B = new JTextArea();
		B.setBounds(76, 220, 56, 25);
		panel.add(B);
		
		JTextArea C = new JTextArea();
		C.setBounds(76, 270, 56, 25);
		panel.add(C);
		
		JButton selectAll = new JButton("查詢(全部)");
		
		
		selectAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		selectAll.setFont(new Font("新細明體", Font.PLAIN, 24));
		selectAll.setBounds(181, 51, 150, 33);
		panel.add(selectAll);
		
		JButton update = new JButton("修改");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		update.setFont(new Font("新細明體", Font.PLAIN, 24));
		update.setBounds(181, 91, 94, 33);
		panel.add(update);
		
		JButton delete = new JButton("刪除");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		delete.setFont(new Font("新細明體", Font.PLAIN, 24));
		delete.setBounds(181, 127, 94, 33);
		panel.add(delete);
		
		JTextArea rdesk = new JTextArea();
		rdesk.setBounds(351, 96, 51, 25);
		panel.add(rdesk);
		
		JLabel lblNewLabel_2 = new JLabel("桌號");
		lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(284, 91, 62, 33);
		panel.add(lblNewLabel_2);
		
		JTextArea id = new JTextArea();
		id.setBounds(351, 132, 51, 25);
		panel.add(id);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblId.setBounds(284, 127, 62, 33);
		panel.add(lblId);
		
		JTextArea rA = new JTextArea();
		rA.setBounds(429, 96, 51, 25);
		panel.add(rA);
		
		JLabel lblA = new JLabel("A");
		lblA.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblA.setBounds(412, 91, 25, 33);
		panel.add(lblA);
		
		JTextArea rB = new JTextArea();
		rB.setBounds(503, 96, 62, 25);
		panel.add(rB);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("B");
		lblNewLabel_1_1_1.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblNewLabel_1_1_1.setBounds(485, 91, 62, 33);
		panel.add(lblNewLabel_1_1_1);
		
		JTextArea rC = new JTextArea();
		rC.setBounds(604, 96, 51, 25);
		panel.add(rC);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("C");
		lblNewLabel_1_1_1_1.setFont(new Font("新細明體", Font.PLAIN, 24));
		lblNewLabel_1_1_1_1.setBounds(575, 91, 37, 33);
		panel.add(lblNewLabel_1_1_1_1);
		
		JTextArea showall = new JTextArea();
		showall.setBounds(189, 165, 455, 307);
		panel.add(showall);
		
		//新增
		add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.擷取UI getText
				 * 2.A,B,C 轉型 int
				 * 3.new porder
				 * 4.add(p)
				 */
				
				String DESK=desk.getText();
				int a =Integer.parseInt(A.getText());
				int b =Integer.parseInt(B.getText());
				int c =Integer.parseInt(C.getText());
				porder p=new porder(a,b,c,DESK);
				new implPorder().add(p);
				
				
			}
		});
		
		//查詢all
		selectAll.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				/*
				 * 1.List<porder> l -->selectAll()
				 * 2.String -->for each -->顯示
				 * 3.List -->轉陣列 --> toArray 顯示,統計分析
				 */
				
				/*List<porder> l = new implPorder().selectAll();
				String show="";
				
				for(porder p:l)
				{
					show = show+"id="+p.getId()+"\t 桌號="+
							p.getDesk()+"\t A="+p.getA()+
							"\t B="+p.getB()+
							"\t C="+p.getC()+"\n";
				}
				showall.setText(show);*/
				List<porder> l = new implPorder().selectAll();
				
				porder[] p=l.toArray(new porder[l.size()]);
				//porder [] p=new porder[3];
				//System.out.println(p[0].getId()+"\t"+p[0].getDesk());
				String show="";
				int sum=0;
				int sumB=0;
				String Z="\n==========\n";
				for (porder P:p)
				{
					show=show+"id:"+P.getId()+
							"\t桌號:"+P.getDesk()+
							"\tA:"+P.getA()+
							"\tB:"+P.getB()+
							"\tC:"+P.getC()+
							"\n";
				}
				for(int i=0;i<p.length;i++)
				{
					sum=sum+p[i].getA();
					sumB=sumB+p[i].getB();
				}
				
				showall.setText(show+"\nA:總共="+sum+Z+"B:總共="+sumB);
				
			
				
				
				
			}
		});
		
		//修改
		update.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.擷取 -->所有 getText
				 * 2.rA,rB,rC,id String -->int
				 * 3.selectID -->id
				 * 4.porder-->set 修改
				 * 5.update
				 */
				String DESK=rdesk.getText();
				int A =Integer.parseInt(rA.getText());
				int B =Integer.parseInt(rB.getText());
				int C =Integer.parseInt(rC.getText());
				int ID=Integer.parseInt(id.getText());
				porder p=new implPorder().selectId(ID);
				p.getDesk();
				p.getA();
				p.getB();
				p.getC();
				
				new implPorder().update(p);
				
			}
		});
		
		//刪除
		delete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*1.擷取-->id -->轉型 int
				 *2. 執行--> delete
				 */
			int ID=Integer.parseInt(id.getText());
			new implPorder().delete(ID);
			}
		});
	}
	
	
}
