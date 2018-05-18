package me.tocertify.getcertified.domain;

import java.io.Serializable;

public class Question implements Serializable {

    private static final long serialVersionUID = 1L;

    private int questionId;
    private String questionText;
    private int examId;

    public Question() { super(); }

    public Question(int questionId, String questionText, int examId) {
        this.questionId = questionId;
        this.questionText = questionText;
        this.examId = examId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    @Override
    public boolean equals(Object obj) {
        boolean flag = false;
        Question question = (Question) obj;
        if (question.questionId == questionId)
            flag = true;

        return flag;
    }

    @Override
    public int hashCode() {
        return questionId;
    }
}
