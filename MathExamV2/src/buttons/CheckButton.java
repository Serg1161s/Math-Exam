package buttons;

import pages.FirstPage;
import text_fields.AnswerTextField;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckButton {
    public JButton checkButton(){
        JButton button = new JButton("Проверить");
        button.setBounds(430, 300, 380, 80);
        button.setFont(FirstPage.actionNumFont);
        return  button;
    }
}
