
import java.util.Random;
//package com.mkyong.core;

import javax.swing.*;

public class Test {
    static private final Random rand = new Random();
    ImageIcon icon=new ImageIcon("book.jpg");
    private int arrayManager = 0;
    private int rand2;
    //ImageIcon icon;
    final String[] answer1 = {"option1 for Q1", "option2 for Q1", "option3 for Q1", "option4 for Q1"};
    final String[] answer2 = {"option1 for Q2", "option2 for Q2", "option3 for Q2", "option4for Q2"};
    final String[] answer3 = {"option1 for Q3", "option2 for Q3", "option3 for Q3", "option4 for Q3"};
    final String[] answer4 = {"option1 for Q4", "option2 for Q4", "option3 for Q4", "option4 for Q4"};
    static private int[] uniqeQuestion = {4, 4, 4, 4};
    static final String questions[] = {"Question1", "Questions2", "Question3", "Question4"};
    static final String wrongAnswers[] = {"No. Please try again", "Wrong. Try once more", "Don't give up!", "No. Keep trying"};
    static final String rightAnswers[] = {"Excellent!", "Good!", "Keep up the good work!", "Nice work!"};
    static private String checkAnswer, input;
    private boolean found = false;
    String answer;

    public void simulateQuestion() { //pick one of four questoins randomly
        for (arrayManager = 0; arrayManager < 4; ) {
            rand2 = rand.nextInt(4);
            for (int i : uniqeQuestion) { //check value to prevent reputation
                if (!(contains(uniqeQuestion, rand2))) {
                    answer = (String) JOptionPane.showInputDialog(null, questions[rand2],
                            "Question", JOptionPane.QUESTION_MESSAGE, icon, answer1, answer1[0]);
                    uniqeQuestion[arrayManager] = rand2; //store values to prevent reputation
                     checkAnswer(answer);
                     arrayManager++;
                }
            }
        }
    }




    public void checkAnswer(String checkAnswer) {
        if (checkAnswer == answer1[0])
            found = true;
        else if (checkAnswer == answer2[0])
            found = true;
        else if (checkAnswer == answer3[0])
            found = true;
        else if (checkAnswer == answer4[0])
            found = true;
        else found = false;

        generateMessage(found);
    }

    void generateMessage(boolean check) {
        if (check == true) {
            switch (rand2) {
                case 0:
                    input = rightAnswers[0];
                    JOptionPane.showMessageDialog(null, "Excellent!");
                    break;
                case 1:
                    input = rightAnswers[1];
                    JOptionPane.showMessageDialog(null, "Good!");
                    break;
                case 2:
                    input = rightAnswers[2];
                    JOptionPane.showMessageDialog(null, "Keep up the good work!");
                    break;
                case 3:
                    input = rightAnswers[3];
                    JOptionPane.showMessageDialog(null, "Nice Work!");
                    break;
            }
        } else if (check == false) {
            switch (rand2) {
                case 0:
                    input = wrongAnswers[0];
                    JOptionPane.showMessageDialog(null, "No. Please try again");
                    break;
                case 1:
                    input = wrongAnswers[1];
                    JOptionPane.showMessageDialog(null, "Wrong. Try once more");
                    break;
                case 2:
                    input = wrongAnswers[2];
                    JOptionPane.showMessageDialog(null, "Don't give up!");
                    break;
                case 3:
                    input = wrongAnswers[3];
                    JOptionPane.showMessageDialog(null, "No. Keep trying");
                    break;
            }
        }
    }


    public boolean contains(final int[] array, final int v) {

        boolean result = false;

        for (int i : array) {
            if (i == v) {
                result = true;
                break;
            }
        }
        return result;
    }

}



