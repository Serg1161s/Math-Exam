package pages;


import buttons.CheckButton;
import buttons.NewExamButton;
import menu.ExamType;
import menu.FirstNumberMenu;
import menu.Menu;
import menu.SecondNumberMenu;
import pages.functions.FoundRatio;
import text_fields.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static pages.functions.FoundRatio.foundRatio;

public class FirstPage extends JFrame
{

    public static int typeOfExam = 3;
    public static int firstNumber = 8;
    public static int secondNumber = 8;
    public static int score = 10;


    public static Font numFont = new Font(Font.SERIF,1,55);
    public static Font actionNumFont = new Font(Font.SERIF,1,45);
    public static Font rulesNumFont = new Font(Font.SERIF,1,30);



    JButton newExamButton = new NewExamButton().newExamButton();
    JButton checkButton = new CheckButton().checkButton();

    JTextField ratioField = new TextFieldRatio().answerTextField();
    JTextField answerText = new AnswerTextField().answerTextField();
    JTextField scoreText = new ScoreTextField().scoreTextField();
    JTextField firstNum = new NumTextField().numTextField(10,120,150,150, firstNumber);
    JTextField secondNum = new NumTextField().numTextField(330, 120, 150, 150, secondNumber);

    JTextField mathText = new TextTextFields().textTextField(170,120,150,150,"*");
    JTextField equalText = new TextTextFields().textTextField(490, 120, 150, 150,"=");

    JTextArea rulesExam = new RulesTextArea().rulesTextArea();

    JMenuBar menuBar = new Menu().menuBar();



    public  FirstPage ()
    {
      //  super("Тестовый Экзамен");
        setTitle("Тестовый Экзамен");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,500);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(125,200,125));
        setLayout(null);

        setJMenuBar(menuBar);
       // add(newExamButton);
        add(checkButton);

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int ans = Integer.valueOf(answerText.getText());
                } catch (NumberFormatException exception) {
                    answerText.setText("-1");
                }


                if (foundRes(Integer.valueOf(firstNum.getText()), Integer.valueOf(secondNum.getText()), Integer.valueOf(answerText.getText()))) {
                    score = score + foundRatio();
                } else {
                    score = score - foundRatio();

                }
                scoreText.setText("" + score);
                firstNum.setText(String.valueOf((int) (Math.random() * firstNumber)+2));
                secondNum.setText(String.valueOf((int) (Math.random() * secondNumber)+2));

                while (Integer.valueOf(secondNum.getText()) > Integer.valueOf(firstNum.getText()) && typeOfExam == 2) {
                    secondNum.setText(String.valueOf((int) (Math.random() * secondNumber)));
                }

                answerText.setText("");
                mathText.setText(actMath());
                ratioField.setText("" + foundRatio());
            }
        });


        add(rulesExam);
        add(ratioField);
        add(scoreText);
        add(firstNum);
        add(mathText);
        add(secondNum);
        add(equalText);
        add(answerText);

        setVisible(true);

    }







    private  boolean foundRes (int num1, int num2, int sum)
    {
        int res = 0;

        if (typeOfExam == 1 ) {
            res = Integer.valueOf(num1 + num2);
        }
        if (typeOfExam == 2 ) {
            res = Integer.valueOf(num1 - num2);
        }
        if (typeOfExam == 3 ) {
            res = Integer.valueOf(num1 * num2);
        }
        if (typeOfExam == 4 ) {
            res = Integer.valueOf(num1 / num2);
        }


        return res == sum;
    }

    private  String  actMath ()
    {
        String ans = "";

        if (typeOfExam == 1 ) {
            ans = "+";
        }
        if (typeOfExam == 2 ) {
            ans = "-";
        }
        if (typeOfExam == 3 ) {
            ans = "*";
        }
        if (typeOfExam == 4 ) {
            ans = "/";
        }


        return ans;
    }

}
