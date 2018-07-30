package odev;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

import java.awt.Font;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFileChooser;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.SystemColor;

public class settings extends JPanel {

	/**
	 * Create the panel.
	 */
	Image image;
	String fileUrl="";
	String username="";

	DatabaseConnection i1 = new DatabaseConnection();
	
	private JTextField txtNickname;
	private JPasswordField txtPassword;
	private JPasswordField oldPassword;
	private JTextField oldUserName;
	private JLabel oldUserNamej;
	private JLabel oldPasswordj;
	
	
	public settings(User user) 
	{
		
		System.out.println(user.imageURL);
	    image=new ImageIcon(user.imageURL).getImage();
		setBackground(new Color(34,34,34));
		setLayout(null);
		setBounds(100,100,930,548);
		
		JLabel lblSetting = new JLabel("SETTINGS");
		lblSetting.setBounds(15, 0, 181, 54);
        lblSetting.setForeground(new Color(219,88,0));
		lblSetting.setFont(new Font("Tahoma", Font.BOLD, 16));
		add(lblSetting);

		
		JLabel lblEnterNewNickname = new JLabel("Enter new nickname:");
        lblEnterNewNickname.setForeground(new Color(255,255,255));      
        lblEnterNewNickname.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterNewNickname.setBounds(15, 38, 181, 54);
		add(lblEnterNewNickname);
		
		JLabel label = new JLabel("Enter new password:");
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(15, 108, 181, 54);
		add(label);
        label.setForeground(new Color(255,255,255));

//		
//		JLabel label_1 = new JLabel("Choose new avatar:");
//		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
//		label_1.setBounds(15, 177, 216, 54);
//                label_1.setForeground(new Color(255,255,255));
//
//		add(label_1);
		
		
		JLabel oldUserNamej = new JLabel("Enter old nickname:");
		oldUserNamej.setFont(new Font("Tahoma", Font.BOLD, 16));
		oldUserNamej.setBounds(15, 68, 181, 54);
		oldUserNamej.setForeground(Color.white);
		add(oldUserNamej);
		
		JLabel oldPasswordj = new JLabel("Enter old password:");
		oldPasswordj.setFont(new Font("Tahoma", Font.BOLD, 16));
		oldPasswordj.setBounds(15, 137, 216, 54);
		oldPasswordj.setForeground(Color.white);
		add(oldPasswordj);
		
//		JButton BUTON = new JButton("OPEN!");
//		BUTON.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//		      
//				JFileChooser fileChooser = new JFileChooser();
//				FileFilter imageFilter = new FileNameExtensionFilter(
//					    "Image files", ImageIO.getReaderFileSuffixes());
//				fileChooser.setFileFilter(imageFilter);
//		        int returnValue = fileChooser.showOpenDialog(null);
//		        if (returnValue == JFileChooser.APPROVE_OPTION) {
//		          String selectedFile = fileChooser.getSelectedFile().getPath();
//		          fileUrl=selectedFile;
//		          
//		        }
//			}
//		});
//		BUTON.setFont(new Font("Tahoma", Font.BOLD, 16));
//		BUTON.setBounds(229, 175, 90, 58);
//		add(BUTON);
		
		txtNickname = new JTextField();
		txtNickname.setFont(new Font("Tahoma", Font.ITALIC, 14));
		txtNickname.setBackground(SystemColor.controlHighlight);
		txtNickname.setText("Nickname");
		txtNickname.setBounds(194, 52, 146, 26);
		add(txtNickname);
		txtNickname.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setText("Password");
		txtPassword.setFont(new Font("Tahoma", Font.ITALIC, 14));
		txtPassword.setColumns(10);
		txtPassword.setBackground(SystemColor.controlHighlight);
		txtPassword.setBounds(194, 123, 146, 26);
		add(txtPassword);
		
		oldUserName = new JTextField();
		oldUserName.setFont(new Font("Tahoma", Font.ITALIC, 14));
		oldUserName.setBackground(SystemColor.controlHighlight);
		oldUserName.setText("Old Nickname");
		oldUserName.setBounds(194, 79, 146, 26);
		add(oldUserName);
		oldUserName.setColumns(10);
		
		oldPassword = new JPasswordField();
		oldPassword.setText("Old Password");
		oldPassword.setFont(new Font("Tahoma", Font.ITALIC, 14));
		oldPassword.setColumns(10);
		oldPassword.setBackground(SystemColor.controlHighlight);
		oldPassword.setBounds(194, 150, 146, 26);
		add(oldPassword);
		
		JButton btnSaveChanges = new JButton("Save Changes!");
		btnSaveChanges.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				
				i1.dbConnection();
				String oldName = oldUserName.getText();
				System.out.println("Oldnam:"+oldName);
				@SuppressWarnings("deprecation")
				String oldP = oldPassword.getText(); 
				
				System.out.println("Oldp:"+oldP);
				User y1 = i1.check(oldName, oldP);
			
				if(y1==null)
				{
					
					System.out.println("null");
				}
				
				else
					System.out.println("null deðil");
				
			
				username=txtNickname.getText();
			
				@SuppressWarnings("deprecation")
				String password=txtPassword.getText();
				image=new ImageIcon(fileUrl).getImage();
				
				y1.setPassword(password);
				y1.setUserName(username);
				System.out.println("assda");
				i1.updateUserInfo(y1);
				i1.updateUserInfo2(y1);
				repaint();
				
				
				
				
				
			}
		});
		
		btnSaveChanges.setBackground(new Color(219,88,0));
		btnSaveChanges.setBounds(194, 190, 146, 29);
		add(btnSaveChanges);
		
		


	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		 g.drawImage(image,330,330,150,150,null);
		 

	}
}
