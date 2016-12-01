package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends Account implements ActionListener  {
    
     private JLabel userLabel,image,passwordLabel;
     private JPasswordField passwordText;
     private JTextField userText ;
     private JButton loginButton,registerButton;
     private JFrame frame = new JFrame("Cmazon");
     
     
    private void placeComponents(JPanel panel) {
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
        loginButton.addActionListener(this);
        
    }
      public void actionPerformed(ActionEvent ae)
       {
       String value1=userText.getText();
       String value2=passwordText.getText();
       Account acc = new Account();
       if (value1.equals(acc.username) && value2.equals(acc.pwd)) {
    	   DisplayUsersFrame page=new DisplayUsersFrame();
    	   frame.setVisible(false);
    	   page.setVisible(true);
       JLabel label = new JLabel("Welcome:"+value1);
       page.getContentPane().add(label);
       }
       else
       {
    	   final JFrame parent = new JFrame();
    	   JOptionPane.showMessageDialog(parent,
    			    "Wrong account/ Wrong password.",
    			    "Error",
    			    JOptionPane.ERROR_MESSAGE);
    	
       }
     }
      public static void main(String[] args) {
    
            LoginFrame p = new LoginFrame();         
            JPanel panel = new JPanel();
            p.placeComponents(panel);
            
        }
}