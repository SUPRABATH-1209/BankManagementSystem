package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class MiniStatement extends JFrame implements ActionListener {

    String pinnumber;
    JLabel mini,bank,card,balance;
// CONSTRUCTOR FOR MiniStatement CLASS
    public MiniStatement(String pinnumber) {
        setTitle("MINI STATEMENT");
        setLayout(null);
    // CREATING A JLABEL TO DISPLAY THE MINI STATEMENT
        mini = new JLabel();
        mini.setBounds(20, 140, 400, 200);
        add(mini);
    // CREATING A JLABEL TO DISPLAY THE BANK NAME
        bank = new JLabel("INDIAN BANK");
        bank.setBounds(150, 20, 100, 20);
        add(bank);
    // CREATING A JLABEL TO DISPLAY THE CARD NUMBER
        card = new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);
    // CREATING A JLABEL TO DISPLAY THE ACCOUNT BALANCE
        balance = new JLabel();
        balance.setBounds(20, 400, 300, 20);
        add(balance);

        try {
            Conn c = new Conn();// CREATING DATABASE CONNECTION
            ResultSet rs = c.s.executeQuery("select *from login where PIN='" + pinnumber + "'");
            while (rs.next()) {
                 // MASKING CARD NUMBER AND SETTING IT IN THE LABEL
                card.setText("CARD NUMBER:  " + rs.getString("CARD_NUMBER").substring(0, 5) + "XXXXXXXX" + rs.getString("CARD_NUMBER").substring(12));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Conn c = new Conn();// CREATING ANOTHER DATABASE CONNECTION
            int bal = 0;
            // ITERATING THROUGH THE RESULT SET TO DISPLAY TRANSACTIONS AND CALCULATE BALANCE
            ResultSet rs = c.s.executeQuery("select *from bank where PIN='" + pinnumber + "'");
            while (rs.next()) {
                mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("TYPE_") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("AMOUNT") + "<br><br><html>");
                if (rs.getString("TYPE_").equals("Deposit")) {
                    bal += Integer.parseInt(rs.getString("AMOUNT"));
                } else {
                    bal -= Integer.parseInt(rs.getString("AMOUNT"));
                }

            }
            balance.setText("YOUR CURRENT ACCOUNT BALANCE RS:  " + bal);

        } catch (Exception e) {
            System.out.println(e);         
        }
     // SETTING FRAME SIZE, LOCATION, BACKGROUND COLOR, AND VISIBILITY    
        setSize(400, 600);
        setLocation(20, 20);
        setVisible(true);
        getContentPane().setBackground(Color.pink);

    }
 // ACTION PERFORMED METHOD TO HANDLE BUTTON CLICKS
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);

    }
// MAIN METHOD TO RUN THE APPLICATION
    public static void main(String[] args) {
        new MiniStatement(" ");// CREATING AN INSTANCE OF MiniStatement
    }

}
