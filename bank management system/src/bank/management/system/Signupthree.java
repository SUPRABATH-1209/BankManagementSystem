package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Signupthree extends JFrame implements ActionListener{
    Long         random;
    JLabel       l1,type,card,number,pin,pnumber,apin,papin,services;
    String       formno;
    JButton      submit,cancel;
    JCheckBox    c1,c2,c3,c4,c5,c6,c7;
    JRadioButton r1,r2,r3,r4;
public Signupthree(String formno) {
        this.formno=formno;
        Random ran=new Random();
        random=Math.abs(ran.nextLong()%9000L+1000L);
        setLayout(null);
        setVisible(true);
        setSize(850,820);
        setLocation(350,0);
        getContentPane().setBackground(Color.pink);
//CREATION OF LABEL FOR  PAGE 3:ACCOUNT DETAILES
        l1=new JLabel("PAGE 3:ACCOUNT DETAILES");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBackground(Color.pink);
        l1.setBounds(280,40,400,40);
        add(l1);
//CREATION OF LABEL FOR ACCOUNT TYPE    
        type=new JLabel("ACCOUNT TYPE:");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBackground(Color.pink);
        type.setBounds(100,140,200,30);
        add(type);
//CREATION OF RADIO BUTTON FOR SAVING ACCOUNT     
        r1=new JRadioButton("SAVING ACCOUNT");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.pink);
        r1.setBounds(100,180,250,20);
        add(r1);
//CREATION OF RADIO BUTTON FOR FIXED DEPOSIT ACCOUNT         
        r2=new JRadioButton("FIXED DEPOSIT ACCOUNT");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.pink);
        r2.setBounds(350,180,250,20);
        add(r2);
//CREATION OF RADIO BUTTON FOR CURRENT ACCOUNT         
        r3=new JRadioButton("CURRENT ACCOUNT");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.pink);
        r3.setBounds(100,220,250,20);
        add(r3);
//CREATION OF RADIO BUTTON FOR  RECURRING DEPSOIT ACCOUNT       
        r4=new JRadioButton("RECURRING DEPSOIT ACCOUNT");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.pink);
        r4.setBounds(350,220,300,20);
        add(r4);
//CREATION OF GROUP BUTTON FOR  SELECTION OF ONLY ONE RADIO BUTTON       
        ButtonGroup groupaccount=new ButtonGroup();
        groupaccount.add(r1);
          groupaccount.add(r2);
            groupaccount.add(r3);
              groupaccount.add(r4);
//CREATION OF LABEL FOR        
        card=new JLabel("CARD NUMBER:");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBackground(Color.pink);
        card.setBounds(100,300,200,30);
        add(card);
 //CREATION OF LABEL FOR       
        number=new JLabel("XXXX-XXXX-XXXX-1209");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBackground(Color.pink);
        number.setBounds(330,300,300,30);
        add(number);
//CREATION OF LABEL FOR SHOWING THE 16 DIGIT CARD NUMBER OF AN USER    
        apin=new JLabel("YOUR 16 DIGIT CARD NUMBER  ");
        apin.setFont(new Font("Raleway",Font.BOLD,12));
        apin.setBackground(Color.pink);
        apin.setBounds(100,330,300,20);
        add(apin);
//CREATION OF LABEL FOR  PIN    
        pin=new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBackground(Color.pink);
        pin.setBounds(100,370,200,30);
        add(pin);
//CREATION OF LABEL FOR  SHOWING THE 4 DIGIT PIN NUMBER AS XXXX  
        pnumber=new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBackground(Color.pink);
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
//CREATION OF LABEL FOR  SHOWING THE 4 DIGIT PIN NUMBER OF AN USER 
        papin=new JLabel("YOUR 4 DIGIT PIN NUMBER");
        papin.setFont(new Font("Raleway",Font.BOLD,18));
        papin.setBackground(Color.pink);
        papin.setBounds(100,400,300,20);
        add(papin);
//CREATION OF LABEL FOR SERVICES REQUIRED   
        services=new JLabel("SERVICES REQUIRED:");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBackground(Color.pink);
        services.setBounds(100,450,300,30);
        add(services);
