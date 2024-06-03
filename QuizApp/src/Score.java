import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener {
    
    Score(String name, int score) {
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizimages/score.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,65,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 200 ,150);
        add(image);
        setLayout(null);

        getContentPane().setBackground(Color.BLACK);      
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);

        JLabel answers = new JLabel();
        answers.setBounds(20, 80, 400, 600);
        answers.setFont(new Font("Tahoma", Font.PLAIN, 10));
        answers.setForeground(new Color(255, 250, 250));
        answers.setText(
            "<html>" + 
            "The correct answers are as follows:" + "<br><br>" +
            "1. Which is used to find and fix bugs in the Java programs.?" + "<br><br>" +
            "JVM (wrong)" + "<br><br>" +
            "JDB (correct)" + "<br><br>" +
            "JDK (wrong)" + "<br><br>" +
            "JRE (wrong)" + "<br><br>" +
            "2. What is the return type of the hashCode() method in the Object class?" + "<br><br>" +
            "int (correct)" + "<br><br>" +
            "object (wrong)" + "<br><br>" +
            "long (wrong)" + "<br><br>" +
            "void (wrong)" + "<br><br>" +
            "3. Which package contains the Random class?" + "<br><br>" +
            "java.util package (correct)" + "<br><br>" +
            "java.lang package (wrong)" + "<br><br>" +
            "java.awt package (wrong)" + "<br><br>" +
            "java.io package (wrong)" + "<br><br>" +
            "4. An interface with no fields or methods is known as?" + "<br><br>" +
            "Runnable Interface (wrong)" + "<br><br>" +
            "Abstract Interface (wrong)" + "<br><br>" +
            "Marker Interface (correct)" + "<br><br>" +
            "CharSequance Interface (wrong)" + "<br><br>" +
            "</html>"
        );
        add(answers);

        JLabel answers1 = new JLabel();
        answers1.setBounds(450, 95, 400, 600);
        answers1.setFont(new Font("Tahoma", Font.PLAIN, 10));
        answers1.setForeground(new Color(255, 250, 250));
        answers1.setText(
            "<html>" +
            "5. In which memory a String is stored, when we create a string using new operator?" + "<br><br>" +
            "Stack (wrong)" + "<br><br>" +
            "String memory (wrong)" + "<br><br>" +
            "Random storage space (wrong)" + "<br><br>" +
            "Heap memory (correct)" + "<br><br>" +
            "6. Which of the following is a marker interface?" + "<br><br>" +
            "Runnable interface (wrong)" + "<br><br>" +
            "Remote interface (correct)" + "<br><br>" +
            "Readable interface (wrong)" + "<br><br>" +
            "Result interface (wrong)" + "<br><br>" +
            "7. Which keyword is used for accessing the features of a package?" + "<br><br>" +
            "import (correct)" + "<br><br>" +
            "package (wrong)" + "<br><br>" +
            "extends (wrong)" + "<br><br>" +
            "export (wrong)" + "<br><br>" +
            "8. In java, jar stands for?" + "<br><br>" +
            "Java Archive Runner (wrong)" + "<br><br>" +
            "Java Archive (correct)" + "<br><br>" +
            "Java Application Resource (wrong)" + "<br><br>" +
            "Java Application Runner (wrong)" + "<br><br>" +
            "</html>"
        );
        add(answers1);

        JLabel answers2 = new JLabel();
        answers2.setBounds(920, 70, 400, 400);
        answers2.setFont(new Font("Tahoma", Font.PLAIN, 10));
        answers2.setForeground(new Color(255, 250, 250));
        answers2.setText(
            "<html>" +
            "9. Which of the following is a mutable class in java?" + "<br><br>" +
            "Java.lang.StringBuilder (correct)" + "<br><br>" +
            "Java.lang.Short (wrong)" + "<br><br>" +
            "Java.lang.Byte (wrong)" + "<br><br>" +
            "Java.lang.String (wrong)" + "<br><br>" +
            "10. Which of the following option leads to the portability and security of Java?" + "<br><br>" +
            "Bytecode is executed by JVM (correct)" + "<br><br>" +
            "The applet makes the Java code secure and portable (wrong)" + "<br><br>" +
            "Use of exception handling (wrong)" + "<br><br>" +
            "Dynamic binding between objects (wrong)" + "<br><br>" +
            "</html>"
        );
        add(answers2);


        JLabel heading = new JLabel("Thankyou " + name + " for playing the quiz");
        heading.setBounds(20, 20,1000,30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 15));
        heading.setForeground(new Color(255, 250, 250));
        add(heading);

        JLabel lblscore = new JLabel("Your score is: " + score);
        lblscore.setBounds(150, 65,200,30);
        lblscore.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblscore.setForeground(new Color(255, 250, 250));
        add(lblscore);

        JButton submit = new JButton("Play Again");
        submit.setBounds(300, 70, 100, 24);
        submit.setBackground(Color.CYAN);
        submit.setForeground(Color.BLACK);
        submit.addActionListener(this);
        add(submit);
    }
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new App();
   
       }

    public static void main(String[] args) {
        new Score("User", 0);
        
    }
}
