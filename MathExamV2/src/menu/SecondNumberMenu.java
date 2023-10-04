package menu;

import pages.FirstPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondNumberMenu extends JMenu
{
    public JMenu secondNumber ()
    {
        JMenu secondNum = new JMenu("Второе Число");

        JCheckBoxMenuItem tillTen = new JCheckBoxMenuItem("от 2 до 10");
        JCheckBoxMenuItem tillTwenty = new JCheckBoxMenuItem("от 2 до 20");
        JCheckBoxMenuItem tillHundred = new JCheckBoxMenuItem("от 2 до 100");

        ButtonGroup secondNumberGroup = new ButtonGroup();
        secondNumberGroup.add(tillTen);
        secondNumberGroup.add(tillTwenty);
        secondNumberGroup.add(tillHundred);

        secondNum.add(tillTen);
        secondNum.add(tillTwenty);
        secondNum.add(tillHundred);

        tillTen.setSelected(true);

        tillTen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstPage.secondNumber = 8;
                System.out.println("Second number till 10 " + FirstPage.secondNumber);
            }
        });
        tillTwenty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstPage.secondNumber = 18;
                System.out.println("second number till twenty " + FirstPage.secondNumber);
            }
        });


        tillHundred.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstPage.secondNumber = 98;
                System.out.println("second number till hundred " + FirstPage.secondNumber);
            }
        });
        return secondNum;
    }


}
