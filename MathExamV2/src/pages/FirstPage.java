package pages;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage extends JFrame
{

    public int TypeOfExam = 3;
    public int FirstNumber = 8;
    public int SecondNumber = 8;
    public  int Score = 0;


    public Font numFont = new Font(Font.SERIF,1,55);
    public Font actionNumFont = new Font(Font.SERIF,1,45);
    public Font rulesNumFont = new Font(Font.SERIF,1,30);

    public FirstPage ()
    {
      //  super("Тестовый Экзамен");
        setTitle("Тестовый Экзамен");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();

        menuBar.add (examType());
        menuBar.add (firstNumber());
        menuBar.add (secondNumber());

        setJMenuBar(menuBar);
        setSize(900,500);
        setLocationRelativeTo(null);

        add(firstNumberTextField());
        add(secondNumberTextField());
        add(equalTextField());
        add(actionTextField());
        add(checkButton());
        add(newExamButton());
        add(answerTextField());
        add(scoreTextField());
        add(rulesTextField());
        add(ratioTextField());

        getContentPane().setBackground(new Color(125,200,125));
        setLayout(null);
        setVisible(true);

    }


    private JTextField ratioTextField () {
        JTextField ratio = new JTextField();
        ratio.setBounds(590, 10, 100, 100);
        ratio.setFocusable(false);
        ratio.setHorizontalAlignment(JTextField.CENTER);
        ratio.setFont(numFont);
        ratio.setEditable(false);
        ratio.setText("" + foundRatio());
        add(ratio);

        return ratio;
    }
    private JTextArea rulesTextField () {
        JTextArea rulesExam = new JTextArea(5,1);
        rulesExam.setBounds(10,10,570,100);
        rulesExam.setLineWrap(true);
        rulesExam.setFont(rulesNumFont);

        rulesExam.setText(" Чем сложнее пример, тем больше монет ты получишь! Набери 100 монет! "

        );
        rulesExam.setEditable(false);
        rulesExam.setFocusable(false);

        add(rulesExam);

        return rulesExam;
    }
    private JTextField firstNumberTextField () {
        JTextField firstNum = new JTextField();
        firstNum.setBounds(10, 120, 150, 150);
        firstNum.setFocusable(false);
        firstNum.setHorizontalAlignment(JTextField.CENTER);
        firstNum.setFont(numFont);
        firstNum.setEditable(false);
        firstNum.setText(String.valueOf((int) (Math.random() * FirstNumber)));
        add(firstNum);

        return firstNum;
    }
    private JTextField secondNumberTextField () {

        JTextField secondNum = new JTextField();
        secondNum.setBounds(330, 120, 150, 150);
        secondNum.setFocusable(false);
        secondNum.setFocusable(false);
        secondNum.setHorizontalAlignment(JTextField.CENTER);
        secondNum.setFont(numFont);
        secondNum.setEditable(false);
        secondNum.setText(String.valueOf((int) (Math.random() * SecondNumber)));

        add(secondNum);

        return secondNum;
    }

    private JTextField equalTextField () {

        JTextField equal = new JTextField();
        equal.setBounds(490, 120, 150, 150);
        equal.setFocusable(false);
        equal.setFocusable(false);
        equal.setHorizontalAlignment(JTextField.CENTER);
        equal.setFont(numFont);
        equal.setEditable(false);
        equal.setText(" = ");

        add(equal);
        return equal;
    }

    private JTextField scoreTextField () {

        JTextField score = new JTextField("0");
        score.setBounds(700, 10, 100, 100);
        score.setFocusable(false);
        score.setFocusable(false);
        score.setHorizontalAlignment(JTextField.CENTER);
        score.setFont(actionNumFont);
        score.setEditable(false);
        score.setText("" + Score);

        add(score);
        return score;
    }

    private JButton checkButton() {

        JButton check = new JButton("Проверить");
        check.setBounds(430, 300, 380, 80);
        check.setFont(actionNumFont);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (foundRes()) {
                    Score = Score + foundRatio();
                } else {
                    Score = Score - foundRatio();
                    ;
                }
                scoreTextField().setText("" + Score);
                newExamButton().setEnabled(true);
            }
        });
        add(check);
        return check;
    }

        private JButton newExamButton(){

        JButton newExam = new JButton("Новый пример");
        newExam.setBounds(10,300,380,80);
        newExam.setFont(actionNumFont);

        newExam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                newExam.setEnabled(false);
                checkButton().setEnabled(true);

            }
        });


        add(newExam);

        return newExam;
    }
    private JTextField answerTextField () {

        JTextField answer = new JTextField();
        answer.setBounds(650,120,150,150);
        answer.setFocusable(true);
        answer.setText("");
        answer.setHorizontalAlignment(JTextField.CENTER);
        answer.setFont(numFont);
        answer.setEditable(true);

        add(answer);

        return answer;
    }
    private JTextField actionTextField(){

        JTextField act = new JTextField();
        act.setBounds(170,120,150,150);
        act.setFocusable(false);
        act.setText("*");
        act.setHorizontalAlignment(JTextField.CENTER);
        act.setFont(numFont);
        act.setEditable(false);



        return act;
    }

    private JMenu examType ()
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
                TypeOfExam = 1;
                actionTextField().setText("+");
                System.out.println("plus = " + 1);
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TypeOfExam = 2;
                actionTextField().setText("-");
                System.out.println("minus = " + TypeOfExam);
            }
        });
        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TypeOfExam = 3;
                actionTextField().setText("*");
                System.out.println("multiplication = " + TypeOfExam);
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TypeOfExam = 4;
                actionTextField().setText("/");
                System.out.println(actionTextField().getText());
                System.out.println("division = " + TypeOfExam);
            }
        });



        return file;
    }

    private JMenu firstNumber ()
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
                FirstNumber = 8;
                System.out.println("First number till 10 " + FirstNumber);
                ratioTextField().setText("" + foundRatio());
            }
        });
        tillTwenty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstNumber = 18;
                System.out.println("First number till twenty " + FirstNumber);
                ratioTextField().setText("" + foundRatio());
            }
        });


        tillHundred.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstNumber = 98;
                System.out.println("First number till hundred " + FirstNumber);
                ratioTextField().setText("" + foundRatio());
            }
        });


        return firstNum;
    }
    private JMenu secondNumber ()
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
                SecondNumber = 8;
                System.out.println("Second number till 10 " + SecondNumber);
                ratioTextField().setText("" + foundRatio());
            }
        });
        tillTwenty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SecondNumber = 18;
                System.out.println("second number till twenty " + SecondNumber);
                ratioTextField().setText("" + foundRatio());
            }
        });


        tillHundred.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SecondNumber = 98;
                System.out.println("second number till hundred " + SecondNumber);
                ratioTextField().setText("" + foundRatio());
            }
        });
        return secondNum;
    }
    private int foundRatio (){
        int ratio = 1;
        int sum = FirstNumber + SecondNumber;

        if (sum < 20) {
            ratio = 1;
        } else if ( sum < 27 ) {
            ratio = 5;
        } else if ( sum < 107 ){
            ratio = 10;
        }else if ( sum < 120 ){
            ratio = 15;
        }else {
            ratio = 20;
        }
        System.out.println(ratio);
        return ratio;
    }

    private  boolean foundRes ()
    {
        int res = 0;
        if (TypeOfExam == 1 ) {
            res = Integer.valueOf(firstNumberTextField().getText()) + Integer.valueOf(secondNumberTextField().getText());
        }
        if (TypeOfExam == 2 ) {
            res = Integer.valueOf(firstNumberTextField().getText()) - Integer.valueOf(secondNumberTextField().getText());
        }
        if (TypeOfExam == 3 ) {
            res = Integer.valueOf(firstNumberTextField().getText()) * Integer.valueOf(secondNumberTextField().getText());
        }
        if (TypeOfExam == 4 ) {
            res = Integer.valueOf(firstNumberTextField().getText()) / Integer.valueOf(secondNumberTextField().getText());
        }


        return res == Integer.valueOf(answerTextField().getText());
    }



}
