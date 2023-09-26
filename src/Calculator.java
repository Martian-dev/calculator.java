import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    static JFrame frame;
    static JTextField txf;
    static JPanel panel;

    static JButton[] numberButtons = new JButton[10];
    static JButton[] functionButtons = new JButton[7];
    static JButton addButton, subButton, divButton, multiButton, equButton, clrButton, delButton;
    static JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;

    static char operation;
    static double num1;
    static double num2;

    public static void main(String[] args) {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);

        txf = new JTextField();
        txf.setBounds(50, 25, 300, 50);
        txf.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        multiButton = new JButton("x");
        divButton = new JButton("/");
        equButton = new JButton("=");
        clrButton = new JButton("AC");
        delButton = new JButton("del");

        functionButtons[0] = addButton;
        addButton.addActionListener(new Calculator());
        functionButtons[1] = subButton;
        subButton.addActionListener(new Calculator());
        functionButtons[2] = multiButton;
        multiButton.addActionListener(new Calculator());
        functionButtons[3] = divButton;
        divButton.addActionListener(new Calculator());
        functionButtons[4] = equButton;
        equButton.addActionListener(new Calculator());
        functionButtons[5] = clrButton;
        clrButton.addActionListener(new Calculator());
        functionButtons[6] = delButton;
        delButton.addActionListener(new Calculator());


        button1 = new JButton("1");
        button1.addActionListener(new Calculator());

        button2 = new JButton("2");
        button2.addActionListener(new Calculator());

        button3 = new JButton("3");
        button3.addActionListener(new Calculator());

        button4 = new JButton("4");
        button4.addActionListener(new Calculator());

        button5 = new JButton("5");
        button5.addActionListener(new Calculator());

        button6 = new JButton("6");
        button6.addActionListener(new Calculator());

        button7 = new JButton("7");
        button7.addActionListener(new Calculator());

        button8 = new JButton("8");
        button8.addActionListener(new Calculator());

        button9 = new JButton("9");
        button9.addActionListener(new Calculator());

        button0 = new JButton("0");
        button0.addActionListener(new Calculator());

        numberButtons[0] = button0;
        numberButtons[1] = button1;
        numberButtons[2] = button2;
        numberButtons[3] = button3;
        numberButtons[4] = button4;
        numberButtons[5] = button5;
        numberButtons[6] = button6;
        numberButtons[7] = button7;
        numberButtons[8] = button8;
        numberButtons[9] = button9;

        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);

        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4, 4, 10,10));

        for (int i = 1; i<=3; i++) {
            panel.add(numberButtons[i]);
        }

        panel.add(addButton);

        for (int i = 4; i<=6; i++) {
            panel.add(numberButtons[i]);
        }

        panel.add(subButton);

        for (int i = 7; i<=9; i++) {
            panel.add(numberButtons[i]);
        }

        panel.add(multiButton);
        panel.add(new JButton());
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(delButton);
        frame.add(clrButton);
        frame.add(txf);
        frame.add(panel);

        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(txf.getText());
            txf.setText("");
            operation = '+';
        }
        else if (e.getSource() == subButton) {
            num1 = Double.parseDouble(txf.getText());
            txf.setText("");
            operation = '-';
        }
        else if (e.getSource() == multiButton) {
            num1 = Double.parseDouble(txf.getText());
            txf.setText("");
            operation = '*';
        }
        else if (e.getSource() == divButton) {
            num1 = Double.parseDouble(txf.getText());
            txf.setText("");
            operation = '/';
        }
        else if (e.getSource() == clrButton) {
            txf.setText("");
        }
        else if (e.getSource() == delButton) {
            String currentText = txf.getText();
            txf.setText("");
            for (int i =0; i<currentText.length()-1; i++) {
                String currentInnerText = txf.getText();
                txf.setText(currentInnerText + currentText.charAt(i));
            }
        }
        else if (e.getSource() == equButton) {
            num2 = Double.parseDouble(txf.getText());
            switch (operation) {
                case '+':
                    txf.setText(Double.toString(num1+num2));
                    break;

                case '-':
                    txf.setText(Double.toString(num1-num2));
                    break;

                case '*':
                    txf.setText(Double.toString(num1*num2));
                    break;

                case '/':
                    txf.setText(Double.toString(num1/num2));
                    break;

                default:
                    break;
            }
        }

        else {
            for (int i = 0; i<10; i++) {
                if (e.getSource() == numberButtons[i]) {
                    String currentText = txf.getText();
                    txf.setText(currentText + i);
                }
            }
        }

    }
}