//CREATION OF CHECKBOX FOR  ATM CARD 
        c1=new JCheckBox("ATM CARD");
        c1.setBackground(Color.pink);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
//CREATION OF CHECKBOX FOR  INTERNET BANKING         
        c2=new JCheckBox("INTERNET BANKING");
        c2.setBackground(Color.pink);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);
//CREATION OF CHECKBOX FOR MOBILE BANKING       
        c3=new JCheckBox("MOBILE BANKING");
        c3.setBackground(Color.pink);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,230,30);
        add(c3);
 //CREATION OF CHECKBOX FOR  EMAIL AND SMS     
        c4=new JCheckBox("EMAIL & SMS");
        c4.setBackground(Color.pink);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);
//CREATION OF CHECKBOX FOR  CHEQUE BOOK     
        c5=new JCheckBox("CHEQUE BOOK");
        c5.setBackground(Color.pink);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);
 //CREATION OF CHECKBOX FOR E-STATEMENT         
        c6=new JCheckBox("E-STATEMENT");
        c6.setBackground(Color.pink);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);
//CREATION OF CHECKBOX FOR TERMS AND POLICY      
        c7=new JCheckBox("I HEREBY DECLARE THAT THE ABOVE-ENTERED DETAILS ARE CORRECT TO THE BEST OF MY KNOWLEDGE");
        c7.setBackground(Color.pink);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,680,700,30);
        add(c7);
//CREATION OF BUTTON FOR SUBMIT    
        submit=new JButton("SUBMIT");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,720,100,30);
        add(submit);
        submit.addActionListener(this);
//CREATION OF BUTTON FOR  CANCLE    
        cancel=new JButton("CANCLE");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420,720,100,30);
        add(cancel);
        cancel.addActionListener(this);
}                                                   //END OF CONSTRUCTOR METHOD     
    public void actionPerformed(ActionEvent ae){
         if(ae.getSource()==submit){//FIRST IF BLOCK
                                    String accountType=null;
                                         if(r1.isSelected())  {accountType="Saving Account";                }
                                    else if(r2.isSelected())  {accountType="Fixred Deposit Account";        }
                                    else if(r3.isSelected())  {accountType="Current Account";               }
                                    else if(r4.isSelected())  {accountType="Reccuring Deposite Account";    }
                                    Random random=new Random();
                                    
                                    String cardnumber=" "+Math.abs((random.nextLong()%90000000L)+504093600000000L);
                                    String pinnumber="  "+Math.abs((random.nextLong()%9000L)+1000L);
                                    String facility="  ";
                                         if(c1.isSelected())  {facility=facility+"ATM Card";                }
                                    else if(c2.isSelected())  {facility=facility+"Internet Banking";        }
                                    else if(c3.isSelected())  {facility=facility+"Mobile Banking";          }
                                    else if(c4.isSelected())  {facility=facility+"EMAIL & SMS ALERTS";      }
                                    else if(c5.isSelected())  {facility=facility+"Cheque BOOK";             }
                                    else if(c6.isSelected())  {facility=facility+"E-Statement";             } 
    
                                    try{
                                         if(accountType.equals(" ")){
                                         JOptionPane.showMessageDialog(null,"ACCOUNT TYPE REQUIRED");
                                                                    }
                                         else{
                                              Conn conn=new Conn();
                                              String query="insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                                              String query1="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                                              conn.s.executeUpdate(query);
                                              conn.s.executeUpdate(query1);
                                              JOptionPane.showMessageDialog(null,"CARD NUMBER: "+cardnumber+"\n PIN NUMBER: "+pinnumber);
                                              setVisible(false);
                                              new Deposit(pinnumber).setVisible(false);
                                             }
                                        }catch(Exception e){System.out.println(e);}
    
                                     }//END OF FIRST IF BLOCK
                                    else if(ae.getSource()==cancel){
                                                                    setVisible(false);
                                                                    new Login().setVisible(true);
                                                                    }    
    
                                                } //END OF ACTION PERFORMED METHOD
    
    public static void main(String[] args){new  Signupthree(" ");}   
}//END OF MAIN CLASS
