package text_fields;

import pages.FirstPage;
import pages.functions.FoundRatio;

import javax.swing.*;

public class TextFieldRatio extends JTextField {
    public JTextField answerTextField(){
        JTextField jTextField = new JTextField();
        jTextField.setBounds(590, 10, 100, 100);
        jTextField.setFocusable(false);
        jTextField.setHorizontalAlignment(JTextField.CENTER);
        jTextField.setFont(FirstPage.numFont);
        jTextField.setEditable(false);
        jTextField.setText("" + FoundRatio.foundRatio());

        return jTextField;
    }


}
