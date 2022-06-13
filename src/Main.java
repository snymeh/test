
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        ImageIcon icon=new ImageIcon("book.jpg");

        String n;
        Test test = new Test();


        n = (String) JOptionPane.showInputDialog(null, test.n[0],
                "1st Question", JOptionPane.QUESTION_MESSAGE, icon, test.answer1, test.answer1[0]);
        n = (String) JOptionPane.showInputDialog(null, test.n[1],
                "2nt Question", JOptionPane.QUESTION_MESSAGE, icon, test.answer2, test.answer2[0]);
        n = (String) JOptionPane.showInputDialog(null, test.n[2],
                "1st Question", JOptionPane.QUESTION_MESSAGE, icon, test.answer3, test.answer3[0]);
        n = (String) JOptionPane.showInputDialog(null, test.n[3],
                "1st Question", JOptionPane.QUESTION_MESSAGE, icon, test.answer4, test.answer4[0]);

        JOptionPane.showMessageDialog(null, "Excellent!");
        JOptionPane.showMessageDialog(null, "Good!");
        JOptionPane.showMessageDialog(null, "Keep up the good work!");
        JOptionPane.showMessageDialog(null, "Nice work!");

        JOptionPane.showMessageDialog(null, "No. Please try again");
        JOptionPane.showMessageDialog(null, "Wrong. Try once more");
        JOptionPane.showMessageDialog(null, "Don't give up!");
        JOptionPane.showMessageDialog(null, "No. Keep trying");

        test.simulateQuestion();


    }
}