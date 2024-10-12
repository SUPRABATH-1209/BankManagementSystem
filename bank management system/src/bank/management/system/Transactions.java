package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener {
//GOLBAL DECLARATION OF LABEL BUUTON AND STRING

    JLabel text;
    JButton deposit, withdrawl, fastcash, ministatement, pinchange, balanceenquiry, exit;
    String pinnumber;
// CONSTRUCTOR FOR TRANSACTIONS CLASS
    public Transactions(String pinnumber) {
        setLayout(null);
        this.pinnumber = pinnumber;
// LOADING AND SCALING THE BACKGROUND IMAGE       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1800, 1400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
// CREATING AND CUSTOMIZING THE TRANSACTION SELECTION TEXT
        text = new JLabel("PLEASE SELECT YOUR TRANSACTION");
        text.setBounds(220, 400, 7000, 35);
        text.setForeground(Color.pink);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
// CREATING AND POSITIONING THE DEPOSIT BUTTON
        deposit = new JButton("DEPOSIT");
        deposit.setBounds(170, 450, 150, 30);
        deposit.setBackground(Color.pink);
        deposit.setForeground(Color.red);
        deposit.addActionListener(this);
        image.add(deposit);
// CREATING AND POSITIONING THE WITHDRAWAL BUTTON
        withdrawl = new JButton("CASH WITHDRAWL");
        withdrawl.setBounds(400, 450, 150, 30);
        withdrawl.setBackground(Color.pink);
        withdrawl.setForeground(Color.red);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
// CREATING AND POSITIONING THE FAST CASH BUTTON
        fastcash = new JButton("FAST CASH");
        fastcash.setBounds(170, 485, 150, 30);
        fastcash.setBackground(Color.pink);
        fastcash.setForeground(Color.red);
        fastcash.addActionListener(this);
        image.add(fastcash);
// CREATING AND POSITIONING THE MINI STATEMENT BUTTON
        ministatement = new JButton("MINI STATEMENT");
        ministatement.setBounds(400, 485, 150, 30);
        ministatement.setBackground(Color.pink);
        ministatement.setForeground(Color.red);
        ministatement.addActionListener(this);
        image.add(ministatement);
// CREATING AND POSITIONING THE PIN CHANGE BUTTON
        pinchange = new JButton("PIN CHANGE");
        pinchange.setBounds(400, 520, 150, 30);
        pinchange.setBackground(Color.pink);
        pinchange.setForeground(Color.red);
        pinchange.addActionListener(this);
        image.add(pinchange);
// CREATING AND POSITIONING THE BALANCE ENQUIRY BUTTON
        balanceenquiry = new JButton("BALANCE ENQUIRY");
        balanceenquiry.setBounds(170, 520, 150, 30);
        balanceenquiry.setBackground(Color.pink);
        balanceenquiry.setForeground(Color.red);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
// CREATING AND POSITIONING THE EXIT BUTTON
        exit = new JButton("EXIT");
        exit.setBounds(400, 555, 150, 30);
        exit.setBackground(Color.yellow);
        exit.setForeground(Color.red);
        exit.addActionListener(this);
        image.add(exit);
// SETTING THE FRAME SIZE, MAKING IT UNDECORATED AND VISIBLE
        setSize(900, 900);
        setUndecorated(true);
        setVisible(true);
        setLocation(300, 0);
    }
// ACTION PERFORMED METHOD TO HANDLE BUTTON CLICKS
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == exit) {
            System.exit(0);                                // EXIT THE APPLICATION IF EXIT BUTTON IS CLICKED
        } else if (ae.getSource() == deposit) {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);      // OPEN DEPOSIT WINDOW IF DEPOSIT BUTTON IS CLICKED

        } else if (ae.getSource() == withdrawl) {
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);    // OPEN WITHDRAWAL WINDOW IF WITHDRAWAL BUTTON IS CLICKED
        } else if (ae.getSource() == fastcash) {
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);     // OPEN FAST CASH WINDOW IF FAST CASH BUTTON IS CLICKED
        } else if (ae.getSource() == pinchange) {
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);     // OPEN PIN CHANGE WINDOW IF PIN CHANGE BUTTON IS CLICKED
        } else if (ae.getSource() == balanceenquiry) {
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);// OPEN BALANCE ENQUIRY WINDOW IF BALANCE ENQUIRY BUTTON IS CLICKED
        } else if (ae.getSource() == ministatement) {

            new MiniStatement(pinnumber).setVisible(true); // OPEN MINI STATEMENT WINDOW IF MINI STATEMENT BUTTON IS CLICKED
        }
    }
// MAIN METHOD TO RUN THE APPLICATION
    public static void main(String[] args) {
        new Transactions(" ");
    }

}
