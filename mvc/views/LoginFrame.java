package mvc.views;

import javax.swing.*;

public class LoginFrame {

	 JLabel userLabel,image,passwordLabel;
     JPasswordField passwordText;
     JTextField userText ;
     JButton loginButton,registerButton;
     JFrame frame = new JFrame("Cmazon");
     JPanel panel = new JPanel();
     
   public LoginFrame() {
    	frame.setSize(500, 500);
        
        panel.setLayout(null);
         userLabel = new JLabel("User");
        userLabel.setBounds(100, 200, 80, 25);
        panel.add(userLabel);
         userText = new JTextField(20);
        userText.setBounds(190, 200, 160, 25);
        panel.add(userText);
         passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(100, 230, 80, 25);
        panel.add(passwordLabel);
         passwordText = new JPasswordField(20);
        passwordText.setBounds(190, 230, 160, 25);
        panel.add(passwordText);
         loginButton = new JButton("login");
        loginButton.setBounds(220, 270, 80, 25);
        panel.add(loginButton);
        
         image =  new JLabel(new ImageIcon("src/Files/SC.jpg"));
        image.setBounds(200, 30,100, 120);
        panel.add(image);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   public JButton getButton(){
       return loginButton;
   }
   public JTextField getAccount()
   {
   return userText;
   }
   
   public JPasswordField getPwd()
   {
	   return passwordText;
   }
   
   public JFrame getFrame()
   {
	   return frame;
   }
}
