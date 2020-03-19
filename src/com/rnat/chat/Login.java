package com.rnat.chat;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAddress;
	private JTextField txtPort;
	private JLabel lblIpAddress;
	private JLabel lblPort;
	private JLabel lblAddressDesc;
	private JLabel lblPortDesc;

	public Login() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 380);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.black);

		txtName = new JTextField();
		txtName.setBounds(467, 50, 165, 28);
		contentPane.add(txtName);
		txtName.setColumns(10);
		

		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(527, 34, 45, 16);
		contentPane.add(lblName);
		lblName.setForeground(Color.white);

		txtAddress = new JTextField();
		txtAddress.setBounds(467, 116, 165, 28);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);

		lblIpAddress = new JLabel("IP Address:");
		lblIpAddress.setBounds(511, 96, 77, 16);
		contentPane.add(lblIpAddress);
		lblIpAddress.setForeground(Color.white);

		txtPort = new JTextField();
		txtPort.setColumns(10);
		txtPort.setBounds(467, 191, 165, 28);
		contentPane.add(txtPort);

		lblPort = new JLabel("Port:");
		lblPort.setBounds(533, 171, 34, 16);
		contentPane.add(lblPort);
		lblPort.setForeground(Color.white);

		lblAddressDesc = new JLabel("(eg. 192.168.0.2)");
		lblAddressDesc.setBounds(494, 142, 112, 16);
		contentPane.add(lblAddressDesc);
		lblAddressDesc.setForeground(Color.white);

		lblPortDesc = new JLabel("(eg. 8192)");
		lblPortDesc.setBounds(516, 218, 68, 16);
		contentPane.add(lblPortDesc);
		lblPortDesc.setForeground(Color.white);
		
		JLabel imageLabel = new JLabel();
		imageLabel.setBounds(100, 50, 274, 172);
		imageLabel.setIcon(new ImageIcon("D:\\Project\\R-NAT\\R-NAT\\src\\com\\rnat\\chat\\rnat.png"));
		contentPane.add(imageLabel);
		
		

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				String address = txtAddress.getText();
				int port = Integer.parseInt(txtPort.getText());
				login(name, address, port);
			}
		});
		btnLogin.setBounds(491, 250, 117, 29);
		contentPane.add(btnLogin);
		btnLogin.setBackground(Color.GRAY);
	}

	private void login(String name, String address, int port) {
		dispose();
		new ClientWindow(name, address, port);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
