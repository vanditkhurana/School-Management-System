package application;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.swing.SwingConstants;
import java.awt.Cursor;
import javax.swing.DebugGraphics;
import java.awt.event.KeyEvent;
import java.awt.Component;

public class Login {

	private JFrame frame;
	private JTextField username;
	private JPasswordField password;
	
	ImageIcon img=new ImageIcon(this.getClass().getClassLoader().getResource("p2good.jpg"));
	ImageIcon img2=new ImageIcon(this.getClass().getClassLoader().getResource("l1com.png"));
	ImageIcon imgKey=new ImageIcon(this.getClass().getClassLoader().getResource("LKey.png"));
	ImageIcon imgUser=new ImageIcon(this.getClass().getClassLoader().getResource("LUser.png"));
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Login Page");
		frame.setBounds(100, 100, 1126, 556);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(631, 0, 481, 519);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(img2);
		lblNewLabel.setBounds(108, 10, 286, 117);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("LOG IN");
		lblNewLabel_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 29));
		lblNewLabel_2.setForeground(new Color(0, 128, 0));
		lblNewLabel_2.setBounds(202, 153, 113, 42);
		panel.add(lblNewLabel_2);
		
		username = new JTextField();
		username.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				username.setText("");
			}
		});
		username.setFont(new Font("Tahoma", Font.PLAIN, 16));
		username.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 100, 0)));
		username.setText("Enter Username Here");
		username.setBounds(108, 214, 286, 51);
		panel.add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				password.setText("");
			}
		});
		password.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 100, 0)));
		password.setFont(new Font("Tahoma", Font.PLAIN, 16));
		password.setText("Enter Password Here");
		password.setBounds(108, 289, 286, 51);
		panel.add(password);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("show password");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					password.setEchoChar((char)0);
				}else {
					password.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxNewCheckBox.setBounds(190, 346, 125, 25);
		panel.add(chckbxNewCheckBox);
		
		
		
		JButton connect = new JButton("CONNECT");
		connect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				  
				  try {
				   Class.forName("com.mysql.cj.jdbc.Driver");
				   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projdb?serverTimezone=UTC","root",""); 
				   Statement st=con.createStatement();
				   ResultSet rs=st.executeQuery("SELECT * FROM `rawdb` WHERE username='"+username.getText().toString()+"' and password='"+password.getText().toString()+"'");
				   if(rs.next()) {
					   JOptionPane.showMessageDialog(null, "Login Successfully");
				   new Dashboard();
				   frame.dispose();
				   }
				   else
					   JOptionPane.showMessageDialog(null, "Check your Username and Password");
					   
				  
				   
				   con.close();   
				   
				  } catch (ClassNotFoundException e1) {
				   // TODO Auto-generated catch block
				   e1.printStackTrace();
				  
				  }
				  catch (SQLException e1) {
				   // TODO Auto-generated catch block
				   e1.printStackTrace();
				  }
			}
		});
		connect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				connect.setBackground(Color.green);
				connect.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				connect.setBackground(Color.white);
				connect.setForeground(Color.green);
			}
		});
		connect.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 255, 0)));
		connect.setFont(new Font("Tahoma", Font.PLAIN, 18));
		connect.setForeground(new Color(0, 255, 0));
		connect.setBackground(new Color(255, 255, 255));
		connect.setBounds(170, 387, 158, 42);
		panel.add(connect);
		
		JLabel lblNewLabel_3 = new JLabel("Note:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setForeground(new Color(0, 100, 0));
		lblNewLabel_3.setBounds(108, 457, 45, 13);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("If facing any issue contect school authority");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(163, 456, 246, 17);
		panel.add(lblNewLabel_4);
		
		JLabel email = new JLabel("[mySchool@id.me.com]");
		email.setFont(new Font("Tahoma", Font.PLAIN, 12));
		email.setForeground(new Color(0, 100, 0));
		email.setBounds(202, 468, 139, 30);
		panel.add(email);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(imgUser);
		lblNewLabel_5.setBounds(47, 223, 45, 42);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(imgKey);
		lblNewLabel_6.setBounds(47, 290, 51, 51);
		panel.add(lblNewLabel_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 632, 519);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_1.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel_1.setIcon(img);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_1.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(0, 0, 632, 519);
		panel_1.add(lblNewLabel_1);		
	}
	
}
