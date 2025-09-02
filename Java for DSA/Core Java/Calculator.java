import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);

        Container container = frame.getContentPane();
        container.setLayout(new BorderLayout());

        JTextField display = new JTextField();
        display.setEditable(false);
        container.add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            panel.add(button);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();
                    if (command.charAt(0) == '=') {
                        try {
                            display.setText(eval(display.getText()));
                        } catch (Exception ex) {
                            display.setText("Error");
                        }
                    } else {
                        display.setText(display.getText() + command);
                    }
                }
            });
        }
        container.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
    private static String eval(String expression) {
        String[] tokens = expression.split("(?<=[-+*/])|(?=[-+*/])");
        double result = Double.parseDouble(tokens[0]);
        for (int i = 1; i < tokens.length; i += 2) {
            switch (tokens[i]) {
                case "+": result += Double.parseDouble(tokens[i + 1]); break;
                case "-": result -= Double.parseDouble(tokens[i + 1]); break;
                case "*": result *= Double.parseDouble(tokens[i + 1]); break;
                case "/": result /= Double.parseDouble(tokens[i + 1]); break;
            }
        }
        return String.valueOf(result);
    }
}
