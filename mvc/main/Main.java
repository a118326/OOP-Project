package mvc.main;
import mvc.controllers.*;
import mvc.models.*;
import mvc.views.*;
import javax.swing.SwingUtilities;

import mvc.models.*;
import mvc.views.*;
import mvc.controllers.*;

public class Main
{
    public static void main(String[] args) {           
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {                                           
            	CustomerFrame customerFrame = new CustomerFrame();
                Account acc = new Account(); 
                LoginFrame loginFrame = new LoginFrame();
                SellerFrame sellerFrame = new SellerFrame();
                Controller controller = new Controller(acc,loginFrame,customerFrame,sellerFrame);
                controller.contol();
            }
        });  
    }
}
