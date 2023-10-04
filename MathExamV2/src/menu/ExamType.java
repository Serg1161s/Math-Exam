package menu;

import pages.FirstPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExamType extends JMenu
{
    public   JMenu examType ()
    {
        JMenu file = new JMenu("Тип Экзамена");
        JCheckBoxMenuItem plus = new JCheckBoxMenuItem("Сложение");
        JCheckBoxMenuItem minus = new JCheckBoxMenuItem("Вычитание");
        JCheckBoxMenuItem multiplication = new JCheckBoxMenuItem("Умножение");
        JCheckBoxMenuItem division = new JCheckBoxMenuItem("Деление");

        ButtonGroup typeExam = new ButtonGroup();
        typeExam.add(plus);
        typeExam.add(minus);
        typeExam.add(multiplication);
        typeExam.add(division);

        file.add(plus);
        file.add(minus);
        file.add(multiplication);
        file.add(division);
        multiplication.setSelected(true);

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstPage.typeOfExam = 1;
                System.out.println("plus = " + 1);
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstPage.typeOfExam = 2;
                System.out.println("minus = " +  FirstPage.typeOfExam);
            }
        });
        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstPage.typeOfExam = 3;
                System.out.println("multiplication = " +  FirstPage.typeOfExam);
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstPage.typeOfExam = 4;
                System.out.println("division = " +  FirstPage.typeOfExam);
            }
        });

        return file;
    }
}
