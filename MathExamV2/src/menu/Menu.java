package menu;

import javax.swing.*;

public class Menu extends JMenuBar {
    JMenu firstNumberMenu = new FirstNumberMenu().firstNumber();
    JMenu secondNumberMenu = new SecondNumberMenu().secondNumber();
    JMenu examTypeMenu = new ExamType().examType();

    public JMenuBar menuBar() {

        JMenuBar menuBar = new JMenuBar();

        menuBar.add(examTypeMenu);
        menuBar.add(firstNumberMenu);
        menuBar.add(secondNumberMenu);
        return menuBar;
    }

}
