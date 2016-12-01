package mvc.controllers;
import mvc.models.*;
import mvc.views.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class Controller {
	
	 private Account account;
	    private LoginFrame loginFrame;
	    private ActionListener actionListener;
	    private CustomerFrame customerFrame;
	    private SellerFrame sellerFrame;
	    
	    public Controller(Account account, LoginFrame loginFrame, CustomerFrame customerFrame,SellerFrame sellerFrame)
	    {
	        this.account = account;
	        this.loginFrame = loginFrame;
	        this.customerFrame = customerFrame;
	        this.sellerFrame = sellerFrame;
	                          
	    }
	    
	    public void contol(){        
	        actionListener = new ActionListener() {
	              public void actionPerformed(ActionEvent actionEvent)
	              {
	            	  String value1=loginFrame.getAccount().getText();
	            	  String value2=loginFrame.getPwd().getText();
	                  
	                  if (value1.equals(account.buyerusername) && account.validatePwdB(value2)) {
	               loginFrame.getFrame().setVisible(false);
	               customerFrame.setVisible(true);
	               //	JLabel label = new JLabel("Welcome:"+value1);
	               	//customerFrame.getContentPane().add(label);
	                  }
	                  else if(value1.equals(account.sellerusername) && account.validatePwdS(value2))
	                  {
	                	  loginFrame.getFrame().setVisible(false);
	                	  sellerFrame.setVisible(true);
	   	               //	JLabel label = new JLabel("Welcome:"+value1);
	   	            // sellerFrame.getContentPane().add(label);
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
	        };                
	        loginFrame.getButton().addActionListener(actionListener);   
	    }

}
