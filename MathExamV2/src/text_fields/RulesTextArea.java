package text_fields;

import pages.FirstPage;

import javax.swing.*;

public class RulesTextArea extends JTextArea
{
    public JTextArea rulesTextArea (){
        JTextArea rulesExam = new JTextArea(5,1);
        rulesExam.setBounds(10,10,570,100);
        rulesExam.setLineWrap(true);
        rulesExam.setFont(FirstPage.rulesNumFont);
        rulesExam.setText(" Чем сложнее пример, тем больше монет ты получишь! Набери 100 монет! ");
        rulesExam.setEditable(false);
        rulesExam.setFocusable(false);
    return rulesExam;

    }
}
