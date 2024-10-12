package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener {
// DECLARING GUI COMPONENTS
    JTextField amount;
    JButton deposit, back,clear;
    String pinnumber;
// CONSTRUCTOR TO SET UP THE DEPOSIT FRAME
    Deposit(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
// LOADING AND SCALING BACKGROUND IMAGE FOR THE FRAME
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1800, 1400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
//CREATING AND POSITIONING LABEL FOR INSTRUCTIONS
        JLabel text = new JLabel("ENTER THE AMOUNT YOU WANT TO DEPOSIT");
        text.setForeground(Color.pink);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(190, 400, 400, 20);
        image.add(text);
//CREATING AND POSITIONING TEXT FIELD FOR ENTERING AMOUNT
        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 16));
        amount.setBounds(185, 450, 320, 30);
        amount.setBackground(Color.pink);
        amount.setForeground(Color.red);
        image.add(amount);
//CREATING AND POSITIONING DEPOSIT BUTTON
        deposit = new JButton("DEPOSIT");
        deposit.setBounds(355,485, 150, 30);
        deposit.setBackground(Color.pink);
        deposit.setForeground(Color.red);
        deposit.addActionListener(this);
        image.add(deposit);
 //CREATING AND POSITIONING CLEAR BUTTON       
        clear=new JButton("CLEAR");
        clear.setBounds(355,520,150,30);
        clear.setBackground(Color.green);
        clear.setForeground(Color.red);
        clear.addActionListener(this);
        image.add(clear);       
//CREATING AND POSITIONING BACK BUTTON
        back = new JButton("BACK");
        back.setBounds(355,555, 150, 30);
        back.setBackground(Color.cyan);
        back.setForeground(Color.red);
        back.addActionListener(this);
        image.add(back);
// SETTING FRAME PROPERTIES
        setSize(900, 900);
        setVisible(true);
        setLocation(300, 0);
        getContentPane().setBackground(Color.pink);

    }
// HANDLING ACTION EVENTS FOR BUTTONS
    public void actionPerformed(ActionEvent ae) {
   // IF DEPOSIT BUTTON IS PRESSED
        if(ae.getSource()==clear){
                                 amount.setText("");}
        if (ae.getSource() == deposit) {
            String number = amount.getText();
            Date date = new Date();
            if (number.equals("")) {
                // SHOWING ERROR MESSAGE IF AMOUNT FIELD IS EMPTY
                JOptionPane.showMessageDialog(null, "PLEASE ENTER THE AMOUNT YOU WANT TO DEPOSIT");
                            } 
            else if (number.equals("0")) {
                // SHOWING ERROR MESSAGE IF AMOUNT FIELD IS ZERO
                JOptionPane.showMessageDialog(null, "AMOUNT ZERO CANNOT BE DEPOSIT");}
            
            else {
                try {
                     // ESTABLISHING CONNECTION TO DATABASE
                    Conn c = new Conn();
                     // SQL QUERY TO INSERT DEPOSIT RECORD INTO DATABASE
                    String quary = "insert into bank values('" + pinnumber + "','" + date + "','Deposit','" + number + "')";
                     // EXECUTING THE SQL QUERY
                    c.s.executeUpdate(quary);
                    JOptionPane.showMessageDialog(null, "RS  " + number + "  DEPOSIT SUCCESSFULLY");
                     // CLOSING CURRENT FRAME AND OPENING TRANSACTIONS FRAME
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
          // IF BACK BUTTON IS PRESSED
        } else if (ae.getSource() == back) {
             // CLOSING CURRENT FRAME AND OPENING TRANSACTIONS FRAME
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }

    }
// MAIN METHOD TO RUN THE DEPOSIT FRAME
    public static void main(String[] args) {
        new Deposit(" ");
    }

}
