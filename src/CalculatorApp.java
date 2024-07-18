import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends JFrame {
    private JTextField firstNumberField, secondNumberField, resultField;
    private JButton  clearButton,addButton,subButton,mulButton,divButton,modButton;

    public CalculatorApp() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(5, 2, 10, 10));
        JLabel firstNumberLabel = new JLabel("First Number:");
        firstNumberField = new JTextField(100);
        JLabel secondNumberLabel = new JLabel("Second Number:");
        secondNumberField = new JTextField();
        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField();
        resultField.setEditable(false);
        addButton = new JButton("+");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(firstNumberField.getText());
                double secondNumber = Double.parseDouble(secondNumberField.getText());
                double result = firstNumber+secondNumber;
                resultField.setText(String.valueOf(result));
            }
        });
        subButton = new JButton("-");
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(firstNumberField.getText());
                double secondNumber = Double.parseDouble(secondNumberField.getText());
                double result = firstNumber - secondNumber;
                resultField.setText(String.valueOf(result));
            }
        });
        mulButton = new JButton("*");
        mulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(firstNumberField.getText());
                double secondNumber = Double.parseDouble(secondNumberField.getText());
                double result = firstNumber * secondNumber;
                resultField.setText(String.valueOf(result));
            }
        });
        divButton = new JButton("/");
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(firstNumberField.getText());
                double secondNumber = Double.parseDouble(secondNumberField.getText());
                double result = firstNumber / secondNumber;
                resultField.setText(String.valueOf(result));
            }
        });
        modButton = new JButton("%");
        modButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(firstNumberField.getText());
                double secondNumber = Double.parseDouble(secondNumberField.getText());
                double result = firstNumber % secondNumber;
                resultField.setText(String.valueOf(result));
            }
        });

        clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });
        add(firstNumberLabel);
        add(firstNumberField);
        add(secondNumberLabel);
        add(secondNumberField);
        add(resultLabel);
        add(resultField);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);
        add(modButton);
        add(clearButton);

        setVisible(true);
    }
    private void clearFields() {
        firstNumberField.setText("");
        secondNumberField.setText("");
        resultField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorApp();
            }
        });
    }
}
