package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.sql.*;

public class FastCash extends JFrame implements ActionListener {
// DECLARING GUI COMPONENTS
    JLabel text;
    JButton b1, b2, b3, b4, b5, b6, back;
    String pinnumber;
// CONSTRUCTOR TO SET UP THE FAST CASH FRAME
    public FastCash(String pinnumber) {
        setLayout(null);
        this.pinnumber = pinnumber;
    // LOADING AND SCALING BACKGROUND IMAGE FOR THE FRAME    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1800, 1400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
    // CREATING AND POSITIONING LABEL FOR INSTRUCTIONS
        text = new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(230, 400, 7000, 35);
        text.setForeground(Color.pink);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
    // CREATING AND POSITIONING BUTTONS FOR WITHDRAWAL AMOUNTS
        b1 = new JButton("RS 100");
        b1.setBounds(170, 450, 150, 30);
        b1.setBackground(Color.pink);
        b1.setForeground(Color.red);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("RS 500");
        b2.setBounds(400, 450, 150, 30);
        b2.setBackground(Color.pink);
        b2.setForeground(Color.red);
        b2.addActionListener(this);
        image.add(b2);

        b3 = new JButton("RS 1000");
        b3.setBounds(170, 485, 150, 30);
        b3.setBackground(Color.pink);
        b3.setForeground(Color.red);
        b3.addActionListener(this);
        image.add(b3);

        b4 = new JButton("RS 2000");
        b4.setBounds(400, 485, 150, 30);
        b4.setBackground(Color.pink);
        b4.setForeground(Color.red);
        b4.addActionListener(this);
        image.add(b4);

        b5 = new JButton("RS 10000");
        b5.setBounds(400, 520, 150, 30);
        b5.setBackground(Color.pink);
        b5.setForeground(Color.red);
        b5.addActionListener(this);
        image.add(b5);

        b6 = new JButton("RS 5000");
        b6.setBounds(170, 520, 150, 30);
        b6.setBackground(Color.pink);
        b6.setForeground(Color.red);
        b6.addActionListener(this);
        image.add(b6);
    // CREATING AND POSITIONING BACK BUTTON
        back = new JButton("BACK");
        back.setBounds(400, 555, 150, 30);
        back.setBackground(Color.yellow);
        back.setForeground(Color.red);
        back.addActionListener(this);
        image.add(back);
    // SETTING FRAME PROPERTIES
        setSize(900, 900);
        setUndecorated(true);
        setVisible(true);
        setLocation(300, 0);

    }
 // HANDLING ACTION EVENTS FOR BUTTONS
    public void actionPerformed(ActionEvent ae) {
        Date date = new Date();
         // IF BACK BUTTON IS PRESSED
        if (ae.getSource() == back) {

            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        } else {
            // EXTRACTING THE AMOUNT FROM BUTTON TEXT
            String amount = ((JButton) ae.getSource()).getText().substring(3);//RS 500
            Conn c = new Conn();
            try {
                 // RETRIEVING CURRENT BALANCE FROM DATABASE
                ResultSet rs = c.s.executeQuery("select *from bank where PIN='" + pinnumber + "'");
                int balance = 0;
                while (rs.next()) {
                    if (rs.getString("TYPE_").equals("Deposit")) {
                        balance += Integer.parseInt(rs.getString("AMOUNT"));
                    } else {
                        balance -= Integer.parseInt(rs.getString("AMOUNT"));
                    }
                }
                 // CHECKING IF THERE IS SUFFICIENT BALANCE
                if (ae.getSource() != back && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Inssuficent Balance");
                    return;
                }
               // INSERTING WITHDRAWAL RECORD INTO DATABASE
                String query = "insert into bank values('" + pinnumber + "','" + date + "','Withdrawl','" + amount + "')";
                c.s.executeUpdate(query);
                // SHOWING SUCCESS MESSAGE
                JOptionPane.showMessageDialog(null, "RS  " + amount + "  DEBITED SUCCESSFULLY");
                // CLOSING CURRENT FRAME AND OPENING TRANSACTIONS FRAME
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);

            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
// MAIN METHOD TO RUN THE FAST CASH FRAME
    public static void main(String[] args) {
        new FastCash(" ");
    }

}
