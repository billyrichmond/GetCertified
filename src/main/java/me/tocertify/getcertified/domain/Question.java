package me.tocertify.getcertified.domain;

import java.io.Serializable;

public class Question implements Serializable {

    private static final long serialVersionUID = 1L;

    private int questionId;
    private String questionText;
    private int examId;
    private int questionTypeId;
    private String imagePath;

    public Question() { super(); }

    public Question (int questionId, String questionText,
                     int examId, int questionTypeId,
                     String imagePath) {
        this.questionId = questionId;
        this.questionText = questionText;
        this.questionTypeId = questionTypeId;
        this.imagePath = imagePath;
    }

    /* Implement getters and setters */

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





