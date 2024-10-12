package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BalanceEnquiry extends JFrame implements ActionListener {
// DECLARATION OF PIN NUMBER AND BUTTON    
    String pinnumber;
    JButton back;
// CONSTRUCTOR FOR BalanceEnquiry CLASS    
    BalanceEnquiry(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
    // LOADING AND SCALING THE BACKGROUND IMAGE    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1800, 1400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
    // CREATING AND POSITIONING THE BACK BUTTON
        back = new JButton("BACK");
        back.setBounds(400, 555, 150, 30);
        back.setBackground(Color.yellow);
        back.setForeground(Color.red);
        back.addActionListener(this);
        image.add(back);
    // INITIALIZING BALANCE VARIABLE
        int balance = 0;
        try {
           // CREATING DATABASE CONNECTION 
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select *from bank where PIN='" + pinnumber + "'");
         // ITERATING THROUGH THE RESULT SET TO CALCULATE THE BALANCE
            while (rs.next()) {
                if (rs.getString("TYPE_").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("AMOUNT"));
                } else {
                    balance -= Integer.parseInt(rs.getString("AMOUNT"));
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
     // CREATING AND POSITIONING THE BALANCE DISPLAY LABEL
        JLabel text = new JLabel("YOUR CURRENT BALANCE IS RS  " + balance);
        text.setForeground(Color.pink);
        text.setFont(new Font("System", Font.BOLD, 20));
        text.setBounds(170, 400, 400, 30);
        image.add(text);
    // SETTING THE FRAME SIZE, LOCATION, AND VISIBILITY
        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);

    }
    // ACTION PERFORMED METHOD TO HANDLE BUTTON CLICKS
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);// HIDING THE CURRENT WINDOW
        new Transactions(pinnumber).setVisible(true);// OPENING THE TRANSACTIONS WINDOW
    }
 // CREATING AN INSTANCE OF BalanceEnquiry
    public static void main(String[] args) {
        new BalanceEnquiry(""); // CREATING AN INSTANCE OF BalanceEnquiry
    }

}
