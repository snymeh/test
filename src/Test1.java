import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Test1 {

    private final ArrayList<QuestionModel> questionList = new ArrayList<>();

    private double score;

    static final String[] wrongAnswers = {"No. Please try again", "Wrong. Try once more", "Don't give up!", "No. Keep trying"};
    static final String[] rightAnswers = {"Excellent!", "Good!", "Keep up the good work!", "Nice work!"};

    public Test1() {
        fillQuestionModel();
    }

    public void fillQuestionModel() {

        QuestionModel questionModel1 = new QuestionModel();
        questionModel1.setAppName("Question 1");
        questionModel1.setQuestion("What is Question 1");
        questionModel1.setAnswerList(new String[]{"1++", "2", "3"});
        questionModel1.setCorrectAnswer("1++");

        questionList.add(questionModel1);

        QuestionModel questionModel2 = new QuestionModel();
        questionModel2.setAppName("Question 2");
        questionModel2.setQuestion("What is Question 2");
        questionModel2.setAnswerList(new String[]{"2++", "2", "3"});
        questionModel2.setCorrectAnswer("2++");

        questionList.add(questionModel2);

        QuestionModel questionModel3 = new QuestionModel();
        questionModel3.setAppName("Question 3");
        questionModel3.setQuestion("What is Question 3");
        questionModel3.setAnswerList(new String[]{"3++", "2", "3"});
        questionModel3.setCorrectAnswer("3++");

        questionList.add(questionModel3);

        QuestionModel questionModel4 = new QuestionModel();
        questionModel4.setAppName("Question 4");
        questionModel4.setQuestion("What is Question 4");
        questionModel4.setAnswerList(new String[]{"4++", "2", "3"});
        questionModel4.setCorrectAnswer("4++");

        questionList.add(questionModel4);


        QuestionModel questionModel5 = new QuestionModel();
        questionModel5.setAppName("Question 5");
        questionModel5.setQuestion("What is Question 5");
        questionModel5.setAnswerList(new String[]{"5++", "2", "3"});
        questionModel5.setCorrectAnswer("5++");

        questionList.add(questionModel5);
    }


    public void simulateQuestion() {

        int[] questionsIndexNotAsked = {0, 1, 2, 3, 4};

        while (questionsIndexNotAsked.length != 0) {


            int index = new Random().nextInt(questionsIndexNotAsked.length);
            int randomQuestionIndex = questionsIndexNotAsked[index];

            String chosenAnswer = showJOptionPane(randomQuestionIndex);

            if (questionList.get(randomQuestionIndex).isAnswerCorrect(chosenAnswer)) {
                score++;
                JOptionPane.showMessageDialog(null, rightAnswers[new Random().nextInt(rightAnswers.length)]);
            } else {
                JOptionPane.showMessageDialog(null, wrongAnswers[new Random().nextInt(wrongAnswers.length)]);
            }

            questionsIndexNotAsked = removeTheElement(questionsIndexNotAsked, index);

        }

        JOptionPane.showMessageDialog(null,
                "You Scored "
                        + (int) score
                        + " Correct and "
                        + (questionList.size() - (int) score)
                        + " Incorrect that is " + ((score / questionList.size()) * 100) + "%");

    }


    public String showJOptionPane(int randomIndex) {

        return (String) JOptionPane.showInputDialog(null, questionList.get(randomIndex).getQuestion(), questionList.get(randomIndex).getAppName(), JOptionPane.QUESTION_MESSAGE, new ImageIcon("book.jpg"), questionList.get(randomIndex).getAnswerList(), questionList.get(randomIndex).getCorrectAnswer());
    }


    public int[] removeTheElement(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }

        int[] anotherArray = new int[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {

            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }
}
