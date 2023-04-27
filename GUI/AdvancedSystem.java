
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdvancedSystem {

	public static void LoginModule() {
		 
		JFrame libraryManagement = new JFrame("Admin/Librarian Login");    
		JPanel homePanel = new JPanel();
		JLabel libraryManagementLabel = new JLabel("Advanced Library System :)");
		JButton adminButton = new JButton("Admin Login");
		JButton librarianButton = new JButton("Librarian Login");
		
		libraryManagementLabel.setBounds(120, 30, 220, 60);
		libraryManagementLabel.setLayout(null);
		libraryManagementLabel.setFont(new Font("Serif Plain", Font.BOLD, 12));    
		
		adminButton.setBounds(120, 100, 150, 40);
		adminButton.setFocusable(false);
		adminButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				libraryManagement.dispose();
				adminLoginPage();
			}
		});
		
		librarianButton.setBounds(120, 160, 150, 40);
		librarianButton.setFocusable(false);
		librarianButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				libraryManagement.dispose();
				librarianLoginPage();
			}
		});
		
		homePanel.setLayout(null);
		homePanel.add(libraryManagementLabel);
		homePanel.add(adminButton);
		homePanel.add(librarianButton);
		
		
		libraryManagement.setLocation(400, 100);
		libraryManagement.setSize(400, 300);
		libraryManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		libraryManagement.setLayout(null);
		libraryManagement.setVisible(true);	
		libraryManagement.add(homePanel);
		libraryManagement.add(libraryManagementLabel);
		libraryManagement.add(adminButton);
		libraryManagement.add(librarianButton);
	}
	
	public static void adminLoginPage() {
		
		JFrame adminLoginFrame = new JFrame("Admin Login");
		JPanel adminFramePanel = new JPanel();
		JLabel adminUser = new JLabel("Username:");
		JLabel adminPass = new JLabel("Password:");
		JTextField adminUserTxt = new JTextField();
		JPasswordField adminPassTxt = new JPasswordField();
		JButton loginButton = new JButton("Login");
		
		adminUser.setBounds(50, 95, 80, 25);
		adminPass.setBounds(50, 140, 80, 25);
		
	
		adminUserTxt.setLayout(null);
		adminUserTxt.setBounds(120, 95, 200, 25);
		adminPassTxt.setLayout(null);
		adminPassTxt.setBounds(120, 140, 200, 25);
		
		loginButton.setLayout(null);
		loginButton.setBounds(165, 190, 115, 40);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = adminUserTxt.getText();
				String password = adminPassTxt.getText();
				
				if ((username.equals("Admin_01") && password.equals("AdminOne")) || (username.equals("Admin_02") && password.equals("AdminTwo")) || (username.equals("Admin_03") && password.equals("AdminThree"))) {
					JOptionPane.showMessageDialog(adminLoginFrame, "SUCCESFULLY LOGIN");
					adminLoginFrame.dispose();
					adminModule();

				} else if ((!username.equals("Admin_01") && password.equals("AdminOne")) || (!username.equals("Admin_02") && password.equals("AdminTwo")) || (!username.equals("Admin_03") && password.equals("AdminThree"))) {
					JOptionPane.showMessageDialog(adminLoginFrame, "INCORRECT USERNAME");
					
				} else if ((username.equals("Admin_01") && !password.equals("AdminOne")) || (username.equals("Admin_02") && !password.equals("AdminTwo")) || (username.equals("Admin_03") && !password.equals("AdminThree"))) {
					JOptionPane.showMessageDialog(adminLoginFrame, "INCORRECT PASSWORD");
					
				} else if ((!username.equals("Admin_01") && !password.equals("AdminOne")) || (!username.equals("Admin_02") && !password.equals("AdminTwo")) || (!username.equals("Admin_03") && !password.equals("AdminThree"))) {
					JOptionPane.showMessageDialog(adminLoginFrame, "INCORRECT USERNAME and PASSWORD");
					
				} 
			}
		});
		

		adminFramePanel.setLayout(null);
		adminFramePanel.add(adminUser);
		adminFramePanel.add(adminPass);
		adminFramePanel.add(adminUserTxt);
		adminFramePanel.add(adminPassTxt);
		adminFramePanel.add(loginButton);
		
		adminLoginFrame.setLocation(400, 100);
		adminLoginFrame.setSize(400, 300);
		adminLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminLoginFrame.setLayout(null);
		adminLoginFrame.setVisible(true);
		adminLoginFrame.add(adminFramePanel);
		adminLoginFrame.add(adminUser);
		adminLoginFrame.add(adminPass);
		adminLoginFrame.add(adminUserTxt);
		adminLoginFrame.add(adminPassTxt);
		adminLoginFrame.add(loginButton);
		
	}
	
	public static void librarianLoginPage() {
		
		JFrame librarianLoginFrame = new JFrame("Librarian Login");
		JPanel librarianFramePanel = new JPanel();
		JLabel librarianUser = new JLabel("Username:");
		JLabel librarianPass = new JLabel("Password:");
		JTextField librarianUserTxt = new JTextField();
		JPasswordField librarianPassTxt = new JPasswordField();
		JButton loginButton = new JButton("Login");
		
		librarianUser.setBounds(50, 95, 80, 25);
		librarianPass.setBounds(50, 140, 80, 25);
		
		librarianUserTxt.setLayout(null);
		librarianUserTxt.setBounds(120, 95, 200, 25);
		librarianPassTxt.setLayout(null);
		librarianPassTxt.setBounds(120, 140, 200, 25);
		
		loginButton.setLayout(null);
		loginButton.setBounds(165, 190, 115, 40);
		loginButton.addActionListener(new ActionListener() {
        
			public void actionPerformed(ActionEvent e) {
				String username = librarianUserTxt.getText();
				String password = librarianPassTxt.getText();
				
				if ((username.equals("Librarian_01") && password.equals("LibOne")) || (username.equals("Librarian_02") && password.equals("LibTwo")) || (username.equals("Librarian_03") && password.equals("LibThree"))) {
					JOptionPane.showMessageDialog(librarianLoginFrame, "SUCCESFULLY LOGIN");
					librarianLoginFrame.dispose();
					librarianModule();
			
				} else if ((!username.equals("Librarian_01") && password.equals("LibOne")) || (!username.equals("Librarian_02") && password.equals("LibTwo")) || (!username.equals("Librarian_03") && password.equals("LibThree"))) {
					JOptionPane.showMessageDialog(librarianLoginFrame, "INCORRECT USERNAME.");
					
				} else if ((username.equals("Librarian_01") && !password.equals("LibOne")) || (username.equals("Librarian_02") && !password.equals("LibTwo")) || (username.equals("Librarian_03") && !password.equals("LibThree"))) {
					JOptionPane.showMessageDialog(librarianLoginFrame, "INCORRECT PASSWORD.");
					
				} else if ((!username.equals("Librarian_01") && !password.equals("LibOne")) || (!username.equals("Librarian_02") && !password.equals("LibTwo")) || (!username.equals("Librarian_03") && !password.equals("LibThree"))) {
					JOptionPane.showMessageDialog(librarianLoginFrame, "INCORRECT USERNAME and PASSWORD.");
					
				} 
			}
		});
		
		librarianFramePanel.setLayout(null);
		librarianFramePanel.add(librarianUser);
		librarianFramePanel.add(librarianPass);
		librarianFramePanel.add(librarianUserTxt);
		librarianFramePanel.add(librarianPassTxt);
		librarianFramePanel.add(loginButton);
		
		librarianLoginFrame.setLocation(400, 100);
		librarianLoginFrame.setSize(400, 300);
		librarianLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		librarianLoginFrame.setLayout(null);
		librarianLoginFrame.setVisible(true);
		librarianLoginFrame.add(librarianFramePanel);
		librarianLoginFrame.add(librarianUser);
		librarianLoginFrame.add(librarianPass);
		librarianLoginFrame.add(librarianUserTxt);
		librarianLoginFrame.add(librarianPassTxt);
		librarianLoginFrame.add(loginButton);
		
	}
	
	public static void adminModule() {
		
		JFrame adminModuleFrame = new JFrame("Admin Page");
		JPanel adminModulePanel = new JPanel();
		JLabel adminModuleText = new JLabel("Welcome to NU Library System!");
		
		adminModulePanel.setLayout(null);
		adminModulePanel.add(adminModuleText);
		
		adminModuleText.setBounds(90, 100, 300, 40);
		adminModuleText.setLayout(null);
		adminModuleText.setFont(new Font("Serif Plain", Font.PLAIN, 16));
		
		adminModuleFrame.setLocation(400, 100);
		adminModuleFrame.setSize(400, 300);
		adminModuleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminModuleFrame.setLayout(null);
		adminModuleFrame.setVisible(true);
		adminModuleFrame.add(adminModulePanel);
		adminModuleFrame.add(adminModuleText);
	}
	
	public static void librarianModule() {
		
		JFrame libModuleFrame = new JFrame("Librarian Page");
		JPanel libModulePanel = new JPanel();
		JLabel libModuleText = new JLabel("Electronic Book Rental System");
                JLabel libBookList = new JLabel("Available Books:");
		
		libModuleText.setBounds(135, 20, 300, 40);
		libModuleText.setLayout(null);
		libModuleText.setFont(new Font("Serif Plain", Font.BOLD, 14));
                
                libBookList.setBounds(200, 50, 200, 40);
		libBookList.setLayout(null);
		libBookList.setFont(new Font("Serif Plain", Font.PLAIN ,14));
		
		JLabel bookIndex1 = new JLabel("1.");
		bookIndex1.setBounds(50, 100, 80, 25);
		JLabel bookIndex2 = new JLabel("2.");
		bookIndex2.setBounds(50, 130, 80, 25);
		JLabel bookIndex3 = new JLabel("3.");
		bookIndex3.setBounds(50, 160, 80, 25);
		
		JLabel bookTitle1 = new JLabel("System Analysis and Design");
		bookTitle1.setBounds(70, 100, 150, 25);
		JLabel bookTitle2 = new JLabel("Android Application");
		bookTitle2.setBounds(70, 130, 150, 25);
		JLabel bookTitle3 = new JLabel("Programming Concepts and Logic Formulation");
		bookTitle3.setBounds(70, 160, 150, 25);
		
		JLabel bookAuthor1 = new JLabel("Gary B. Shelly");
		bookAuthor1.setBounds(230, 100, 150, 25);
		JLabel bookAuthor2 = new JLabel("Corinne Hoisington");
		bookAuthor2.setBounds(230, 130, 150, 25);
		JLabel bookAuthor3 = new JLabel("Rosauro E. Manuel");
		bookAuthor3.setBounds(230, 160, 150, 25);
		
                JLabel bookCopy1 = new JLabel("2 Copies");
                bookCopy1.setBounds(360, 100, 150, 25);
                JLabel bookCopy2 = new JLabel("3 Copies");
                bookCopy2.setBounds(360, 130, 150, 25);
                JLabel bookCopy3 = new JLabel("4 Copies");
                bookCopy3.setBounds(360, 160, 150, 25);
                
		libModulePanel.setLayout(null);
		libModulePanel.add(libModuleText);
                libModulePanel.add(libBookList);
		libModulePanel.add(bookIndex1);
		libModulePanel.add(bookIndex2);
		libModulePanel.add(bookIndex3);
		libModulePanel.add(bookTitle1);
		libModulePanel.add(bookTitle2);
		libModulePanel.add(bookTitle3);
		libModulePanel.add(bookAuthor1);
		libModulePanel.add(bookAuthor2);
		libModulePanel.add(bookAuthor3);
                libModulePanel.add(bookCopy1);
                libModulePanel.add(bookCopy2);
                libModulePanel.add(bookCopy3);
		
		libModuleFrame.setLocation(400, 100);
		libModuleFrame.setSize(500, 265);
		libModuleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		libModuleFrame.setLayout(null);
		libModuleFrame.setVisible(true);
		libModuleFrame.add(libModulePanel);
		libModuleFrame.add(libModuleText);
                libModuleFrame.add(libBookList);
		libModuleFrame.add(bookIndex1);
		libModuleFrame.add(bookIndex2);
		libModuleFrame.add(bookIndex3);
		libModuleFrame.add(bookTitle1);
		libModuleFrame.add(bookTitle2);
		libModuleFrame.add(bookTitle3);
		libModuleFrame.add(bookAuthor1);
		libModuleFrame.add(bookAuthor2);
		libModuleFrame.add(bookAuthor3);
                libModuleFrame.add(bookCopy1);
                libModuleFrame.add(bookCopy2);
                libModuleFrame.add(bookCopy3);
		
	}
	
	public static void main(String[] args) {
		LoginModule();
		
	}
}
