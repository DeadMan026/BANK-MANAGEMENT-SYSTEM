package bank.management.system;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame {

    Random ran = new Random();
    String formNo = "" + (ran.nextInt(9000) + 1000);

    JTextField textName, textFName, textEmail, textAddress, textCity, textState, textPinCode;
    JDateChooser dateChooser;
    JRadioButton r1, r2, r3, r4, r5;
    
    Signup() {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(30, 10, 100, 100); 
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO. "+formNo);
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Avant Garde",Font.BOLD,28));
        label1.setBounds(165,20,420,50);
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Calibri",Font.BOLD,18));
        label2.setForeground(Color.BLACK);
        label2.setBounds(330,65,200,50);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Calibri",Font.BOLD,22));
        label3.setForeground(Color.BLACK);
        label3.setBounds(280,95,400,50);
        add(label3);

        JLabel label4 = new JLabel("Name:");
        label4.setFont(new Font("Calibri",Font.BOLD,20));
        label4.setForeground(Color.BLACK);
        label4.setBounds(60,185,200,30);
        add(label4);

        textName = new JTextField(15);
        textName.setFont(new Font("Arial",Font.BOLD,16));
        textName.setBounds(250,180,315,30);
        add(textName);

        JLabel label5 = new JLabel("Father's Name:");
        label5.setFont(new Font("Calibri",Font.BOLD,20));
        label5.setForeground(Color.BLACK);
        label5.setBounds(60,235,200,30);
        add(label5);

        textFName = new JTextField(15);
        textFName.setFont(new Font("Arial",Font.BOLD,16));
        textFName.setBounds(250,230,315,30);
        add(textFName);
        
        JLabel label6 = new JLabel("Gender:");
        label6.setFont(new Font("Calibri",Font.BOLD,20));
        label6.setForeground(Color.BLACK);
        label6.setBounds(60,285,200,30);
        add(label6);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Arial",Font.PLAIN,18));
        r1.setBounds(250,280,80,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Arial",Font.PLAIN,18));
        r2.setBounds(340,280,100,30);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Arial",Font.PLAIN,18));
        r3.setBounds(450,280,100,30);
        add(r3);

        JLabel label7 = new JLabel("Date Of Birth:");
        label7.setFont(new Font("Calibri",Font.BOLD,20));
        label7.setForeground(Color.BLACK);
        label7.setBounds(60,335,200,30);
        add(label7);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(Color.BLACK);
        dateChooser.setBounds(250,330,315,30);
        add(dateChooser);

        JLabel label8 = new JLabel("Email Address:");
        label8.setFont(new Font("Calibri",Font.BOLD,20));
        label8.setForeground(Color.BLACK);
        label8.setBounds(60,385,200,30);
        add(label8);

        textEmail = new JTextField(15);
        textEmail.setFont(new Font("Arial",Font.BOLD,16));
        textEmail.setBounds(250,380,315,30);
        add(textEmail);

        JLabel label9 = new JLabel("Marital Status:");
        label9.setFont(new Font("Calibri",Font.BOLD,20));
        label9.setForeground(Color.BLACK);
        label9.setBounds(60,435,200,30);
        add(label9);

        r4 = new JRadioButton("Married");
        r4.setFont(new Font("Arial",Font.PLAIN,18));
        r4.setBounds(250,430,120,30);
        add(r4);

        r5 = new JRadioButton("Unmarried");
        r5.setFont(new Font("Arial",Font.PLAIN,18));
        r5.setBounds(370,430,120,30);
        add(r5);

        JLabel label10 = new JLabel("Address:");
        label10.setFont(new Font("Calibri",Font.BOLD,20));
        label10.setForeground(Color.BLACK);
        label10.setBounds(60,485,200,30);
        add(label10);

        textAddress = new JTextField(15);
        textAddress.setFont(new Font("Arial",Font.BOLD,16));
        textAddress.setBounds(250,480,315,30);
        add(textAddress);

        JLabel label11 = new JLabel("City:");
        label11.setFont(new Font("Calibri",Font.BOLD,20));
        label11.setForeground(Color.BLACK);
        label11.setBounds(60,535,200,30);
        add(label11);

        textCity = new JTextField(15);
        textCity.setFont(new Font("Arial",Font.BOLD,16));
        textCity.setBounds(250,530,315,30);
        add(textCity);

        JLabel label12 = new JLabel("State:");
        label12.setFont(new Font("Calibri",Font.BOLD,20));
        label12.setForeground(Color.BLACK);
        label12.setBounds(60,585,200,30);
        add(label12);

        textState = new JTextField(15);
        textState.setFont(new Font("Arial",Font.BOLD,16));
        textState.setBounds(250,580,315,30);
        add(textState);

        JLabel label13 = new JLabel("Pin Code:");
        label13.setFont(new Font("Calibri",Font.BOLD,20));
        label13.setForeground(Color.BLACK);
        label13.setBounds(60,635,200,30);
        add(label13);

        textPinCode = new JTextField(15);
        textPinCode.setFont(new Font("Arial",Font.BOLD,16));
        textPinCode.setBounds(250,630,315,30);
        add(textPinCode);

        /*  -- ADD YOUR OWN BACKGROUND -- 
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/signup.jpg"));
        Image ii2 = ii1.getImage().getScaledInstance(750, 750, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        image1 = new JLabel(ii3);
        image1.setBounds(0, 0, 750, 750);
        add(image1);
        */

        getContentPane().setBackground(new Color(0xF5F1E8));

        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(750, 750);
        setLocation(350, 60);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Signup();
    }
}
