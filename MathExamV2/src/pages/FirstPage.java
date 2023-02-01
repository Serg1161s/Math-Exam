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
    public  int Score = 10;


    public Font numFont = new Font(Font.SERIF,1,55);
    public Font actionNumFont = new Font(Font.SERIF,1,45);
    public Font rulesNumFont = new Font(Font.SERIF,1,30);

    public  FirstPage ()
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

        JTextArea rulesExam = new JTextArea(5,1);
        rulesExam.setBounds(10,10,570,100);
        rulesExam.setLineWrap(true);
        rulesExam.setFont(rulesNumFont);
        rulesExam.setText(" Чем сложнее пример, тем больше монет ты получишь! Набери 100 монет! ");
        rulesExam.setEditable(false);
        rulesExam.setFocusable(false);

        JTextField ratio = new JTextField();
        ratio.setBounds(590, 10, 100, 100);
        ratio.setFocusable(false);
        ratio.setHorizontalAlignment(JTextField.CENTER);
        ratio.setFont(numFont);
        ratio.setEditable(false);
        ratio.setText("" + foundRatio());

        JTextField score = new JTextField();
        score.setBounds(700, 10, 100, 100);
        score.setFocusable(false);
        score.setFocusable(false);
        score.setHorizontalAlignment(JTextField.CENTER);
        score.setFont(actionNumFont);
        score.setEditable(false);
        score.setText("" + Score);

        JTextField firstNum = new JTextField();
        firstNum.setBounds(10, 120, 150, 150);
        firstNum.setFocusable(false);
        firstNum.setHorizontalAlignment(JTextField.CENTER);
        firstNum.setFont(numFont);
        firstNum.setEditable(false);
        firstNum.setText(String.valueOf((int) (Math.random() * FirstNumber)));

        JTextField math = new JTextField();
        math.setBounds(170,120,150,150);
        math.setFocusable(false);
        math.setText("*");
        math.setHorizontalAlignment(JTextField.CENTER);
        math.setFont(numFont);
        math.setEditable(false);

        JTextField secondNum = new JTextField();
        secondNum.setBounds(330, 120, 150, 150);
        secondNum.setFocusable(false);
        secondNum.setFocusable(false);
        secondNum.setHorizontalAlignment(JTextField.CENTER);
        secondNum.setFont(numFont);
        secondNum.setEditable(false);
        secondNum.setText(String.valueOf((int) (Math.random() * SecondNumber)));

        JTextField equal = new JTextField();
        equal.setBounds(490, 120, 150, 150);
        equal.setFocusable(false);
        equal.setFocusable(false);
        equal.setHorizontalAlignment(JTextField.CENTER);
        equal.setFont(numFont);
        equal.setEditable(false);
        equal.setText(" = ");

        JTextField answer = new JTextField();
        answer.setBounds(650,120,150,150);
        answer.setFocusable(true);
        answer.setText("");
        answer.setHorizontalAlignment(JTextField.CENTER);
        answer.setFont(numFont);
        answer.setEditable(true);

        JButton newExam = new JButton("Новый пример");
        newExam.setBounds(10,300,380,80);
        newExam.setFont(actionNumFont);

        newExam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                newExam.setEnabled(false);

            }
        });

        JButton check = new JButton("Проверить");
        check.setBounds(430, 300, 380, 80);
        check.setFont(actionNumFont);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int ans = Integer.valueOf(answer.getText());
                } catch (NumberFormatException exception) {
                    answer.setText("-1");
                }


                if (foundRes(Integer.valueOf(firstNum.getText()), Integer.valueOf(secondNum.getText()), Integer.valueOf(answer.getText()))) {
                    Score = Score + foundRatio();
                } else {
                    Score = Score - foundRatio();
                    ;
                }
                score.setText("" + Score);
                firstNum.setText(String.valueOf((int) (Math.random() * FirstNumber)+2));
                secondNum.setText(String.valueOf((int) (Math.random() * SecondNumber)+2));

                while (Integer.valueOf(secondNum.getText()) > Integer.valueOf(firstNum.getText()) && TypeOfExam == 2) {
                      secondNum.setText(String.valueOf((int) (Math.random() * SecondNumber)));
                }

                answer.setText("");
                math.setText(actMath());
                ratio.setText("" + foundRatio());
            }
        });

        add(rulesExam);
        add(ratio);
        add(score);

        add(firstNum);
        add(math);
        add(secondNum);
        add(equal);
        add(answer);

        add(newExam);
        add(check);

        getContentPane().setBackground(new Color(125,200,125));
        setLayout(null);
        setVisible(true);

    }



    private  JMenu examType ()
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
                System.out.println("plus = " + 1);
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TypeOfExam = 2;
                System.out.println("minus = " + TypeOfExam);
            }
        });
        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TypeOfExam = 3;
                System.out.println("multiplication = " + TypeOfExam);
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TypeOfExam = 4;
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
            }
        });
        tillTwenty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstNumber = 18;
                System.out.println("First number till twenty " + FirstNumber);
            }
        });


        tillHundred.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstNumber = 98;
                System.out.println("First number till hundred " + FirstNumber);
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
            }
        });
        tillTwenty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SecondNumber = 18;
                System.out.println("second number till twenty " + SecondNumber);
            }
        });


        tillHundred.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SecondNumber = 98;
                System.out.println("second number till hundred " + SecondNumber);
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

    private  boolean foundRes (int num1, int num2, int sum)
    {
        int res = 0;

        if (TypeOfExam == 1 ) {
            res = Integer.valueOf(num1 + num2);
        }
        if (TypeOfExam == 2 ) {
            res = Integer.valueOf(num1 - num2);
        }
        if (TypeOfExam == 3 ) {
            res = Integer.valueOf(num1 * num2);
        }
        if (TypeOfExam == 4 ) {
            res = Integer.valueOf(num1 / num2);
        }


        return res == sum;
    }

    private  String  actMath ()
    {
        String ans = "";

        if (TypeOfExam == 1 ) {
            ans = "+";
        }
        if (TypeOfExam == 2 ) {
            ans = "-";
        }
        if (TypeOfExam == 3 ) {
            ans = "*";
        }
        if (TypeOfExam == 4 ) {
            ans = "/";
        }


        return ans;
    }

}
