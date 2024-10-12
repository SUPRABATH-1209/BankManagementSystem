
package bank.management.system;
import javax.swing.*;

public class Login extends JFrame{
    Login(){
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("/iconslogo.jpg"));
     JLabel label=new JLabel(i1);
     add(label);
        setSize(800,480);
        setVisible(true);
        setLocation(350, 200);
        setTitle("AUTOMATED TELLER MACHINE");
        
    }
    public static void main(String[] args) {
        new Login();
        
    }
}
