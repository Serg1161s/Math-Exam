package buttons;

import pages.FirstPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckButton {
    public JButton checkButton(){
        JButton button = new JButton("Проверить");
        button.setBounds(430, 300, 380, 80);
        button.setFont(FirstPage.actionNumFont);
//        check.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                try {
//                    int ans = Integer.valueOf(answer.getText());
//                } catch (NumberFormatException exception) {
//                    answer.setText("-1");
//                }
//
//
//                if (foundRes(Integer.valueOf(firstNum.getText()), Integer.valueOf(secondNum.getText()), Integer.valueOf(answer.getText()))) {
//                    Score = Score + foundRatio();
//                } else {
//                    Score = Score - foundRatio();
//                    ;
//                }
//                score.setText("" + Score);
//                firstNum.setText(String.valueOf((int) (Math.random() * FirstNumber)+2));
//                secondNum.setText(String.valueOf((int) (Math.random() * SecondNumber)+2));
//
//                while (Integer.valueOf(secondNum.getText()) > Integer.valueOf(firstNum.getText()) && TypeOfExam == 2) {
//                    secondNum.setText(String.valueOf((int) (Math.random() * SecondNumber)));
//                }
//
//                answer.setText("");
//                math.setText(actMath());
//                ratio.setText("" + foundRatio());
//            }
//        });



        return  button;
    }
}
