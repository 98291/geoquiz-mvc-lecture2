package edu.cmu.stuco.android.geoquiz;

public class Question {
    private int question;
    private boolean answer;

    public Question(int question, boolean answer) {
        this.question = question;
        this.answer = answer;
    }

    public int getQuestion() {
        return question;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setQuestion(int question) {
        this.question = question;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

}
