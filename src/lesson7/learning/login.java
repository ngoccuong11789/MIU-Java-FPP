package lesson7.learning;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    private JLabel loginLbl;
    private JTextField txtUserName;
    private JTextField txtPassword;
    private JButton loginbtn;
    private JLabel username;
    private JLabel lblPassword;
    private JPanel mypanel;

    public login() {
        mypanel = new JPanel(); // Initialize the panel
        mypanel.setLayout(new GridLayout(6, 2)); // Set a layout for the panel

//        loginLbl = new JLabel("Login Form", SwingConstants.CENTER);
//        username = new JLabel("Username:");
//        txtUserName = new JTextField();
//        lblPassword = new JLabel("Password:");
        //txtPassword = new JPasswordField();
//        loginbtn = new JButton("Login");

        mypanel.add(username);
        mypanel.add(txtUserName);
        mypanel.add(lblPassword);
        mypanel.add(txtPassword);
        mypanel.add(loginbtn);

        setContentPane(mypanel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Login Form");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setResizable(false);
//        mypanel = new JPanel();
//        mypanel.setLayout(new GridLayout(3, 2));
//        setContentPane(mypanel);
        loginbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String UserName = txtUserName.getText();
                //char[] pwd = txtPassword.getCursor();
                String Password = txtPassword.getText();
                if(UserName.isEmpty() || Password.isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Please enter both username and password", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (UserName.equals("admin") && Password.equals("123")) {
                    JOptionPane.showMessageDialog(null, "Login Successful!", "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                login mn = new login();
            }
        });
    }
}
