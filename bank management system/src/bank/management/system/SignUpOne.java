package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame implements ActionListener {
//GLOBAL DECLARATION OF JLABEL,JTEXTFIELD,JBUTTON,JRADIOBUTTON and LONG

    long random;
    JLabel formno, personDetails, name, fname, dob, gender, email, marital, address, city, state, pin;
    JButton next,exit;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinTextField;
    JRadioButton male, female, married, unmarried, other;
    JDateChooser dateChooser;
//CONSTRUCTOR CREATION FOR SignUpOne CLASS    

    public SignUpOne() {
        setLayout(null);
        Random ran = new Random();
        random = Math.abs(ran.nextLong() % 9000L + 1000L);
//1.FORM NUMBER CREATION WITH RANDOM NUMBERS BY USING JLABEL        
        formno = new JLabel("APPLICATION FORM No:" + random);
        formno.setFont(new Font("Raieway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
//2.LABEL CREATION FOR "page 1:Personal Details"
        personDetails = new JLabel("PAGE 1:PERSONAL DETAILS");
        personDetails.setFont(new Font("Raieway", Font.BOLD, 22));
        personDetails.setBounds(290, 80, 400, 30);
        add(personDetails);
//3.LABEL CREATION FOR NAME        
        name = new JLabel("NAME:");
        name.setFont(new Font("Raieway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
//4.TEXT FIELD CREATION FOR NAME      
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
//5.LABEL CREATION FOR FATHERS NAME        
        fname = new JLabel("FATHER's NAME:");
        fname.setFont(new Font("Raieway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
//6.TEXT FIELD CREATION FOR FATHER NAME        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);
//7.LABEL CREATION FOR DATE OF BIRTH       
        dob = new JLabel("DATE OF BIRTH:");
        dob.setFont(new Font("Raieway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
//CREATION OF DATECHOOSER FOR DATES        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        add(dateChooser);
//8.LABEL CREATION FOR GENDER       
        gender = new JLabel("GENDER:");
        gender.setFont(new Font("Raieway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
//9.CREATION OF RADIOBUTTON FOR MALE AND FEMALE        
        male = new JRadioButton("MALE");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.pink);
        add(male);
        female = new JRadioButton("FEMALE");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.pink);
        add(female);
//10.CREATION OF BUTTON GROUP THAT ADD MALE AND FEMALE    IN WHICH WE CAM SELECT ONLY ONE OPTION    
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
//11.LABEL CREATION FOR EMAIL ADDRESS         
        email = new JLabel("EMAIL ADDRESS:");
        email.setFont(new Font("Raieway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);
//12.TEXT FIELD CREATION FOR EMAIL ADDRESS        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);
        //13.LABEL CREATION FOR   Matirial status    
        marital = new JLabel("MATIRIAL STATUS:");
        marital.setFont(new Font("Raieway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
//14.CREATION OF RADIOBUTTON FOR MARRIED AND UNMARRIED and other       
        married = new JRadioButton("MARRIED");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.pink);
        add(married);
        unmarried = new JRadioButton("UNMARRIED");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.pink);
        add(unmarried);
        other = new JRadioButton("OTHER");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.pink);
        add(other);
//15.CREATION OF BUTTON GROUP THAT ADD MARRIED AND UNMARRIED and other  IN WHICH WE CAN SELECT ONLY ONE        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
//16.LABEL CREATION FOR   ADDRESS       
        address = new JLabel("ADDRESS:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);
//17.TEXT FIELD CREATION FOR ADDRESS             
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);
        //18.LABEL CREATION FOR CITY        
        city = new JLabel("CITY:");
        city.setFont(new Font("Raieway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
//19.TEXT FIELD CREATION FOR CITY                
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);
        //20.LABEL CREATION FOR  STATE        
        state = new JLabel("STATE:");
        state.setFont(new Font("Raieway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
//21.TEXT FIELD CREATION FOR   STATE                      
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);
        //22.LABEL CREATION FOR   PINCODE        
        pin = new JLabel("PINCODE:");
        pin.setFont(new Font("Raieway", Font.BOLD, 20));
        pin.setBounds(100, 590, 200, 30);
        add(pin);
        //23.TEXT FIELD CREATION FOR  PINCODE                       
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinTextField.setBounds(300, 590, 400, 30);
        add(pinTextField);
//24.CREATION OF BUTTON FOR THE TEXT "NEXT"        
        next = new JButton("NEXT");
        next.setBackground(Color.pink);
        next.setForeground(Color.blue);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        exit = new JButton("EXIT");
        exit.setBackground(Color.yellow);
        exit.setForeground(Color.red);
        exit.setFont(new Font("Raleway", Font.BOLD, 14));
        exit.setBounds(500, 660, 80, 30);
        exit.addActionListener(this);
        add(exit);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        getContentPane().setBackground(Color.pink);
    }//END OF THE CONSTRUCTOR i.e==>"SignUpone()"
//CREATION OF ACTIONS TO PERFORM THE SPECIFIC TASKS

    public void actionPerformed(ActionEvent ae) {
        String FORMNO = "" + random;
        String NAME_ = nameTextField.getText();
        String FATHER_NAME = fnameTextField.getText();
        String EMAIL = emailTextField.getText();
        String ADDRESS = addressTextField.getText();
        String CITY = cityTextField.getText();
        String STATE = stateTextField.getText();
        String PIN = pinTextField.getText();
        String DATE_OF_BIRTH = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
//THIS GROUP OF BLOCK IS CREATED FOR TO SELECT ONLY ONE RADIO BUTTON    
        String GENDER = null;
        if (male.isSelected()) {
            GENDER = "MALE";
        } else if (female.isSelected()) {
            GENDER = "FEMALE";
        }
//THIS GROUP OF BLOCK IS CREATED FOR TO SELECT ONLY ONE RADIO BUTTON        
        String MARITAL_STATUS = null;
        if (married.isSelected()) {
            MARITAL_STATUS = "MARRIED";
        } else if (unmarried.isSelected()) {
            MARITAL_STATUS = "UNMARRIED";
        } else if (other.isSelected()) {
            MARITAL_STATUS = "OTHER";
        }
        if(ae.getSource()==exit){System.exit(0);}
//CREATION OF DATABASE CONNECTIVITY  
        try {
            if (nameTextField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "NAME IS REQUIRED");
            } else if (fnameTextField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "FATHER'S NAME IS REQUIRED");
            } else if  (((JTextField) dateChooser.getDateEditor().getUiComponent()).getText().equals("")) {
                JOptionPane.showMessageDialog(null, "DATE_OF_BIRTH IS REQUIRED");
            } else if (!male.isSelected() && !female.isSelected())  {
                JOptionPane.showMessageDialog(null, "GENDER IS REQUIRED");
            } else if (emailTextField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "EMAIL IS REQUIRED");
            } else if (!married.isSelected() && !unmarried.isSelected() && !other.isSelected()) {
                JOptionPane.showMessageDialog(null, "MARITAL IS REQUIRED");
            } else if (addressTextField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "ADDRESS IS REQUIRED");
            } else if ( cityTextField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "CITY IS REQUIRED");
            } else if (stateTextField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "STATE IS REQUIRED");
            } else if ( pinTextField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "PIN IS REQUIRED");
            } else {
                Conn c = new Conn();
                String query = "insert into signup values('" + FORMNO + "','" + NAME_ + "','" + FATHER_NAME + "','" + DATE_OF_BIRTH + "','" + GENDER + "','" + EMAIL + "','" + MARITAL_STATUS + "','" + ADDRESS + "','" + CITY + "','" + STATE + "','" + PIN + "')";
                c.s.executeUpdate(query);
                setVisible(false);                      //AFTER QUERY EXECUTED THIS CLASS WILL BE CLOSED
                new SignupTwo(FORMNO).setVisible(true); //AFTER NEXT CLASS WILL BE OPENED THA IS SignUpTwo CLASS  
            }
              
        } catch (Exception e) {
            System.out.println(e);
        }      //END OF TRY AND CATCH BLOCK
    }//END OF ACTION PERFORMED FUNCTION  

    public static void main(String[] args) {
        new SignUpOne();
    }
}//END OF MAIN CLASS
