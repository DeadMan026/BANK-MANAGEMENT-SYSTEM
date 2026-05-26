package bank.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    
    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passField3;
    JButton button1,button2,button3;

    public Login(){
        super("Bank Management System");
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 10, 100, 100); 
        add(image);

        
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel image2 = new JLabel(ii3);
        image2.setBounds(730, 450, 100, 100); 
        add(image2);

        label1 = new JLabel("WELCOME TO SS ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(240,125,450,40);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Railway",Font.BOLD,26));
        label2.setForeground((Color.WHITE));
        label2.setBounds(180,250,375,30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(310,250,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);
        
        label3 = new JLabel("PIN No: ");
        label3.setFont(new Font("Railway",Font.BOLD,26));
        label3.setForeground((Color.WHITE));
        label3.setBounds(180,250,375,125);
        add(label3);

        passField3 = new JPasswordField(15);
        passField3.setBounds(310,300,230,30);
        add(passField3);

        //buttons
        button1 = new JButton("SIGN UP");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(320,375,100,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(450,375,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN IN");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(320,420,230,30);
        button3.addActionListener(this);
        add(button3);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(950,580, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel image3 = new JLabel(iii3);
        image3.setBounds(0, 0, 950, 580); 
        add(image3);
        

        
        setLayout(null);
        setSize(950,580);
        setLocation(300, 150);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource() == button1){
                new Signup();
                setVisible(false);
            } else if (e.getSource() == button2){
                textField2.setText("");
                passField3.setText("");
            } else if (e.getSource() == button3){
                
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
