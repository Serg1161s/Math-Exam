package text_fields;

import pages.FirstPage;

import javax.swing.*;

public class NumTextField extends JTextField
{
    public JTextField numTextField (int x, int y, int weight, int height, int firstNum){
        JTextField num = new JTextField();
        num.setBounds(x, y, weight, height);
       num.setFocusable(false);
       num.setHorizontalAlignment(JTextField.CENTER);
       num.setFont(FirstPage.numFont);
       num.setEditable(false);
       num.setText(String.valueOf((int) (Math.random() * firstNum)));

       return num;
    }

}
