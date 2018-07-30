package odev;

import javax.naming.ldap.Rdn;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;



import java.awt.Font;

public class IntroPage extends JPanel implements ActionListener {
	DatabaseConnection i1 = new DatabaseConnection();
	private JTextField userField;
	private JPasswordField pwField;
	private JTextField firstName;
	private JTextField lastName;
	private JPasswordField txtNewPassword;
	private  JRadioButton rdbtnF ;
	private JRadioButton rdbtnM; 
	private  JButton loginButon;
	private  JButton btnSignIn;
	private JLabel lblDontHaveA;
	boolean isTrue;
	static User newUser;


	
	MainFrame f;
	
	public IntroPage()
	{
		
	}
	public IntroPage(MainFrame f) 
	{
		setBackground(new Color(34,34,34));
		setForeground(new Color(34,34,34));
		setLayout(null);
		this.f=f;
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(200, 30, 93, 20);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(425, 30, 183, 20);
		add(lblNewLabel_1);
		
		userField = new JTextField();
		userField.setText("Nickname");
		userField.setBackground(Color.GRAY);
		userField.setBounds(200, 50, 200, 40);
		add(userField);
		userField.setColumns(10);
		
		pwField = new JPasswordField();
		pwField.setText("Password");
		pwField.setBackground(Color.GRAY);
		pwField.setBounds(425, 50, 200, 40);
		add(pwField);
		pwField.setColumns(10);
		
		firstName = new JTextField();
		firstName.setText("User Name");
		firstName.setColumns(10);
		firstName.setBackground(Color.GRAY);
		firstName.setBounds(200, 257, 200, 36);
		add(firstName);

		
		txtNewPassword = new JPasswordField();
		txtNewPassword.setText("New Password");
		txtNewPassword.setForeground(Color.WHITE);
		txtNewPassword.setBackground(Color.GRAY);
		txtNewPassword.setBounds(200, 297, 200, 36);
		add(txtNewPassword);
		txtNewPassword.setColumns(10);
		
		loginButon = new JButton("LOG IN");
		loginButon.addActionListener(this);
		loginButon.setBounds(510, 105, 115, 50);
		add(loginButon);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(Color.white);
		lblGender.setBounds(200, 358, 69, 20);
		add(lblGender);
		
		rdbtnF = new JRadioButton("F");
		rdbtnF.setBackground(new Color(34, 34, 34));
		rdbtnF.setForeground(Color.white);
		rdbtnF.setBounds(280, 335, 45, 29);
		add(rdbtnF);
		
		rdbtnM = new JRadioButton("M");
		rdbtnM.setBackground(new Color(34,34,34));
		rdbtnM.setForeground(Color.white);
		rdbtnM.setBounds(280, 372, 45, 29);
		add(rdbtnM);
		
		btnSignIn = new JButton("SIGN IN!");
		btnSignIn.addActionListener(this);
		btnSignIn.setBounds(510, 265, 115, 50);
		add(btnSignIn);
		
		rdbtnF.addActionListener(this);
		rdbtnM.addActionListener(this);
		
		lblDontHaveA = new JLabel("Dont have a profile?");
		lblDontHaveA.setForeground(new Color(255, 255, 255));
		lblDontHaveA.setBackground(new Color(255, 255, 255));
		lblDontHaveA.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblDontHaveA.setBounds(200, 194, 378, 63);
		add(lblDontHaveA);
		
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
				if(e.getSource()==rdbtnF)
				{
					rdbtnM.setSelected(false);
				}
				if(e.getSource()==rdbtnM)
				{
					rdbtnF.setSelected(false);
				}
				if(e.getSource()==loginButon)
				{
					i1.dbConnection();
					
					String kullaniciAdi=userField.getText();
					String parola=pwField.getText();
					
		
					
					 newUser=i1.check(kullaniciAdi, parola);
					if(newUser!=null)
					{
						boolean isTrue=true;
					}
					else
					{
						 isTrue=false;
					}
					
					if(newUser !=null)
					{
						setVisible(false);
						getParent().add(new firstPanel(newUser,f));
						getParent().repaint();
					}
					else
					{
						System.out.println("Wrong id&pw");
					}

					

					
					

				}
				if(e.getSource()==btnSignIn)
				{
					
					i1.dbConnection();
					
					String name=firstName.getText();
					@SuppressWarnings("deprecation")
					String parola=txtNewPassword.getText();
					String gender="";
					if(rdbtnF.isSelected()==true)
					{
						gender="female";
					}
					else if(rdbtnM.isSelected()==true)
					{
						gender="male";
					}
					
					User newUser=new User(i1.getLastIndex()+1,name,parola,gender);
					
					
					i1.addUser(newUser);
					
					
					if(newUser !=null)
					{
						setVisible(false);
						getParent().add(new firstPanel(newUser,f));
						getParent().repaint();
					}
				}
	}
}
