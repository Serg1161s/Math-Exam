package text_fields;

import pages.FirstPage;

import javax.swing.*;

public class ScoreTextField extends JTextField
{
    public JTextField scoreTextField () {
        JTextField score = new JTextField();
        score.setBounds(700, 10, 100, 100);
        score.setFocusable(false);
        score.setFocusable(false);
        score.setHorizontalAlignment(JTextField.CENTER);
        score.setFont(FirstPage.actionNumFont);
        score.setEditable(false);
        score.setText("" + FirstPage.score);
        return score;
    }

}
