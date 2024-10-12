package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PinChange extends JFrame implements ActionListener {
// DECLARING VARIABLES FOR PIN NUMBER, PASSWORD FIELDS, AND BUTTONS
    String pinnumber;
    JPasswordField pin, repin;
    JButton change, back;
 // CONSTRUCTOR FOR PinChange CLASS
    public PinChange(String pinnumber) {
        setLayout(null);
    // LOADING AND SCALING THE BACKGROUND IMAGE    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1800, 1400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        this.pinnumber = pinnumber;
    // CREATING AND CUSTOMIZING THE "CHANGE YOUR PIN" LABEL
        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.pink);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(270, 400, 400, 20);
        image.add(text);
    // CREATING AND POSITIONING THE NEW PIN LABEL
        JLabel pintext = new JLabel("NEW PIN:");
        pintext.setForeground(Color.pink);
        pintext.setFont(new Font("System", Font.BOLD, 16));
        pintext.setBounds(165, 440, 180, 20);
        image.add(pintext);
    // CREATING AND POSITIONING THE NEW PIN PASSWORD FIELD
        pin = new JPasswordField();
        pin.setForeground(Color.red);
        pin.setFont(new Font("Raleway", Font.BOLD, 16));
        pin.setBackground(Color.pink);
        pin.setBounds(330, 440, 180, 20);
        image.add(pin);
    // CREATING AND POSITIONING THE RE-ENTER NEW PIN LABEL
        JLabel repintext = new JLabel("RE-ENTER NEW PIN:");
        repintext.setForeground(Color.pink);
        repintext.setFont(new Font("System", Font.BOLD, 16));
        repintext.setBounds(165, 480, 180, 20);
        image.add(repintext);
    // CREATING AND POSITIONING THE RE-ENTER NEW PIN PASSWORD FIELD
        repin = new JPasswordField();
        repin.setForeground(Color.red);
        repin.setBackground(Color.pink);
        repin.setFont(new Font("Raleway", Font.BOLD, 16));
        repin.setBounds(330, 480, 180, 20);
        image.add(repin);
    // CREATING AND POSITIONING THE CHANGE BUTTON
        change = new JButton("CHANGE");
        change.setBounds(400, 520, 150, 30);
        change.setForeground(Color.red);
        change.setBackground(Color.pink);
        change.addActionListener(this);
        image.add(change);
    // CREATING AND POSITIONING THE BACK BUTTON
        back = new JButton("BACK");
        back.setBounds(400, 555, 150, 30);
        back.setForeground(Color.red);
        back.setBackground(Color.yellow);
        back.addActionListener(this);
        image.add(back);
    // SETTING THE FRAME SIZE, LOCATION, AND VISIBILITY
        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);

    }
// ACTION PERFORMED METHOD TO HANDLE BUTTON CLICKS
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == change) {
            try {
                String npin = pin.getText();// GETTING THE NEW PIN
                String rpin = repin.getText();// GETTING THE RE-ENTERED PIN
             // CHECK IF THE NEW PIN AND RE-ENTERED PIN MATCH
                if (!npin.equals(rpin)) {
                    JOptionPane.showMessageDialog(null, "ENTERED PIN DOES NOT MATCH");
                    return;
                }
              // CHECK IF NEW PIN IS EMPTY
                if (npin.equals("")) {
                    JOptionPane.showMessageDialog(null, "PLEASE ENTER PIN");
                    return;
                }
            // CHECK IF RE-ENTERED PIN IS EMPTY
                if (rpin.equals("")) {
                    JOptionPane.showMessageDialog(null, "PLEASE RE-ENTER THE PIN");
                    return;
                }
            // CREATING A DATABASE CONNECTION AND UPDATING THE PIN IN ALL RELEVANT TABLES
                Conn c = new Conn();
                String query1 = "update bank set pin='" + rpin + "' where pin='" + pinnumber + "'";
                String query2 = "update login set pin='" + rpin + "' where pin='" + pinnumber + "'";
                String query3 = "update signupthree set pin='" + rpin + "' where pin='" + pinnumber + "'";
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                c.s.executeUpdate(query3);
            // DISPLAY SUCCESS MESSAGE AND OPEN THE TRANSACTIONS WINDOW WITH NEW PIN    
                JOptionPane.showMessageDialog(null, "PIN CHANGED SUCESSFULLY");
                setVisible(false);
                new Transactions(rpin).setVisible(true);

            } catch (Exception e) {

                System.out.println(e);
            }

        } else {
            setVisible(false);// CLOSING THE CURRENT WINDOW
            new Transactions(pinnumber).setVisible(true); // OPENING THE TRANSACTIONS WINDOW
        }

    }
// MAIN METHOD TO RUN THE APPLICATION
    public static void main(String[] args) {

        new PinChange(" ").setVisible(true);

    }
}
