/*import javax.swing.*;
public class LoginForm {
    public static void main(String[] args) {
        JFrame fr = new JFrame("Login");
        JTextField ut = new JTextField(15);
        JPasswordField pt = new JPasswordField(15);
        JButton lb = new JButton("Login");

        lb.addActionListener(e -> {
            String user = ut.getText();
            String pass = new String(pt.getPassword());
            if ("admin".equals(user) && "password".equals(pass)) {
                JOptionPane.showMessageDialog(fr, "Welcome, " + user + "!");
            } else {
                JOptionPane.showMessageDialog(fr, "Invalid login.");
            }
        });

        JPanel    p = new JPanel();
        p.add(new JLabel("Username:"));
        p.add(ut);
        p.add(new JLabel("Password:"));
        p.add(pt);
        p.add(lb);
        
        fr.add(p);
        fr.setSize(250, 150);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}*/

import java.awt.event.*;
import javax.swing.*;
public class LoginForm {
    public static void main(String[] args) {
        JFrame fr = new JFrame("Login Form");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 150);

        JPanel p = new JPanel();
        fr.add(p);
        placeComponents(p);

        fr.setVisible(true);
    }

    private static void placeComponents(JPanel p) {
        p.setLayout(null);

        JLabel ul = new JLabel("Username:");
        ul.setBounds(10, 20, 80, 25);
        p.add(ul);

        JTextField ut = new JTextField(20);
        ut.setBounds(100, 20, 165, 25);
        p.add(ut);

        JLabel pl = new JLabel("Password:");
        pl.setBounds(10, 50, 80, 25);
        p.add(pl);

        JPasswordField pt = new JPasswordField(20);
        pt.setBounds(100, 50, 165, 25);
        p.add(pt);

        JButton lb = new JButton("Login");
        lb.setBounds(10, 80, 80, 25);
        p.add(lb);

        JLabel ml = new JLabel("");
        ml.setBounds(100, 80, 200, 25);
        p.add(ml);

        lb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = ut.getText();
                String password = new String(pt.getPassword());

                if ("admin".equals(username) && "password".equals(password)) {
                    ml.setText("Welcome, " + username + "!");
                } else {
                    ml.setText("Invalid login. Try again.");
                }
            }
        });
    }
}
