package doan1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class rap extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rap frame = new rap();
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
	public rap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 703);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelFormrap = new JPanel();
		panelFormrap.setBackground(new Color(255, 255, 102));
		panelFormrap.setBounds(188, 11, 78, 26);
		contentPane.add(panelFormrap);
		
		JLabel lblNewLabel = new JLabel("Rap");
		panelFormrap.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(109, 59, 157, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(109, 90, 157, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ten rap");
		lblNewLabel_1.setBounds(39, 62, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Dia chi");
		lblNewLabel_2.setBounds(39, 96, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Tim kiem");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(getParent(), "tim thay rap");
			}
		});
		btnNewButton.setBackground(new Color(211, 211, 211));
		btnNewButton.setBounds(177, 232, 89, 23);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 255, 153));
		panel.setBounds(10, 11, 426, 194);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Loai rap");
		lblNewLabel_3.setBounds(27, 120, 46, 14);
		panel.add(lblNewLabel_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("CGV");
		chckbxNewCheckBox.setBounds(0, 141, 97, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Lotte");
		chckbxNewCheckBox_1.setBounds(171, 141, 97, 23);
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Galaxy");
		chckbxNewCheckBox_2.setBounds(329, 141, 97, 23);
		panel.add(chckbxNewCheckBox_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 204, 255));
		panel_1.setBounds(10, 266, 426, 317);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 102));
		panel_2.setBounds(171, 0, 82, 27);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_4 = new JLabel("VE");
		lblNewLabel_4.setBackground(new Color(255, 255, 51));
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gia ve");
		lblNewLabel_5.setBounds(34, 41, 46, 14);
		panel_1.add(lblNewLabel_5);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Thuong");
		chckbxNewCheckBox_3.setBounds(6, 80, 97, 23);
		panel_1.add(chckbxNewCheckBox_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(89, 38, 86, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Food and drink");
		chckbxNewCheckBox_4.setBounds(156, 80, 97, 23);
		panel_1.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("VIP");
		chckbxNewCheckBox_5.setBounds(323, 80, 97, 23);
		panel_1.add(chckbxNewCheckBox_5);
		
		JLabel lblNewLabel_6 = new JLabel("Loai ve");
		lblNewLabel_6.setBounds(34, 126, 46, 14);
		panel_1.add(lblNewLabel_6);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("2D");
		chckbxNewCheckBox_6.setBounds(6, 149, 97, 23);
		panel_1.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("3D");
		chckbxNewCheckBox_7.setBounds(156, 149, 97, 23);
		panel_1.add(chckbxNewCheckBox_7);
		
		JButton btnNewButton_1 = new JButton("Dac biet");
		btnNewButton_1.setBounds(323, 149, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("Tinh trang ve");
		lblNewLabel_7.setBounds(34, 190, 86, 14);
		panel_1.add(lblNewLabel_7);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("Con");
		chckbxNewCheckBox_8.setBounds(6, 211, 97, 23);
		panel_1.add(chckbxNewCheckBox_8);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("Het");
		chckbxNewCheckBox_9.setBounds(156, 211, 97, 23);
		panel_1.add(chckbxNewCheckBox_9);
		
		JLabel lblNewLabel_8 = new JLabel("So luong");
		lblNewLabel_8.setBounds(34, 265, 46, 14);
		panel_1.add(lblNewLabel_8);
		
		textField_3 = new JTextField();
		textField_3.setBounds(89, 262, 86, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Ban ve");
		btnNewButton_2.setBounds(177, 594, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
