import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField StName_txt;
    private JTextField Mrk1_txt;
    private JTextField Mrk2_txt;
    private JTextField Mrk3_txt;
    private JTextField Totl_txt;
    private JTextField Avg_txt;
    private JButton calculateButton;
    private JTextField Grd_txt;
    private JPanel Main;
    private JButton clearButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                int m1,m2,m3;
                double avg;
                int tot;

                m1 = Integer.parseInt(Mrk1_txt.getText());
                m2 = Integer.parseInt(Mrk2_txt.getText());
                m3 = Integer.parseInt(Mrk3_txt.getText());


                tot = m1 + m2 + m3;
                Totl_txt.setText(String.valueOf(tot));

                avg = tot/3;
                Avg_txt.setText(String.valueOf(avg));

                if (avg >= 70){
                    Grd_txt.setText("Higher Distinction");

                   } else if (avg >= 65 ) {
                    Grd_txt.setText("Merit");
                } else if (avg >= 40 ) {
                    Grd_txt.setText("pass");
                }else {
                    Grd_txt.setText("Fail");
                }

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                StName_txt.setText(null);
                Mrk1_txt.setText(null);
                Mrk2_txt.setText(null);
                Mrk3_txt.setText(null);
                Totl_txt.setText(null);
                Avg_txt.setText(null);
                Grd_txt.setText(null);
            }
        });
    }
}
