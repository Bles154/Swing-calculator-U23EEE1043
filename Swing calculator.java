import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JFrame frame;
    private JTextField textField;
    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonEquals;

    public Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);
        frame.add(textField);

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton "-";
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");
        buttonEquals = new JButton("=");

        button0.setBounds(50, 100, 50, 30);
        button1.setBounds(110, 100, 50, 30);
        button2.setBounds(170, 100, 50, 30);
        button3.setBounds(50, 150, 50, 30);
        button4.setBounds(110, 150, 50, 30);
        button5.setBounds(170, 150, 50, 30);
        button6.setBounds(50, 200, 50, 30);
        button7.setBounds(110, 200, 50, 30);
        button8.setBounds(170, 200, 50, 30);
        button9.setBounds(50, 250, 50, 30);
        buttonPlus.setBounds(110, 250, 50, 30);
        buttonMinus.setBounds(170, 250, 50, 30);
        buttonMultiply.setBounds(50, 300, 50, 30);
        buttonDivide.setBounds(110, 300, 50, 30);
        buttonEquals.setBounds(170, 300, 50, 30);

        frame.add(button0);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(buttonPlus);
        frame.add(buttonMinus);
        frame.add(buttonMultiply);
        frame.add(buttonDivide);
        frame.add(buttonEquals);

        buttonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                double result = evaluateExpression(input);
                textField.setText(result + "");
            }
        });
    }

    private double evaluateExpression(String input) {
        // code to evaluate the expression
        return 0;
    }

    public static void main(String[] args) {
        new Calculator().frame.setVisible(true);
    }
}
