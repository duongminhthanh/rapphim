package doan1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.Scanner;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class nguoidung extends JFrame {

	private JPanel contentPane;
	private JTextField txtTaikhoan;
	private JTextField txtMatkhau;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nguoidung frame = new nguoidung();
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
	public nguoidung() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelFormdangnhap = new JPanel();
		panelFormdangnhap.setBackground(new Color(255, 250, 205));
		panelFormdangnhap.setBounds(10, 11, 414, 50);
		contentPane.add(panelFormdangnhap);
		
		JLabel lblDangnhap = new JLabel("Dang nhap");
		lblDangnhap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelFormdangnhap.add(lblDangnhap);
		
		JLabel lbTaikhoan = new JLabel("Tai khoan");
		lbTaikhoan.setBounds(10, 72, 58, 14);
		contentPane.add(lbTaikhoan);
		
		JLabel lblMatkhau = new JLabel("Mat khau");
		lblMatkhau.setBounds(10, 121, 58, 14);
		contentPane.add(lblMatkhau);
		
		txtTaikhoan = new JTextField();
		txtTaikhoan.setBounds(154, 72, 221, 20);
		contentPane.add(txtTaikhoan);
		txtTaikhoan.setColumns(10);
		
		txtMatkhau = new JTextField();
		txtMatkhau.setBounds(154, 118, 221, 20);
		contentPane.add(txtMatkhau);
		txtMatkhau.setColumns(10);
		
		JPanel panelButton = new JPanel();
		panelButton.setBackground(new Color(210, 180, 140));
		panelButton.setBounds(10, 72, 414, 78);
		contentPane.add(panelButton);
		
		JPanel panelFormthongbao = new JPanel();
		panelFormthongbao.setBackground(new Color(144, 238, 144));
		panelFormthongbao.setBounds(10, 194, 414, 56);
		contentPane.add(panelFormthongbao);
		panelFormthongbao.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(100, 149, 237));
		panel_1.setBounds(10, 152, 414, 42);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnDangnhap = new JButton("Dang nhap");
		btnDangnhap.setBounds(43, 11, 104, 23);
		panel_1.add(btnDangnhap);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTaikhoan.setText(null);
				txtMatkhau.setText(null);
				JOptionPane.showMessageDialog(getParent(), "moi ban nhap tai khoan va mat khau");
			}
		});
		btnReset.setBounds(268, 11, 112, 23);
		panel_1.add(btnReset);
		btnDangnhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(getParent(), "danh nhap thanh cong");

			}
		});
		
		
	}
}
