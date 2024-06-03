import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GradeCalculator extends JFrame implements ActionListener {
    private JTextField[] subjectFields;
    private JButton calculateButton;
    private JLabel totalMarksLabel, averagePercentageLabel, gradeLabel;

    public GradeCalculator() {
        setTitle("Grade Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(0, 2));

        subjectFields = new JTextField[5];
        for (int i = 0; i < subjectFields.length; i++) {
            add(new JLabel("Subject " + (i + 1) + ": "));
            subjectFields[i] = new JTextField(10);
            add(subjectFields[i]);
        }

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton);

        totalMarksLabel = new JLabel("Total Marks: ");
        add(totalMarksLabel);

        averagePercentageLabel = new JLabel("Average Percentage: ");
        add(averagePercentageLabel);

        gradeLabel = new JLabel("Grade: ");
        add(gradeLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new GradeCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            int totalMarks = 0;
            int numSubjects = 0;
            for (int i = 0; i < subjectFields.length; i++) {
                try {
                    int marks = Integer.parseInt(subjectFields[i].getText());
                    totalMarks += marks;
                    numSubjects++;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Invalid input for subject " + (i + 1));
                    return;
                }
            }

            if (numSubjects == 0) {
                JOptionPane.showMessageDialog(this, "No subjects entered");
                return;
            }
           
            double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;
            if (totalMarks <= 500) {
            totalMarksLabel.setText("Total Marks: " + totalMarks);
            }
            else {
                totalMarksLabel.setText("wrong Input");
            }
            if (averagePercentage <= 100) {
            averagePercentageLabel.setText("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
            }
            else {
                averagePercentageLabel.setText("Wrong Input");
            }
            
            
            String grade;
            if (averagePercentage >100) {
               grade = "Wrong Input";
            } else if (averagePercentage >= 90) {
                grade = "A";
            } else if (averagePercentage >= 80) {
                grade = "B";
            } else if (averagePercentage >= 70) {
                grade = "C";
            } else if (averagePercentage >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            gradeLabel.setText("Grade: " + grade);
        }
    }
}
