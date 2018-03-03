package me.tocertify.getcertified.domain;

import java.io.Serializable;

public class ExamQuestion implements Serializable {

    private static final long serialVersionUID = 1L;

    private int questionId;
    private String questionText;
    private int examId;
    private int questionTypeId;
    private String imagePath;

    public ExamQuestion() { super(); }

    public ExamQuestion(String test) {
        this.questionText = test;
    }

    public ExamQuestion(int questionId, String questionText,
                        int examId, int questionTypeId,
                        String imagePath) {
        this.questionId = questionId;
        this.questionText = questionText;
        this.questionTypeId = questionTypeId;
        this.imagePath = imagePath;
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

    public int getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(int questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public boolean equals(Object obj) {
        boolean flag = false;
        ExamQuestion question = (ExamQuestion) obj;
        if (question.questionId == questionId)
            flag = true;

        return flag;
    }

    @Override
    public int hashCode() {
        return questionId;
    }
}





