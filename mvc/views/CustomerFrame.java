package mvc.views;

 import javax.swing.*;
import java.awt.*;
  
public class CustomerFrame extends JFrame
 {
	JLabel cmazonTitle,price,quantity,name;
	JPanel customerPanel = new JPanel();
	JScrollPane customerScrollPanel = new JScrollPane();
	public CustomerFrame()
  {
 // setDefaultCloseOperation(javax.swing.
 //  WindowConstants.DISPOSE_ON_CLOSE);
  setTitle("Customer Page");
  setSize(500, 500);
  customerScrollPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
  //JScrollBar vbar = new JScrollBar(JScrollBar.VERTICAL, 0, 40, 0, 500);
  //add(vbar, BorderLayout.EAST);
  
  cmazonTitle = new JLabel("Cmazon");
  cmazonTitle.setBounds(100, 200, 80, 25);
  customerScrollPanel.add(cmazonTitle);
  price = new JLabel("Price");
  price.setBounds(100, 200, 80, 25);
  customerScrollPanel.add(price);
  quantity = new JLabel("Quantity");
  quantity.setBounds(100, 200, 80, 25);
  customerScrollPanel.add(quantity);
  name = new JLabel("Item");
  name.setBounds(100, 200, 80, 25);
  customerScrollPanel.add(name);
  customerScrollPanel.setBounds(0, 0, 500, 500);
  customerScrollPanel.setBackground(Color.BLACK);
  //customerPanel.setPreferredSize(new Dimension(500, 500));
  add(customerScrollPanel);
  setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }
  }