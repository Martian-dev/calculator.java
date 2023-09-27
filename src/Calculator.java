import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    static JFrame frame;
    static JTextField txf;
    static JPanel panel;
    static JPanel historyP;

    static JButton[] numberButtons = new JButton[10];
    static JButton[] functionButtons = new JButton[20];
    static JButton addButton, subButton, divButton,
            multiButton, sqButton, sqrtButton, powButton,
            equButton, clrButton, delButton, sinButton, cosButton, tanButton,
            logbutton, lnbutton, asinbutton, acosbutton, atanbutton,
            epowButton, xrootButton;
    static JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
    static JButton piButton;
    static JButton dotButton;
    static JToggleButton histButton;

    static char operation;
    static double num1;
    static double num2;
    static double sngl;
    static String ans;

    public static void main(String[] args) {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(920, 620);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setTitle("Calculator Da");

        txf = new JTextField();
        txf.setBounds(50, 25, 450, 50);
        txf.setEditable(false);
        txf.setBackground(Color.gray);
        txf.setForeground(Color.white);
        txf.setFont(new Font("Times New Roman", Font.BOLD, 22));

        addButton = new JButton("+");
        subButton = new JButton("-");
        multiButton = new JButton("x");
        divButton = new JButton("/");
        sqButton = new JButton("x^2");
        sqrtButton = new JButton("√");
        powButton = new JButton("^");
        equButton = new JButton("=");
        clrButton = new JButton("AC");
        delButton = new JButton("del");
        sinButton = new JButton("sin");
        cosButton = new JButton("cos");
        tanButton = new JButton("tan");
        logbutton = new JButton("log");
        lnbutton = new JButton("ln");
        asinbutton = new JButton("asin");
        atanbutton = new JButton("atan");
        acosbutton = new JButton("acos");
        epowButton = new JButton("e");
        xrootButton = new JButton("x√y");

        functionButtons[0] = addButton;
        addButton.addActionListener(new Calculator());
        functionButtons[1] = subButton;
        subButton.addActionListener(new Calculator());
        functionButtons[2] = multiButton;
        multiButton.addActionListener(new Calculator());
        functionButtons[3] = divButton;
        divButton.addActionListener(new Calculator());
        functionButtons[5] = sqButton;
        sqButton.addActionListener(new Calculator());
        functionButtons[6] = sqrtButton;
        sqrtButton.addActionListener(new Calculator());
        functionButtons[7] = powButton;
        powButton.addActionListener(new Calculator());
        functionButtons[4] = equButton;
        equButton.addActionListener(new Calculator());
        functionButtons[8] = clrButton;
        clrButton.addActionListener(new Calculator());
        functionButtons[9] = delButton;
        delButton.addActionListener(new Calculator());
        functionButtons[10] = sinButton;
        sinButton.addActionListener(new Calculator());
        functionButtons[11] = cosButton;
        cosButton.addActionListener(new Calculator());
        functionButtons[12] = tanButton;
        tanButton.addActionListener(new Calculator());
        functionButtons[13] = asinbutton;
        asinbutton.addActionListener(new Calculator());
        functionButtons[14] = acosbutton;
        acosbutton.addActionListener(new Calculator());
        functionButtons[15] = atanbutton;
        atanbutton.addActionListener(new Calculator());
        functionButtons[16] = logbutton;
        logbutton.addActionListener(new Calculator());
        functionButtons[17] = lnbutton;
        lnbutton.addActionListener(new Calculator());
        functionButtons[18] = epowButton;
        epowButton.addActionListener(new Calculator());
        functionButtons[19] = xrootButton;
        xrootButton.addActionListener(new Calculator());

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

        dotButton = new JButton(".");
        dotButton.addActionListener(new Calculator());

        piButton = new JButton("π");
        piButton.addActionListener(new Calculator());

        histButton = new JToggleButton("hist");
        histButton.addActionListener(new Calculator());

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

        delButton.setBounds(50, 420, 154, 50);
        clrButton.setBounds(213, 420, 154, 50);
        histButton.setBounds(376, 420, 123, 50);
        panel = new JPanel();
        panel.setBounds(50,100,450,300);
        panel.setLayout(new GridLayout(5, 6, 10,10));
        panel.setBackground(Color.DARK_GRAY);

        historyP = new JPanel();
        historyP.setBounds(550,100,300,300);

//        historyP.setForeground(Color.black);
        historyP.setBackground(Color.gray);
        historyP.setVisible(false);

        for (int i = 1; i<=3; i++) {
            panel.add(numberButtons[i]);
        }

        panel.add(addButton);
        panel.add(sinButton);
        panel.add(asinbutton);


        for (int i = 4; i<=6; i++) {
            panel.add(numberButtons[i]);
        }

        panel.add(subButton);
        panel.add(cosButton);
        panel.add(acosbutton);

        for (int i = 7; i<=9; i++) {
            panel.add(numberButtons[i]);
        }

        panel.add(multiButton);
        panel.add(tanButton);
        panel.add(atanbutton);

        panel.add(dotButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);
        panel.add(piButton);
        panel.add(logbutton);

        panel.add(sqButton);
        panel.add(sqrtButton);
        panel.add(powButton);
        panel.add(xrootButton);
        panel.add(epowButton);
        panel.add(lnbutton);

        frame.add(delButton);
        frame.add(clrButton);
        frame.add(histButton);
        frame.add(txf);
        frame.add(panel);
        frame.add(historyP);

        ItemListener itemListener = new ItemListener() {
            public void itemStateChanged(ItemEvent itemEvent) {

                // event is generated in button
                int state = itemEvent.getStateChange();

                // if selected print selected in console
                // else print deselected in console
                historyP.setVisible(state == ItemEvent.SELECTED);
            }
        };

        addButton.setBackground(new Color(201, 197, 183));
        subButton.setBackground(new Color(201, 197, 183));
        multiButton.setBackground(new Color(201, 197, 183));
        divButton.setBackground(new Color(201, 197, 183));
        powButton.setBackground(new Color(201, 197, 183));
        epowButton.setBackground(new Color(201, 197, 183));
        sqrtButton.setBackground(new Color(201, 197, 183));
        sqButton.setBackground(new Color(201, 197, 183));
        equButton.setBackground(new Color(201, 197, 183));
        delButton.setBackground(new Color(201, 197, 183));
        clrButton.setBackground(new Color(201, 197, 183));
        xrootButton.setBackground(new Color(201, 197, 183));
        piButton.setBackground(new Color(201, 197, 183));
        sinButton.setBackground(new Color(201, 197, 183));
        cosButton.setBackground(new Color(201, 197, 183));
        tanButton.setBackground(new Color(201, 197, 183));
        asinbutton.setBackground(new Color(201, 197, 183));
        acosbutton.setBackground(new Color(201, 197, 183));
        atanbutton.setBackground(new Color(201, 197, 183));
        logbutton.setBackground(new Color(201, 197, 183));
        lnbutton.setBackground(new Color(201, 197, 183));
        dotButton.setBackground(new Color(201, 197, 183));
        histButton.setBackground(new Color(201, 197, 183));

        for (JButton i : numberButtons) {
            i.setBackground(new Color(201, 197, 183));
        }

        histButton.addItemListener(itemListener);

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
        else if (e.getSource() == powButton) {
            num1 = Double.parseDouble(txf.getText());
            txf.setText("");
            operation = '^';
        }
        else if (e.getSource() == xrootButton) {
            num1 = Double.parseDouble(txf.getText());
            txf.setText("");
            operation = 'r';
        }
        else if (e.getSource() == dotButton) {
            txf.setText(txf.getText() + ".");
        }
        else if (e.getSource() == sqButton) {
            sngl = Double.parseDouble(txf.getText());
            txf.setText(Double.toString(sngl * sngl));
            history();
        }
        else if (e.getSource() == sqrtButton) {
            sngl = Double.parseDouble(txf.getText());
            txf.setText(Double.toString(Math.sqrt(sngl)));
            history();
        }
        else if (e.getSource() == sinButton) {
            sngl = Double.parseDouble(txf.getText());
            txf.setText(Double.toString(Math.sin(Math.toRadians(sngl))));
            history();
        }
        else if (e.getSource() == cosButton) {
            sngl = Double.parseDouble(txf.getText());
            txf.setText(Double.toString(Math.cos(Math.toRadians(sngl))));
            history();
        }
        else if (e.getSource() == tanButton) {
            sngl = Double.parseDouble(txf.getText());
            txf.setText(Double.toString(Math.tan(Math.toRadians(sngl))));
            history();
        }
        else if (e.getSource() == asinbutton) {
            sngl = Double.parseDouble(txf.getText());
            txf.setText(Double.toString((Math.toDegrees(Math.asin(sngl)))));
            history();
        }
        else if (e.getSource() == acosbutton) {
            sngl = Double.parseDouble(txf.getText());
            txf.setText(Double.toString((Math.toDegrees(Math.acos(sngl)))));
            history();
        }
        else if (e.getSource() == atanbutton) {
            sngl = Double.parseDouble(txf.getText());
            txf.setText(Double.toString((Math.toDegrees(Math.atan(sngl)))));
            history();
        }
        else if (e.getSource() == logbutton) {
            sngl = Double.parseDouble(txf.getText());
            if (sngl == 0) {
                txf.setText("Invalid Input");
            }
            else {
                txf.setText(Double.toString(Math.log10(sngl)));
                history();
            }
        }
        else if (e.getSource() == lnbutton) {
            sngl = Double.parseDouble(txf.getText());
            if (sngl == 0) {
                txf.setText("Invalid Input");
            }
            else {
                txf.setText(Double.toString(Math.log(sngl)));
                history();
            }
        }
        else if (e.getSource() == epowButton) {
            txf.setText(Double.toString(Math.E));
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
        else if (e.getSource() == piButton) {
            if (!txf.getText().isEmpty()) {
                num1 = Double.parseDouble(txf.getText());
                txf.setText(Double.toString(num1*Math.PI));
            }
            else {
                txf.setText(Double.toString(Math.PI));
            }
        }
        else if (e.getSource() == equButton) {
            num2 = Double.parseDouble(txf.getText());
            switch (operation) {
                case '+':
                    txf.setText(Double.toString(num1+num2));
                    operation = ' ';
                    break;

                case '-':
                    txf.setText(Double.toString(num1-num2));
                    operation = ' ';
                    break;

                case '*':
                    txf.setText(Double.toString(num1*num2));
                    operation = ' ';
                    break;

                case '/':
                    if (num2 == 0) {
                        txf.setText("Cannot Divide By Zero");
                        break;
                    }
                    txf.setText(Double.toString(num1/num2));
                    operation = ' ';
                    break;

                case '^':
                    txf.setText(Double.toString(Math.pow(num1, num2)));
                    operation = ' ';
                    break;

                case 'r':
                    txf.setText(Double.toString(Math.pow(num2, 1/num1)));
                    operation = ' ';
                    break;

                default:
                    break;
            }
            history();

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

    public void history() {
        ans = txf.getText();
        JLabel history = new JLabel();
        JLabel spacefiller = new JLabel("------------------------------------------------------------------------------------------------------------------------------------------");
        historyP.add(history);
        historyP.add(spacefiller);
        history.setText(ans);
        history.setFont(new Font("Times New Roman", Font.BOLD, 16));
        history.setBounds(560, 110, 300, 300);
        spacefiller.setBounds(560, 115, 300, 300);
        spacefiller.setForeground(Color.gray);
        history.setForeground(Color.white);
    }
}
