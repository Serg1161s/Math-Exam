package menu;

import pages.FirstPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstNumberMenu extends JMenu
{
    public JMenu firstNumber ()
    {
        JMenu firstNum = new JMenu("Первое Число");

        JCheckBoxMenuItem tillTen = new JCheckBoxMenuItem("от 2 до 10");
        JCheckBoxMenuItem tillTwenty = new JCheckBoxMenuItem("от 2 до 20");
        JCheckBoxMenuItem tillHundred = new JCheckBoxMenuItem("от 2 до 100");

        ButtonGroup firstNumberGroup = new ButtonGroup();
        firstNumberGroup.add(tillTen);
        firstNumberGroup.add(tillTwenty);
        firstNumberGroup.add(tillHundred);

        firstNum.add(tillTen);
        firstNum.add(tillTwenty);
        firstNum.add(tillHundred);
        tillTen.setSelected(true);
        tillTen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstPage.firstNumber = 8;
                System.out.println("First number till 10 " + FirstPage.firstNumber);
            }
        });
        tillTwenty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstPage.firstNumber = 18;
                System.out.println("First number till twenty " +  FirstPage.firstNumber);
            }
        });


        tillHundred.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstPage.firstNumber = 98;
                System.out.println("First number till hundred " +  FirstPage.firstNumber);
            }
        });


        return firstNum;
    }
}
