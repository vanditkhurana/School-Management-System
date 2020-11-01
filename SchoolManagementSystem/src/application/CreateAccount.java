package application;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateAccount {

	private JFrame frame;
	
	ImageIcon imgLogo=new ImageIcon(this.getClass().getClassLoader().getResource("l1com.png"));
	ImageIcon imgGif=new ImageIcon(this.getClass().getClassLoader().getResource("g1.gif"));
	private JTextField schoolidField;
	private JTextField nameField;
	private JTextField phonenumberField;
	private JTextField addressField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAccount window = new CreateAccount();
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
	public CreateAccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1126, 556);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel ImagePanel = new JPanel();
		ImagePanel.setToolTipText("Select");
		ImagePanel.setBorder(new MatteBorder(1, 1, 1, 0, (Color) new Color(0, 0, 0)));
		ImagePanel.setBackground(Color.WHITE);
		ImagePanel.setBounds(0, 0, 456, 519);
		frame.getContentPane().add(ImagePanel);
		ImagePanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(imgLogo);
		lblNewLabel.setBounds(78, 10, 301, 140);
		ImagePanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(imgGif);
		lblNewLabel_1.setBounds(10, 204, 446, 205);
		ImagePanel.add(lblNewLabel_1);
		
		JPanel TextPanel = new JPanel();
		TextPanel.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
		TextPanel.setBackground(new Color(255, 255, 255));
		TextPanel.setBounds(454, 0, 658, 519);
		frame.getContentPane().add(TextPanel);
		TextPanel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Create Your Account");
		lblNewLabel_2.setForeground(Color.GREEN);
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 29));
		lblNewLabel_2.setBounds(194, 22, 301, 64);
		TextPanel.add(lblNewLabel_2);
		
		JLabel schoolidLabel = new JLabel("School ID");
		schoolidLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		schoolidLabel.setBounds(131, 107, 91, 31);
		TextPanel.add(schoolidLabel);
		
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nameLabel.setBounds(131, 165, 91, 31);
		TextPanel.add(nameLabel);
		
		JLabel phonenumberLabel = new JLabel("Phone Number");
		phonenumberLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		phonenumberLabel.setBounds(131, 229, 132, 25);
		TextPanel.add(phonenumberLabel);
		
		JLabel addressLabel = new JLabel("Address");
		addressLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		addressLabel.setBounds(131, 291, 124, 25);
		TextPanel.add(addressLabel);
		
		JLabel professionLabel = new JLabel("Profession");
		professionLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		professionLabel.setBounds(131, 354, 124, 25);
		TextPanel.add(professionLabel);
		
		JLabel classLabel = new JLabel("Class");
		classLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		classLabel.setBounds(131, 413, 91, 25);
		TextPanel.add(classLabel);
		
		schoolidField = new JTextField();
		schoolidField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				schoolidField.setText("");
			}
		});
		schoolidField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		schoolidField.setForeground(new Color(192, 192, 192));
		schoolidField.setText("Enter Here");
		schoolidField.setBounds(414, 107, 137, 31);
		TextPanel.add(schoolidField);
		schoolidField.setColumns(10);
		
		nameField = new JTextField();
		nameField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				nameField.setText("");
			}
		});
		nameField.setText("Enter Here");
		nameField.setForeground(new Color(192, 192, 192));
		nameField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nameField.setBounds(414, 165, 137, 31);
		TextPanel.add(nameField);
		nameField.setColumns(10);
		
		phonenumberField = new JTextField();
		phonenumberField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				phonenumberField.setText("");
			}
		});
		phonenumberField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		phonenumberField.setForeground(new Color(192, 192, 192));
		phonenumberField.setText("Enter Here");
		phonenumberField.setBounds(414, 223, 137, 31);
		TextPanel.add(phonenumberField);
		phonenumberField.setColumns(10);
		
		addressField = new JTextField();
		addressField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addressField.setText("");
			}
		});
		addressField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		addressField.setForeground(new Color(192, 192, 192));
		addressField.setText("Enter Here");
		addressField.setBounds(414, 285, 137, 31);
		TextPanel.add(addressField);
		addressField.setColumns(10);
		
		String profession[]= {"Student", "Teacher"};
		JComboBox professionBox = new JComboBox(profession);
		professionBox.setBackground(Color.WHITE);
		professionBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		professionBox.setBounds(414, 350, 137, 31);
		TextPanel.add(professionBox);
		
		String classes[]= {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII"};
		JComboBox classBox = new JComboBox(classes);
		classBox.setBackground(Color.WHITE);
		classBox.setBounds(414, 407, 137, 31);
		TextPanel.add(classBox);
		
		JButton createAccount = new JButton("Create Account");
		createAccount.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 255, 0)));
		createAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				createAccount.setBackground(Color.green);
				createAccount.setForeground(Color.white);
				createAccount.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				createAccount.setBackground(Color.white);
				createAccount.setForeground(Color.green);
				createAccount.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 255, 0)));
			}
		});
		createAccount.setBackground(Color.white);
		createAccount.setForeground(Color.green);
		createAccount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		createAccount.setBounds(251, 463, 175, 46);
		TextPanel.add(createAccount);
		
		JButton cancelButton = new JButton("Back");
		cancelButton.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cancelButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		cancelButton.setBackground(new Color(0, 255, 0));
		cancelButton.setForeground(new Color(255, 255, 255));
		cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cancelButton.setBounds(557, 10, 91, 40);
		TextPanel.add(cancelButton);
	}
}
