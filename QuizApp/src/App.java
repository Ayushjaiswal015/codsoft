import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame implements ActionListener {

    JButton enter, back;
    JTextField tfname;

    App() {
        getContentPane().setBackground(Color.BLACK);

        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizimages/Login.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 650, 500);
        add(image);

        JLabel heading = new JLabel("HELLO!!");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Algerian", Font.BOLD, 40));
        heading.setForeground(new Color(148, 0, 211));
        add(heading);

        JLabel name = new JLabel("Enter your name:");
        name.setBounds(730, 150, 300, 20);
        name.setFont(new Font("Algerian", Font.BOLD, 20));
        name.setForeground(new Color(255, 250, 250));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(700, 200, 250, 18);
        tfname.setFont(new Font ("Algerian", Font.BOLD, 15));
        add(tfname);

        enter = new JButton("Enter");
        enter.setBounds(700, 250, 115, 25);
        enter.setBackground(Color.CYAN);
        enter.addActionListener(this);
        add(enter);

        back = new JButton("Back");
        back.setBounds(835, 250, 115, 25);
        back.setBackground(Color.YELLOW);
        back.addActionListener(this);
        add(back);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 500);
        setLocation(150, 100);

       
    }
    public static void main(String[] args) {
        new App();
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == enter) {
          String name = tfname.getText();
          setVisible(false);
          new Rules(name);

        } else if (ae.getSource() == back) {
          setVisible(false);
        }
     }

}
