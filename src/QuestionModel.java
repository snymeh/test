public class QuestionModel {

    private String appName;
    private String Question;
    private String[] answerList;
    private String correctAnswer;


    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String[] getAnswerList() {
        return answerList;
    }

    public void setAnswerList(String[] answerList) {
        this.answerList = answerList;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public boolean isAnswerCorrect(String answer) {
        return correctAnswer.equals(answer);
    }
}
