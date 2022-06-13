
import java.util.Random;
//package com.mkyong.core;

import javax.swing.ImageIcon;

public class Test {
    static private final Random rand = new Random();
    private int arrayManager = 0;
    private int rand2 ;
    //ImageIcon icon;
    static final  String[] answer1 = {"option1", "option2", "option3", "option4"};
    static final String[] answer2 = {"option1", "option2", "option3", "option4"};
    static final String[] answer3 = {"option1", "option2", "option3", "option4"};
    static final String[] answer4 = {"option1", "option2", "option3", "option4"};
    static private int[] gen = {4, 4, 4, 4};
    static final String n[] = {"Question1", "Questions2", "Question3", "Question4"};
    static final String wrongAnswers[] = {"No. Please try again", "Wrong. Try once more", "Don't give up!", "No. Keep trying"};
    static final String rightAnswers[] = {"Excellent!", "Good!", "Keep up the good work!", "Nice work!"};
    static private  String checkAnswer, input;
    private boolean found = false;

    public void simulateQuestion() { //pick one of four questoins randomly
        for (arrayManager = 0; arrayManager < 4; ) {
            rand2 = rand.nextInt(4);
            for (int i : gen) { //check value to prevent reputation
                if (!(contains(gen, rand2))) {
                    gen[arrayManager] = rand2;             //store values to prevent reputation
                    inputAnswer(rand2);
                }
            }
        }
    }

    void inputAnswer(int i) {
        switch (i) {
            case 1:
                checkAnswer();
                arrayManager++;
            case 2:
                checkAnswer();
                arrayManager++;
            case 3:
                checkAnswer();
                arrayManager++;
            case 4:
                checkAnswer();
                arrayManager++;
        }
    }

    public void checkAnswer() {
        if (checkAnswer == answer1[1])
            found = true;
        else if (checkAnswer == answer2[2])
            found = true;
        else if (checkAnswer == answer3[3])
            found = true;
        else if (checkAnswer == answer4[4])
            found = true;
        else found = false;

        generateMessage(found);
    }

    void generateMessage(boolean check) {
        if (check == true) {
            switch (rand2) {
                case 0:
                    input = rightAnswers[0];
                case 1:
                    input = rightAnswers[1];
                case 2:
                    input = rightAnswers[2];
                case 3:
                    input = rightAnswers[3];
            }
        }
        if (check == false) {
            switch (rand2) {
                case 0:
                    input = wrongAnswers[0];
                case 1:
                    input = wrongAnswers[1];
                case 2:
                    input = wrongAnswers[2];
                case 3:
                    input = wrongAnswers[3];
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



