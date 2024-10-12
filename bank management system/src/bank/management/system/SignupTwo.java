
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class SignupTwo extends JFrame implements ActionListener{
    long         random;
    String       formno;
    JLabel       additionalDetails,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JButton      next;
    JComboBox    religion,category,income,education,occupation;
    JTextField   incomeTextField,religionTextField,categoryTextField,l7TextField,l8TextField;
    JRadioButton eyes,eno,syes,sno; 
SignupTwo(String formno){ 
     this.formno=formno;
     setLayout(null);
     setTitle("NEW ACCOUNT APPLICATION FORM-PAGE 2");
     Random ran=new Random();
     random=Math.abs(ran.nextLong()%9000L+1000L);    
//CREATION OF LABEL FOR ADDITIONAL DETAILS        
        additionalDetails =new JLabel("PAGE 2:ADDITIONAL DETAILES");
        additionalDetails.setFont(new Font("Raieway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
//CREATION OF LABEL FOR RELIGION        
        l1 =new JLabel("RELIGIONAL:");          //l1
        l1.setFont(new Font("Raieway",Font.BOLD,20));
        l1.setBounds(100,140,150,30);
        l1.setForeground(Color.black);
        add(l1);
//CREATION OF STRING ARRAY         
        String valReligion[]={"HINDU","MUSILIM","SIKH","CHRISTIAN","OTHER"};
        religion=new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.black);
        religion.setForeground(Color.white);
        add(religion);
      //CREATION OF TEXTFIELD FOR THE ABOVE
        religionTextField=new JTextField();
        religionTextField.setFont(new Font("Raleway",Font.BOLD,14));
        religionTextField.setBounds(300,140,400,30);
        add(religionTextField);
//CREATION OF LABEL FOR CATEGORY        
        l2=new JLabel("CATEGORY:");
        l2.setFont(new Font("Raleway",Font.BOLD,20));
        l2.setBounds(100,190,200,30);
        add(l2);
//CREATION OF STRING ARRAY        
        String valCategory[]={"GENERAL","OBC","SC","ST","OTHER"};
        category=new JComboBox(valCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.black);
        category.setForeground(Color.white);
        add(category);
      //CREATION OF TEXTFIELD FOR THE ABOVE  
        categoryTextField=new JTextField();
        categoryTextField.setFont(new Font("Raleway",Font.BOLD,14));
        categoryTextField.setBounds(300,190,400,30);
        add(categoryTextField);
//CREATION OF LABEL FOR INCOME        
        l3=new JLabel("INCOME:");
        l3.setFont(new Font("Raieway",Font.BOLD,20));
        l3.setBounds(100,240,200,30);
        add(l3);
//CREATION OF STRING ARRAY          
        String incomeCategory[]={"NULL","<1,50,000","<2,50,000","<5,00,000","OTHER"};
        income=new JComboBox(incomeCategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.black);
        income.setForeground(Color.white);
        add(income);
      //CREATION OF TEXTFIELD FOR THE ABOVE 
        incomeTextField=new JTextField();
        incomeTextField.setFont(new Font("Raleway",Font.BOLD,14));
        incomeTextField.setBounds(300,240,400,30);
        add(incomeTextField);
//CREATION OF LABEL FOR EDUCATION AND QUALIFIACTION        
        l4=new JLabel("EDUCATIONAL");
        l4.setFont(new Font("Raieway",Font.BOLD,20));
        l4.setBounds(100,290,200,30);
        add(l4); 
        
        l5=new JLabel("QUALIFICATION:");
        l5.setFont(new Font("Raieway",Font.BOLD,20));
        l5.setBounds(100,315,200,30);
        add(l5);
        
String educationValues[]={"NON GRADUATION","GRADUATION","POST-GRADUATION","DOCTORATE","OTHER"};
        education=new JComboBox(educationValues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.black);
        education.setForeground(Color.white);
        add(education);
//CREATION OF LABEL FOR OCCUPATION        
        l6=new JLabel("OCCUPATION:");
        l6.setFont(new Font("Raieway",Font.BOLD,20));
        l6.setBounds(100,390,200,30);
        add(l6);
//CREATION OF STRING ARRAY           
        String occupationValues[]={"SALARIED","SELF-EMPLOYEED","BUSSINESS","STUDENT","RETIRED","OTHER"};
        occupation=new JComboBox(occupationValues);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.black);
        occupation.setForeground(Color.white);
        add(occupation);
//CREATION OF LABEL AND TEXTFIELD FOR PAN NUMBER        
        l7=new JLabel("PAN NO:");
        l7.setFont(new Font("Raleway",Font.BOLD,20));
        l7.setBounds(100,440,200,30);
        add(l7);
        
        l7TextField=new JTextField();
        l7TextField.setFont(new Font("Raleway",Font.BOLD,14));
        l7TextField.setBounds(300,440,400,30);
        add(l7TextField);
//CREATION OF LABEL AND TEXTFIELD FOR AADHAR CARD        
        l8=new JLabel("AADHAAR NO:");
        l8.setFont(new Font("Raieway",Font.BOLD,20));
        l8.setBounds(100,490,200,30);
        add(l8);
        
        l8TextField=new JTextField();
        l8TextField.setFont(new Font("Raleway",Font.BOLD,14));
        l8TextField.setBounds(300,490,400,30);
        add(l8TextField);
 //CREATION OF LABEL RADIO BUTTON  FOR SENIOR CITIZEN       
        l9=new JLabel("SENIOR CITIZEN:");
        l9.setFont(new Font("Raieway",Font.BOLD,20));
        l9.setBounds(100,540,200,30);
        add(l9);
        
        syes=new JRadioButton("YES");
        syes.setBounds(350,540,100,30);
        syes.setBackground(Color.pink);
        add(syes);
        
        sno=new JRadioButton("NO");
        sno.setBounds(500,540,100,30);
        sno.setBackground(Color.pink);
        add(sno);
        
        ButtonGroup l6group=new ButtonGroup();
        l6group.add(syes);
        l6group.add(sno);
//CREATION OF LABEL AND RADIO BUTTON FOR EXISTING ACCOUNT        
        l10=new JLabel("EXISITING ACCOUNT:");
        l10.setFont(new Font("Raieway",Font.BOLD,20));
        l10.setBounds(100,590,250,30);
        add(l10);
         
        eyes=new JRadioButton("YES");
        eyes.setBounds(350,590,100,30);
        eyes.setBackground(Color.pink);
        add(eyes);
        
        eno=new JRadioButton("NO");
        eno.setBounds(500,590,100,30);
        eno.setBackground(Color.pink);
        add(eno);
        
        ButtonGroup el6group=new ButtonGroup();
        el6group.add(eyes);
        el6group.add(eno);
//CREATION OF NEXT BUTTON TO JUMP NEXT PAGE       
        next=new JButton("NEXT");
        next.setBackground(Color.pink);
        next.setForeground(Color.blue);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        getContentPane().setBackground(Color.pink);
        
 }//END OF CONSTRUCTOR METHOD
             
               
public void actionPerformed(ActionEvent ae){
        String formno=""+random;
        String sreligion    =(String)religion.getSelectedItem();
        String scategory    =(String)category.getSelectedItem();
        String sincome      =(String)income.getSelectedItem();
        String seducation   =(String)education.getSelectedItem();
        String soccupation  =(String)occupation.getSelectedItem();
        String seniorcitizen=null;
        if(syes.isSelected())           {seniorcitizen="YES";}
   else if(sno.isSelected())            {seniorcitizen="NO";}
        String existingaccount=null;
        if(eyes.isSelected())           {existingaccount="YES";}
   else if(eno.isSelected())            {existingaccount="NO";}   
        String span=l7TextField.getText();//pan no
        String saadhar=l8TextField.getText();//aadhar no
        
        
        
   try{
                   if(sreligion.equals("")){JOptionPane.showMessageDialog(null,"RELIGION IS REQUARIED");}
              else if (l7TextField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "PAN NUMBER IS REQUIRED");
            } else if (l8TextField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "AADHAAR NUMBER IS REQUIRED");
            } else if (!syes.isSelected() && !sno.isSelected()) {
                JOptionPane.showMessageDialog(null, "CITIZEN IS REQUIRED");
            } else if (!eyes.isSelected() && !eno.isSelected()) {
                JOptionPane.showMessageDialog(null, "EXISITIN ACCOUNT IS REQUIRED");
            } 
      else{
       Conn c=new Conn();
       String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
       c.s.executeUpdate(query); 
       setVisible(false);
       new Signupthree(formno).setVisible(true);
            }
      }catch(Exception e){System.out.println(e);}//END OF TRY AND CATCH BLOCK
    
                                           }     //END OF ACTION PERFORMED METHOD
    
 public static void main(String[] args) {new SignupTwo(" ");}
}//END OF MAIN CLASS
