package text_fields;

import pages.FirstPage;

import javax.swing.*;

public class TextTextFields extends JTextField
{
    public JTextField textTextField (int x, int y, int height, int weight, String text ){

        JTextField textField = new JTextField();
        textField.setBounds(x,y,height,weight);
        textField.setFocusable(false);
        textField.setFocusable(false);
        textField.setText(text);
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setFont(FirstPage.numFont);
        textField.setEditable(false);

        return textField;
    }
}
