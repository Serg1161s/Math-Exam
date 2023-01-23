package pages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.awt.FlowLayout.CENTER;

public class LoginPage extends JFrame {
    JFrame frame = new JFrame("Login Page");
    final  JTextField login = new JTextField();
    JLabel loginLabel = new JLabel("Name");
    JButton enter = new JButton("Enter");
    Font loginFont = new Font(Font.SERIF,Font.PLAIN,25);

     public void loginPage (){

        frame.setBackground(Color.LIGHT_GRAY);
        frame.setSize(300,200);
        frame.setTitle("Login Page");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);


        login.setFont(loginFont);
        login.setBounds(100,30,150,50);
        login.setHorizontalAlignment(JTextField.CENTER);


        loginLabel.setFont(loginFont);
        loginLabel.setBounds(20,30,70,50);
        loginLabel.setHorizontalAlignment(JLabel.CENTER);
        loginLabel.setVerticalTextPosition(JLabel.CENTER);
        loginLabel.setEnabled(false);

        enter.setFont(loginFont);
        enter.setBounds(150,100,100,50);
        enter.setHorizontalAlignment(SwingConstants.CENTER);

        enter.setFocusable(false);



        frame.add(login);
        frame.add(loginLabel);
        frame.add(enter);
         login.addKeyListener(new KeyAdapter() {
             @Override
             public void keyPressed(KeyEvent e) {
                 Pattern p = Pattern.compile("(([a-zA-Z]){0,}([\\.]){0,})+");
                 Matcher m =p.matcher(login.getText());
                 if(!m.matches()){
                     login.setText("Wrong");
                 }

             }
         });

         enter.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 login.setText("");
                 login.setEditable(true);
             }
         });

    }



}
