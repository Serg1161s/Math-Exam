package buttons;

import pages.FirstPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewExamButton extends JButton {
    public JButton newExamButton() {
        JButton button = new JButton("Новый пример");

        button.setBounds(10, 300, 380, 80);
        button.setFont(FirstPage.actionNumFont);
        button.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                button.setEnabled(false);

            }
        });

        return  button;
    }

}
