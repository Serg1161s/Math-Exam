package buttons;

import pages.FirstPage;
import text_fields.AnswerTextField;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckButton {
    public JButton checkButton(int x, int y, int width, int height, String str){
        JButton button = new JButton(str);
        button.setBounds(x,y,width,height);
        button.setFont(FirstPage.actionNumFont);
        return  button;
    }
}
