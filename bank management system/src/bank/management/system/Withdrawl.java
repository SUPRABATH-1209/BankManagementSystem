package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.sql.*;

public class Withdrawl extends JFrame implements ActionListener {
// DECLARING GUI COMPONENTS

    JTextField t1amount;
    JButton withdraw, back;
    String pinnumber;
// CONSTRUCTOR TO SET UP THE WITHDRAWL FRAME

    Withdrawl(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
// LOADING AND SCALING BACKGROUND IMAGE FOR THE FRAME
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1800, 1400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
// CREATING AND POSITIONING LABEL FOR INSTRUCTIONS
        JLabel text = new JLabel("ENTER THE YOU WANT TO WITH DRAW");
        text.setForeground(Color.pink);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(190, 400, 400, 20);
        image.add(text);
// CREATING AND POSITIONING TEXT FIELD FOR ENTERING AMOUNT
        t1amount = new JTextField();
        t1amount.setFont(new Font("System", Font.BOLD, 16));
        t1amount.setBackground(Color.pink);
        t1amount.setForeground(Color.red);
        t1amount.setBounds(185, 450, 320, 25);
        image.add(t1amount);
// CREATING AND POSITIONING WITHDRAW BUTTON
        withdraw = new JButton("WITHDRAW");
        withdraw.setBounds(355, 485, 150, 30);
        withdraw.setBackground(Color.pink);
        withdraw.setForeground(Color.red);
        withdraw.addActionListener(this);
        image.add(withdraw);
// CREATING AND POSITIONING BACK BUTTON
        back = new JButton("BACK");
        back.setBounds(355, 520, 150, 30);
        back.setBackground(Color.yellow);
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

        try {
            String amount = t1amount.getText();
            Date date = new Date();
            if (ae.getSource() == withdraw) {
                if (t1amount.getText().equals("") || t1amount.getText().equals("0") || Integer.parseInt(amount) < 0) {
                    JOptionPane.showMessageDialog(null, "PLEASE ENTER THE AMOUNT YOU WANT TO WITHDRAW");
                } else  {
                    Conn c1 = new Conn();

                    ResultSet rs = c1.s.executeQuery("select * from bank where PIN = '" + pinnumber + "'");
                    int balance = 0;
                    while (rs.next()) {
                        if (rs.getString("TYPE_").equals("Deposit")) {
                            balance += Integer.parseInt(rs.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(rs.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "INSUFFICENT BALANCE");
                        return;
                    }

                    c1.s.executeUpdate("insert into bank values('" + pinnumber + "', '" + date + "', 'Withdrawl', '" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " DEBITED SUCCESSFULLY");

                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
            } else if (ae.getSource() == back) {
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error: " + e);
        }

    }
    // MAIN METHOD TO RUN THE WITHDRAWL FRAME

    public static void main(String[] args) {
        new Withdrawl(" ").setVisible(true);
    }

}// 504093673701238
