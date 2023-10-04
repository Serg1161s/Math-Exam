package text_fields;

import pages.FirstPage;

import javax.swing.*;

public class AnswerTextField {
    public JTextField answerTextField () {
        JTextField answer = new JTextField();
        answer.setBounds(650, 120, 150, 150);
        answer.setFocusable(true);
        answer.setText("");
        answer.setHorizontalAlignment(JTextField.CENTER);
        answer.setFont(FirstPage.numFont);
        answer.setEditable(true);
        return answer;
    }
}
