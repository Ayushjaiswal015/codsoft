import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);

        JLabel heading = new JLabel("Okay, " + name + " The rules of this quiz are as follows:");
        heading.setBounds(10, 10, 900, 45);
        heading.setFont(new Font("Algerian", Font.BOLD, 20));
        heading.setForeground(new Color(148, 0, 211));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 900, 200);
        rules.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
        rules.setForeground(new Color(255, 250, 250));
        rules.setText(
            "<html>" +
            "1. Each question is of 1 mark." + "<br><br>" +
            "2. There will be 10 questions." + "<br><br>" +
            "3. You have only 15 seconds for each question." + "<br><br>" +
            "4. If you fail to select an option within 15 seconds then the next question will appear automatically." + "<br><br>" +
            "</html>"
        );
        add(rules);

        start = new JButton("Enter");
        start.setBounds(250, 400, 100, 30);
        start.setBackground(Color.CYAN);
        start.addActionListener(this);
        add(start);

        back = new JButton("Back");
        back.setBounds(400, 400, 100, 30);
        back.setBackground(Color.YELLOW);
        back.addActionListener(this);
        add(back);

        setSize(1000, 500); 
        setLocation(150, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
           setVisible(false); 
           new Quiz(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
            new App();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
